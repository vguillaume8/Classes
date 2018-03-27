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

        LinkList theLinkedList = new LinkList();

        theLinkedList.insertFirstLink("Vinston", 100);
        theLinkedList.insertFirstLink("Jim goes to town", 300);
        theLinkedList.insertFirstLink("New Beginnings", 700); 

        theLinkedList.display();

        theLinkedList.removeFirst();

       // System.out.println(theLinkedList.find)


    }
}


class LinkList {

    public Link firstLink;

    LinkList() {

        firstLink = null;
    }

    public boolean isEmpty() {

        return(firstLink == null);
    }
    
    // New Link created, and reference it to the next link

    public void insertFirstLink(String bookName, int millionsSold){

        Link newLink = new Link(bookName, millionsSold);

        newLink.next = firstLink;

        firstLink = newLink;
    }
    
    // Remove link from list
    // Change reference to remove link

    public Link removeFirst() {

        Link linkReference = firstLink;

        if(!isEmpty()) {

            firstLink = firstLink.next;

        } else {
            
            System.out.println("Empty LinkedList");
        }

        return linkReference;
    }

    // Cycle through all the links
    // Gets all of the references

    public void display() {

        Link theLink = firstLink;

        while(theLink != null) {

            theLink.display();

            System.out.println("Next Link: " + theLink.next);

            theLink = theLink.next;

            System.out.println();
        }
    }

    // Find a Link in a LinkedList

    public Link find(String bookName) {

        Link theLink = firstLink;

        if(!isEmpty()) {

            while(theLink.bookName != bookName) {

                if(theLink.next == null) {

                    return null;

                } else {

                    theLink = theLink.next;
                }

                
            }
        } else {

            System.out.println("Empty Linked List");

        }

        return theLink;

    }

    // Remove a Specific Link
    // Cycle through all Links until theres a match

    public Link removeLink(String bookName) {

        Link currentLink = firstLink;
        Link previousLink = firstLink;

        while(currentLink.bookName != bookName) {

            if(currentLink.next == null) {

                return null;

            } else {

                previousLink = currentLink;

                currentLink = currentLink.next;
            }
        }

        if(currentLink == firstLink) {

            firstLink = firstLink.next;

        } else {

            previousLink.next = currentLink.next;
        }

        return currentLink;
    }

    

}