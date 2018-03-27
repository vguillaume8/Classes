//Linked List is an Object, each link has a reference to another link

public class Link{
    
    public String bookName;
    public int millionsSold;

    public Link next;

    public Link(String bookname, int millionsSold) {

        this.bookName = bookName;
        this.millionsSold = millionsSold;
    }

    public void display() {

        System.out.println(bookName + ": " + millionsSold + ",000,000");
    }

    public String toString() {

        return bookName;
    }
   
   
   
   
    public static void main(String[] args) {

    }


class LinkList {

    public Link firstLink;

    LinkList() {

        firstLink = null;
    }

    public boolean isEmpty() {

        return(firstLink = null);
    }
    }

}