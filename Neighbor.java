public class DoubleEndedLinkedList{

    Neighbor firstLink;
    Neighbor lastLink;

    public void insertInFirstPosition(String homeOwnerName, int houseNumber) {

        Neighbor theNewLink = new Neighbor(homeOwnerName, houseNumber);

        if(isEmpty()){

            lastLink = theNewLink;

        }

        theNewLink.next = firstLink;
        firstLink = theNewLink;


    }

    public void insertInLastPosition(String homeOwnerName, int houseNumber) {

        Neighbor theNewLink = new Neighbor(homeOwnerName, houseNumber);

           if(isEmpty()){

            firstLink = theNewLink;

        } else {

            lastLink.next = theNewLink;
 

        }

        lastLink = theNewLink;

    }

    public boolean isEmpty() {

        return(firstLink == null);
    }
    

    public boolean insertAfterKey(String homeOwnerName, int houseNumber, int key) {


    }



    public static void main(String[] args) {

        DoubleEndedLinkedList theLinkedList = new DoubleEndedLinkedList();

        theLinkedList.insertInFirstPosition("Vinston Guillaume", 7);
        theLinkedList.insertInFirstPosition("Mario Smith", 9);
        theLinkedList.insertInLasttPosition("John Adams ", 10);

        theLinkedList.display();
    }

    public void display() {

        Neighbor theLink = firstLink;

        while(theLink !null) {

            theLink.display();
            System.out.println("Next Link: " + theLink.next);
            theLink theLink.next;
            Sytem.out.println();
        }
    }



    class Neighbor {

        public String homeOwnerName;
        publiv int houseNumber;

        public Neighbor next;
        public Neighbor previous;

        public Neighbor(String homeOwnerName, int houseNumber) {

            this.homeOwnerName = homeOwnerName;
            this houseNumber = houseNumber;
        }

        public void display() {

            System.out.println(homeOwnerName + ": " + houseNumber + "Privet Drive");
                
        }

        public String toString() {

            return homeOwnerName;
        }


    }

    class NeighborIterator {

        NeighborIterator {

            NeighborIterator(DoubleEndedLinkedList the Neighbor) {


            }

            public boolean hasNext() {

            }
        }
    }
}