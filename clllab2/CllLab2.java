
package clllab2;

public class CllLab2<E> {

   private Node<E>tail;
   private int size=0;
   private Node<E>curr;
  

    public CllLab2(){
        
    }
    
    
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

    public E last() {// ترجع اول ايليمينت في الليسته
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
        //===============================================================================
        public void print(){
            System.out.println("-----------");
            if(tail==null){
                return;
            }
            
            Node <E>curr=tail.getNext();
            while(curr!=tail){
                System.out.println(curr.getElement());
                curr=curr.getNext();
            }
            System.out.println(curr.getElement());
        }
        
        
   //====================================================================================
        
        public void Traverse(){
            if(isEmpty()){
                System.out.println("empty");
            }
            curr=tail.getNext();
           
            for (int i = 0; i < size; i++) {
                
                System.out.println(curr.getElement());
                curr=curr.getNext();
                
            }
            
            
        }
        
        
        //===========================================================================
        public boolean search(int n){
            boolean f=false;
            curr=tail.getNext();
            for (int i = 0; i < size; i++) {
               if(curr.getElement().equals(n)){
                   f=true;
               }
               curr=curr.getNext();
               }
            
        return f; 
        }
            
            
            
        //====================================================================
        public void Swap2Elements(){
            if(size<=1){
                System.out.println("cannot");
                return;
            }else
                
            
            curr=tail.getNext();//head
            
            E temp=curr.getElement();
            curr.setElement(tail.getElement());
            tail.setElement(temp);
          
            
        }       
        
            
    
}
