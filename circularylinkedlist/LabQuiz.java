package circularylinkedlist;
public class LabQuiz {
    public static CircularyLinkedList<Request> list =new CircularyLinkedList();
    //====================================================
    public static void printMain(){
        for (int i = 0; i < list.size(); i++) {
            Request num=list.first();
            System.out.println(num);
            list.rotate();
        }
    }
    
    //================================================
  public static void rotateByMain(int num){
      System.out.println("After rotation by "+num);
      for (int i = 0; i < num; i++) {
          Request nam=list.first();
          list.rotate();
      }
      
  }
    
    //====================================================
    public static void main(String[] args) {
     
       
Request re1=new Request(1, 1000);
Request re2=new Request(2, 2000);
Request re3=new Request(3, 3000);
Request re4=new Request(4, 4000);
list.addLast(re1);
list.addLast(re2);
list.addLast(re3);
list.addLast(re4);
//     printMain();
//   rotateBy(2);
//      printMain();
        

list.print();
list.rotateBy(2);
list.print();
    }
   
}
