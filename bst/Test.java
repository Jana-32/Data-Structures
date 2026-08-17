package bst;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.*;





public class Test {
    
    static Order[] orders = new Order[15];
  static    BSTree<Double,Order>t=new BSTree();
       /* ////////////////////////////////////////////

   //////////////////////////////////////////// */
  
  public static void removeLowQuantityOrders(BSTNode <Double,Order>root){
     if(root==null){return;}
     
     if(root.getKey()<20)
        t.delete(root.getKey());
     
     removeLowQuantityOrders(root.getLeft());
     removeLowQuantityOrders(root.getRight());
  
  }
  
  
  
    public static void main(String[] args) {
        orders[0] = new Order(110, "pen", 2, 10);
        orders[1] = new Order(111, "notebook", 1, 7);
        orders[2] = new Order(112, "pencil", 3, 2);
        orders[3] = new Order(113, "eraser", 3, 1);
        orders[4] = new Order(115, "glue", 1, 12);
        orders[5] = new Order(116, "ruler", 1, 6);
        orders[6] = new Order(117, "pc", 1, 2000);
        orders[7] = new Order(118, "printer", 1, 800);
        orders[8] = new Order(119, "mouse", 2, 25);
        orders[9] = new Order(120, "screen", 2, 1000);
        orders[10] = new Order(121, "paper", 20, 3);
        orders[11] = new Order(122, "usb", 1, 50);
        orders[12] = new Order(123, "boardmarker", 4, 5);
        orders[13] = new Order(124, "book", 2, 20);
        orders[14] = new Order(125, "pen", 2, 15);

          /* ////////////////////////////////////////////
        call your methods and complete the code here  
        //////////////////////////////////////////// */
          for(int i=0;i<orders.length;i++)
              t.insert(orders[i].getPrice(), orders[i]);
        t.print();
         
          //t.buildBalancedBST();
           System.out.println("=============\n");
      
          //System.out.println(t.contains(orders[4]));
//          
          
       
            }

 
}
