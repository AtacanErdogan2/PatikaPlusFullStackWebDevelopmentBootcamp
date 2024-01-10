public class Book implements Comparable<Book> {
    private String name;
    private int pageNumber;
    private String authorName;
    private int publishYear;

    public Book(String name, int pageNumber, String authorName, int publishYear) {
        this.name = name;
        this.pageNumber = pageNumber;
        this.authorName = authorName;
        this.publishYear = publishYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }

    // for alphabetical sorting
    @Override
    public int compareTo(Book b2) {
        return this.name.compareTo(b2.getName());
    }
}
