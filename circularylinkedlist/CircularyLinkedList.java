package circularylinkedlist;
public class CircularyLinkedList<E> {
  private Node<E>tail=null;
    
    private int size=0;
    
    public CircularyLinkedList(){}
    
    public int size(){return size;}
    
    public boolean isEmpty(){return size==0;}
    
    public E first(){
        if(isEmpty())
            return null;
        return tail.getNext().getElement();}
    
    public E last(){if(isEmpty())
        return null;
    return tail.getElement();
    }
    
    
    
    
    
    public void rotate()
    {
        if(tail!=null)
            tail=tail.getNext();
    
    }
    
    
    
    
    
    
    
    
    public void addFirst(E e){
    if(size==0)
    {
    tail=new Node<>(e,null);
    tail.setNext(tail);
    }
    else
    {
        Node <E>newest=new Node<>(e,tail.getNext());
        tail.setNext(newest);
    }
    size++;
    }
    
    
    
    public void addLast(E e){
        addFirst(e);
       
            tail=tail.getNext();

        
    }
        
        
        
        
    public E removeFirst(){
        if(isEmpty())
            return null;
        Node<E> head=tail.getNext();
        if(head==tail)
            tail=null;
        else
            tail.setNext(head.getNext());
        size--;
        return head.getElement();
    }
 
   
    
    
    
    
    //====================================
//    public void print(){ 
//System.out.println("-----------");
//if(tail==null)
//    return;
//Node curr =tail.getNext();
//for(int i=0;i<size;i++)
//{System.out.println(curr.getElement());
//curr=curr.getNext();
//
//}
    
//while(curr!=tail){
//    System.out.println(curr.getElement());
//    curr=curr.getNext();
//}
//System.out.println(curr.getElement());
//}
    
    //====================================
    public E removeLast(){
         if(isEmpty())
            return null;
       Node cur=tail;   
E element=tail.getElement();
if(tail.getNext()==tail)
{
tail=null;
}
else
 while(cur.getNext()!=tail)
cur=cur.getNext();
cur.setNext(tail.getNext());
tail=cur;
 return element;
}
    
    
    
    //====================================
    public void print(){ 
       
        Node<E>curr=tail.getNext();
        for (int i = 0; i < size; i++) {
            
        
          System.out.println(curr.getElement());
      curr=curr.getNext();
      }
     System.out.println("\n------------\n");
    }
    
   //====================
    public void rotateBy(int x){
          
    Node<E> curr=tail.getNext();
        for (int i = 0; i < x; i++) {
            this.rotate();
        }
    
              }
   
    
   

}