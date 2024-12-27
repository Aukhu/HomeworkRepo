public class Artist {
    private String name;
    private Album[] albums = new Album[10];
    private Music[] songs = new Music[1];
    private int albumIndex = 0;
    private int songIndex = 0;

    public Artist(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addAlbum(Album album){
        if(albumIndex>=albums.length){
            increaseAlbumsSize();
        }
        albums[albumIndex++] = album;

        if(songIndex+album.getMusics().length>=songs.length){
            increaseSongsSize(album);
        }

        for(int i = 0; i<album.getMusics().length; i++){
            songs[songIndex+i] = album.getMusics()[i];
        }

        System.out.println("Album '" + album.getName() + "' has been added to " + name);
    }

    public void removeMusic(Album album){
        for (int i = 0; i < albumIndex; i++) {
            if (albums[i].equals(album)) {
                for (int j = i; j < albumIndex - 1; j++) {
                    albums[j] = albums[j + 1];
                }
                albums[--albumIndex] = null;
                System.out.println(album.getName() + " removed from " + name);
                return;
            }
        }

        System.out.println(album.getName() + " not found in this artist's albums.");
    }


    public void displayInfo(){
        System.out.println("Artist name: "+name);

        for(Album album : albums){
            if(album != null){
                album.displayInfo();
                System.out.println();
            }
        }

        for(Music song : songs){
            if(song != null){
                song.displayInfo();
                System.out.println();
            }
        }
    }


    private void increaseAlbumsSize(){
        Album[] newAlbums = new Album[albums.length+1];

        for(int i = 0; i< albums.length; i++){
            newAlbums[i] = albums[i];
        }

        albums = newAlbums;
    }

    private void increaseSongsSize(Album album){
        Music[] newMusics = new Music[songs.length+album.getMusics().length];

        for(int i = 0; i< songs.length; i++){
            newMusics[i] = songs[i];
        }

        songs = newMusics;
    }
}