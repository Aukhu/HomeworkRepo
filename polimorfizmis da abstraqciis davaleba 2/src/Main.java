public class Main {
    public static void main(String[] args) {
        MusicLibrary library = new MusicLibrary();


        Music song1 = new Music("Stairway to Heaven", 8.02, "Rock");
        Music song2 = new Music("Let It Be", 4.03, "Pop");
        Music song3 = new Music("Bohemian Like You", 4.25, "Alternative Rock");
        Music song4 = new Music("Creep", 5.29, "Grunge");
        Music song5 = new Music("Bad", 5.57, "Pop");

        Album album1 = new Album("Led Zeppelin IV", 1971);
        album1.addMusic(song1);

        Album album2 = new Album("Let It Be", 1970);
        album2.addMusic(song2);

        Album album3 = new Album("Best of the Rock Era", 2003);
        album3.addMusic(song3);

        Album album4 = new Album("The Bends", 1995);
        album4.addMusic(song4);

        Album album5 = new Album("Purple Rain", 1984);
        album5.addMusic(song5);

        Artist artist1 = new Artist("Led Zeppelin");
        artist1.addAlbum(album1);

        Artist artist2 = new Artist("The Beatles");
        artist2.addAlbum(album2);

        Artist artist3 = new Artist("The Strokes");
        artist3.addAlbum(album3);

        Artist artist4 = new Artist("Radiohead");
        artist4.addAlbum(album4);

        Artist artist5 = new Artist("Prince");
        artist5.addAlbum(album5);

        library.addArtist(artist1);
        library.addArtist(artist2);
        library.addArtist(artist3);
        library.addArtist(artist4);
        library.addArtist(artist5);

        library.addAlbum(album1);
        library.addAlbum(album2);
        library.addAlbum(album3);
        library.addAlbum(album4);
        library.addAlbum(album5);

        library.addMusic(song1);
        library.addMusic(song2);
        library.addMusic(song3);
        library.addMusic(song4);
        library.addMusic(song5);

        artist1.displayInfo();
        artist2.displayInfo();
        artist3.displayInfo();
        artist4.displayInfo();
        artist5.displayInfo();

        Music song = library.searchMusic("Imagine");

        if(song != null){
            song.displayInfo();
            song.play();
            song.stop();
        }

        System.out.println();

        Music randomSong = library.giveRandomMusic();
        System.out.println("Random Song: " + randomSong.getTitle());

        library.removeMusic(song2);
    }
}