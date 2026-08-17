package uno;
import java.util.*;
public class Unogame {
    
     public static Cicularll<Player>list=new Cicularll();
     
//=========================================================================    
    public static void playCard(){
    int n=list.first().getNumOfCards();
      list.first().setNumOfCards(list.first().getNumOfCards()-1);
        System.out.println(list.first().toString());
    list.rotate();
    }
    //==========================================================================
    public static void ToArray(){
        Player []arr=new Player[list.size()];
        for (int i = 0; i < arr.length; i++) {
        Player p=list.removeFirst();
        arr[i]=p;
            list.addLast(p);
        }
    }
    
    //===========================================================================
    public static void drowCard(){
    int n=list.first().getNumOfCards();
    list.first().setNumOfCards(list.first().getNumOfCards()-1);
        System.out.println(list.first().getNumOfCards());
    list.rotate();
    
    }
    
    //===================================================================================
     public static void insertionSort(Player[] arr){
      for (int i = 1; i < arr.length; i++) {
             Player temp=arr[i];
             int j=i;
             while(j>0&&arr[j-1].getNumOfCards()>temp.getNumOfCards()){
             arr[j]=arr[j-1];
             j--;
         }
         arr[i]=temp;
      }
    }
     //===========================================================================
     public static void print(){
         for (int i = 0; i < list.size(); i++) {
             Player p=list.removeFirst();
             System.out.println(p.toString());
         list.addLast(p);
         }
     }
//=============================================================================================
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        list.addLast(new Player("Ali"));
     list.addLast(new Player("Ali"));
     list.addLast(new Player("Jana"));
     list.addLast(new Player("Adel"));
                int choice=0;
               list.print();
                do{
                    System.out.println("1-play Card   2-drow Card  3-End Game");
                choice=input.nextInt();
                switch(choice){
                    case 1:
                        playCard();
                        break;
                        
                         case 2:
                             drowCard();
                        break;
                        case 3:
                             print();
                        break;
                        case 4:
                           Player []arr=new Player[list.size()];
        for (int i = 0; i < arr.length; i++) {
        Player p=list.removeFirst();
        arr[i]=p;
            list.addLast(p);
        }
                             insertionSort(arr);
                             for (int i = 0; i < arr.length; i++) {
                                 System.out.println(arr[i]);
                            }
                        break;
                         
                
                
                }
                }while(choice!=5);
                


    
    }

}
