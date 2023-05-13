public class Book {
    private String bookTitle;
    private int pageCount;
    private int publishDate;

    public Book(String title){
        this.bookTitle = title;
    }

    public Book(String title, int pages){
        this.bookTitle = title;
        this.pageCount = pages;
    }
    public Book (String bookTitle, int pageCount, int publishDate){
        this.bookTitle = bookTitle;
        this.pageCount = pageCount;
        this.publishDate = publishDate;
    }
    public String getBookTitle(){
        return bookTitle;
    }
    public int getPageCount(){
        return pageCount;
    }
    public int getPublishDate(){
        return publishDate;
    }
    public String print(String s){
        if(s.equalsIgnoreCase("everything")){
            return getBookTitle() + ", " + getPageCount() + " pages, published in " + getPublishDate();
        }else if(s.equalsIgnoreCase("title")){
            return getBookTitle();
        }else return "enter either 'everything' or 'title' to get information";
    }
}