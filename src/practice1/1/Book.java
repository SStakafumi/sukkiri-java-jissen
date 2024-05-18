import java.util.*;

public class Book implements Comparable<Book>, Cloneable{
    private String title;
    private Date publishDate;
    private String comment;

    public Book clone(){
        Book result = new Book();
        result.title = this.title;
        result.publishDate = (Date)this.publishDate.clone();
        result.comment = comment;
        return result;
    }

    /** オーバーライドされたequals() */
    public boolean equals(Object o){
        if (o == this) return true;
        if (o == null) return false;
        if (!(o instanceof Book)) return false;
        Book b = (Book) o;
        if (!(this.title.equals(b.title))) return false;
        if (!(this.publishDate.equals(b.publishDate))) return false;
        return true;
    }

    /** オーバーライドされたhashCode() */
    public int hashCode(){
        return Objects.hash(this.title, this.publishDate);
    }

    /**  発行日の古い順を自然順序とする関数 */
    public int compareTo(Book obj){
        return this.publishDate.compareTo(obj.publishDate);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }
}
