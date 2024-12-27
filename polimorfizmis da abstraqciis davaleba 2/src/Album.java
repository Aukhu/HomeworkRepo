public class Album {
    private String name;
    private int releaseYear;
    private Music[] musics = new Music[10];
    private int index = 0;

    public Album(String name, int releaseYear) {
        this.name = name;
        this.releaseYear = releaseYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public Music[] getMusics() {
        return musics;
    }

    public void addMusic(Music music){
        if(index>=musics.length){
            increaseMusicsSize();
        }
        musics[index++] = music;

        System.out.println(music.getTitle() + " has been added to the album");
    }

    public void removeMusic(Music music){
        for (int i = 0; i < index; i++) {
            if (musics[i].equals(music)) {
                for (int j = i; j < index - 1; j++) {
                    musics[j] = musics[j + 1];
                }
                musics[--index] = null;
                System.out.println(music.getTitle() + " removed from the album " + name);
                return;
            }
        }

        System.out.println(music.getTitle() + " not found in this album.");
    }

    public void displayInfo(){
        System.out.println("Album name: "+name);

        for(Music music : musics){
            if(music != null){
                music.displayInfo();
                System.out.println();
            }
        }
    }


    private void increaseMusicsSize(){
        Music[] newMusics = new Music[musics.length+1];

        for(int i = 0; i< musics.length; i++){
            newMusics[i] = musics[i];
        }

        musics = newMusics;
    }
}