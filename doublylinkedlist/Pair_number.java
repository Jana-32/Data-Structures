package doublylinkedlist;
public class Pair_number {
    public static DoublyLinkedList<Integer>list=new DoublyLinkedList();
    
    //==========================================================================
    public static void print(DoublyLinkedList dll) {
        if(dll.isEmpty()){
            System.out.println("its empty");
            return;
        }
     int size=dll.size();
                for (int i = 0; i < size; i++) {
                    int num=(int)dll.removeFirst();
                    System.out.println(num);
                    dll.addLast(num);
                }
    }
    //==========================================================================

    public static void FindPairs(DoublyLinkedList MyDoubleList, int checkNum) {
        int x;
        
        DoublyLinkedList temp=new DoublyLinkedList(); 
        
                while (!MyDoubleList.isEmpty()) {
                    x=(int)MyDoubleList.removeFirst();
                            temp.addLast(x);
                    for (int j = 0; j < MyDoubleList.size(); j++) {
                       int y=(int) MyDoubleList.removeFirst();
                        if(x+y==checkNum){
                            System.out.println("("+x+","+y+")");
                        }
                   MyDoubleList.addLast(y); }
        }
    
    }

//==============================================================================
    public static void main(String[] args) {
        DoublyLinkedList<Integer> dll = new DoublyLinkedList();
        dll.addLast(3);
        dll.addLast(2);
        dll.addLast(4);
        dll.addLast(1);
        dll.addLast(6);
        dll.addLast(5);
        dll.addLast(9);

       print(dll);
        System.out.println("\n====");
        FindPairs(dll, 7);
   
        System.out.println("\n====");
 print(dll);
    }
//============================================





}
