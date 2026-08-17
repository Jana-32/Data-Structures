package uno;
public class Cicularll<E> {
    
    private Node<E>tail;
    private Node<E>curr;
    private int size;
    //==================================================
    
     public int size(){
         return size;
     }
     
     public boolean isEmpty(){
         if(size==0){
             return true;}
         return false;
     }
//================================================================================================
    public E first(){// ترجع اول ايليمينت في الليسته
        if(isEmpty()){
            return null;
        }
        return tail.getNext().getElement();
    } 
//==================================================================================================

    public E last() {// ترجع اخر ايليمينت في الليسته
        if (isEmpty()) {
            return null;
        }
        return tail.getElement();
    }

    
    //===================================IMPORTANT=======================================
    public void rotate(){
        
        if(tail!=null){
            tail=tail.getNext();
        }}
        
        
        
        //==========================================================================
        public void addFirst(E element){
              //empty
            if(isEmpty()){
                tail=new Node(element,null);
                tail.setNext(tail);
            }
            //one or mare 
            else {
                Node n=new Node(element,tail.getNext());
                tail.setNext(n);
            }
            size++;
        }
        
        
        
        //================================================================================
        public void addLast(E element){
            addFirst(element);
            tail=tail.getNext();
           
            //or rotate();\
        }
        
        //====================================================================================
        
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
    
    
    //=================================================================
  public void print(){
      for (int i = 0; i < size; i++) {
          
      
      curr=tail.getNext();
      System.out.println(curr.getElement());
      curr=curr.getNext();
  }}
    
}
