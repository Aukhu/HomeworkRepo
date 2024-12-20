public class Books {
    private String title;
    private int pages;
    private String author;
    private boolean isSolidCover;

    public Books(String title, int pages, String author, boolean isSolidCover) {
        this.title = title;
        this.pages = pages;
        this.author = author;
        this.isSolidCover = isSolidCover;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setHardCover(boolean isSolidCover) {
        isSolidCover = isSolidCover;
    }


    public String getTitle() {
        return title;
    }

    public int getPages() {
        return pages;
    }

    public String getAuthor() {
        return author;
    }
    private void read(){
        System.out.println("მე ვკითხულობ " + title + " წიგნს");
    }

    public void setSolidCover(boolean isSolidCover) {
        isSolidCover = isSolidCover;
    }

    public String toString() {
        return "title: '" + title + '\'' +
                ", numberOfPages: " + pages +
                ", author: " + author +
                ", isSolidCover: " + (isSolidCover ? "Yes" : "No");
    }
}


