public class MusicLibrary {
    private Artist[] artists;
    private Album[] albums;
    private Music[] songs;
    private int artistIndex;
    private int albumIndex;
    private int songIndex;

    public MusicLibrary() {
        this.artists = new Artist[10];
        this.albums = new Album[10];
        this.songs = new Music[20];
        this.artistIndex = 0;
        this.albumIndex = 0;
        this.songIndex = 0;
    }

    public Artist[] getArtists() {
        return artists;
    }

    public Album[] getAlbums() {
        return albums;
    }

    public Music[] getSongs() {
        return songs;
    }

    public void addArtist(Artist artist) {
        if (artistIndex == artists.length) {
            increaseArtistsSize();
        }
        artists[artistIndex++] = artist;
    }

    public void addAlbum(Album album) {
        if (albumIndex == albums.length) {
            increaseAlbumsSize();
        }
        albums[albumIndex++] = album;
    }

    public void addMusic(Music music) {
        if (songIndex == songs.length) {
            increaseSongsSize();
        }
        songs[songIndex++] = music;
    }

    public void removeArtist(Artist artist) {
        for (int i = 0; i < artistIndex; i++) {
            if (artists[i].equals(artist)) {
                artists[i] = artists[artistIndex - 1];
                artists[--artistIndex] = null;
                return;
            }
        }
    }

    public void removeAlbum(Album album) {
        for (int i = 0; i < albumIndex; i++) {
            if (albums[i].equals(album)) {
                albums[i] = albums[albumIndex - 1];
                albums[--albumIndex] = null;
                return;
            }
        }
    }

    public void removeMusic(Music music) {
        for (int i = 0; i < songIndex; i++) {
            if (songs[i].equals(music)) {
                songs[i] = songs[songIndex - 1];
                songs[--songIndex] = null;
                return;
            }
        }
    }

    public Music searchMusic(String title){
        for(Music music : songs){
            if(music == null) continue;

            if(music.getTitle() == title){
                return music;
            }
        }

        System.out.println("Song not found.");
        return null; // returns nothing
    }

    public Music giveRandomMusic(){
        int index = (int) (Math.random() * songIndex);

        return songs[index];
    }



    private void increaseAlbumsSize(){
        Album[] newAlbums = new Album[albums.length+1];

        for(int i = 0; i< albums.length; i++){
            newAlbums[i] = albums[i];
        }

        albums = newAlbums;
    }

    private void increaseSongsSize(){
        Music[] newMusics = new Music[songs.length+1];

        for(int i = 0; i< songs.length; i++){
            newMusics[i] = songs[i];
        }

        songs = newMusics;
    }

    private void increaseArtistsSize(){
        Artist[] newArtist = new Artist[artists.length+1];

        for(int i = 0; i<artists.length; i++){
            newArtist[i] = artists[i];
        }

        artists = newArtist;
    }
}
