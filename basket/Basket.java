package basket;
import java.util.*;
public class Basket {
    static Object[][] items = {
    {new Item("Apple", 2)},
    {new Item("Banan", 4)},
    {new Item("Dates", 15)},
    {new Item("Orang", 6)},
    {new Item("Grapes", 7)},
   };
 
    static Scanner input=  new Scanner(System.in);
  public static SinglyLinkedList<Item>list=new SinglyLinkedList();
  //=============================================================================
    public static void fillList(){
        for (int i = 0; i < items.length; i++) {
            for (int j = 0; j < items[i].length; j++) {
                list.addLast((Item)items[i][j]);
            }
        }
}

 //==========================================================================
public static void addItem(Item ob){
 list.addLast(ob);
}

 //==============================================================================
public static void remove_Item(String name){
     list.moveToStart();
    for (int i = 0; i < list.size(); i++) {
        Item m=list.removeFirst();
        if(!m.getName().equals(name)){
            list.addLast(m);
        }
    }
   
}

//==============================================================================
public static void removeMostExpensiveItem(){
    int n=list.size();
    list.moveToStart();
    int maxPrice=list.first().getPrice();
    for (int i = 0; i < n; i++) {
        
        Item m=list.removeFirst();
        if(maxPrice<m.getPrice()){
            maxPrice=m.getPrice();
        }
        list.addLast(m);
        list.remove(maxPrice);
    }

}


//==============================================================================
public static void PrintBillt(){
    for (int i = 0; i < list.size(); i++) {
        
    }
    
    
    
}
//==============================================================================
public static void print(){
}
//==============================================================================
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int choice=0;
       
        
        do{
            System.out.println("What do you want to do:");
            System.out.println("1. Print items in basket");
            System.out.println("2. Add item to the basket");
            System.out.println("3. remove the item that has given name");
            System.out.println("4. remove expensive item in the basket");
            System.out.println("5. print bill");
            System.out.println("6. Exit");
            choice=input.nextInt();
            switch(choice){
                case 1:
                    System.out.println("the list contain the following items:");
                  // list.print();
                    break;
                case 2:
                    System.out.println("enter item name"); 
                    String name=input.next();
                    System.out.println("enetr item price");
                    int price=input.nextInt();
                    addItem(new Item(name,price));
                    break;
                case 3:
                    System.out.println("enter item name to remove");
             name=input.next();
                    remove_Item(name);
                    break;
                case 4:
                    removeMostExpensiveItem();
                    break;
                case 5:
                    PrintBillt();
                    break;
                    default:
                    System.out.println("invalid number!");
                    break;
                    
            }
            
        }while(choice!=6);
        System.out.println("thank you");
    }
}
