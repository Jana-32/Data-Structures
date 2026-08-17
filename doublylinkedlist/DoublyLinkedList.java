package doublylinkedlist;
public class DoublyLinkedList<E> {
    private static class Node<E> {

        private E element;    // reference to the element stored at this node
        private Node<E> prev; // reference to the previous node in the list
        private Node<E> next; // reference to the subsequent node in the list

        public Node(E e, Node<E> p, Node<E> n) {
            element = e;
            prev = p;
            next = n;
        }

        public E getElement() {
            return element;
        }

        public Node<E> getPrev() {
            return prev;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setPrev(Node<E> p) {
            prev = p;
        }

        public void setNext(Node<E> n) {
            next = n;
        }

    } //----------- end of nested Node class -----------

    
// instance variables of the DoublyLinkedList
    private Node<E> header; // header sentinel
    private Node<E> trailer; // trailer sentinel
    private int size = 0; // number of elements in the list
private Node<E>Curr;
    public DoublyLinkedList() {//Constructs a new empty list.
        header = new Node<>(null, null, null);  // create header
        trailer = new Node<>(null, header, null); // trailer is preceded by header
        header.setNext(trailer); // header is followed by trailer
        Curr=header;
    }
    
// access methods

    public int size() { //Returns the number of elements in the linked list.
        return size;
    }
    
    public boolean isEmpty()   {//Tests whether the linked list is empty.
        return size == 0;
    }

    public E first() { //Returns (but does not remove) the first element of the list.
        if (isEmpty()) {
            return null;
        }
        return header.getNext().getElement(); // first element is beyond header
    }

    public E last() { //Returns (but does not remove) the last element of the list.
        if (isEmpty()) {
            return null;
        }
        return trailer.getPrev().getElement(); // last element is before trailer
    }

// public update methods

    public void addFirst(E e) { //Adds element e to the front of the list.
        addBetween(e, header, header.getNext()); // place just after the header
    }

    public void addLast(E e) {//Adds element e to the end of the list.
        addBetween(e, trailer.getPrev(), trailer); // place just before the trailer
    }

    public E removeFirst() {//Removes and returns the first element of the list.
        if (isEmpty()) {
            return null; // nothing to remove
        }
        return remove(header.getNext()); // first element is beyond header
    }

    public E removeLast() {//Removes and returns the last element of the list.
        if (isEmpty()) {
            return null; // nothing to remove
        }
        return remove(trailer.getPrev()); // last element is before trailer
    }

// private update methods

    //Adds element e to the linked list in between the given nodes.
    private void addBetween(E e, Node<E> predecessor, Node<E> successor) {  // create and link a new node
        Node<E> newest = new Node<>(e, predecessor, successor);
        predecessor.setNext(newest);
        successor.setPrev(newest);
        size++;
    }

    private E remove(Node<E> node) { //Removes the given node from the list and returns its element.
        Node<E> predecessor = node.getPrev();
        Node<E> successor = node.getNext();
        predecessor.setNext(successor);
        successor.setPrev(predecessor);
        size--;
        return node.getElement();
    }
    
   
    
    
 public void movetoStart(){
        
       this.Curr=header.next;
 
 }
 public void movetoNext(){
     if(Curr.next==this.trailer)
     {System.out.println("you are in the last page can not move next !");
     return;
     }
     Curr=Curr.next;}//Change Curr position to the next position.
 public void movetoPrev(){
     if(Curr.prev==this.header){
     {System.out.println("you are in the first page can not move prev !");
     return;
     }
     
     }
     Curr=Curr.prev;}  //Change Curr position to the Previous position.
 public  E   getValue(){return Curr.element;}    //Return the element of Curr reference

 
 
 
 
 
 
 
 
 

}
