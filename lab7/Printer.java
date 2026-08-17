package lab7;
public class Printer {
    
    public static final int MAX_SIZE = 100;
    public static ArrayStack<String> paperStack = new ArrayStack<>(MAX_SIZE);

    //==========================================================================
    public static void addPapaer(int num) {
        int i=0;
        for (; i < num; i++) {
            if (paperStack.size() < MAX_SIZE) {
                paperStack.push("Page");
            } else {
                System.out.println("Paper stack is full, Only ("+ i + ") are added to the paper stack");
                break;
            }
        }
        System.out.println(i + " Papers are added to the paper stack.");
    }
    
    //==========================================================================

    public static void printDocument(String name, int numOfpages) {
        System.out.println("Printing Document: " + name);
        for (int i = 0; i < numOfpages; i++) {
            if (!paperStack.isEmpty()) {
                paperStack.pop();
                System.out.println("Page: " + (i + 1));
            } else {
                System.out.println("Cannot complete job! add papers to the printer please.");
                break;
            }
        }
    }
//==============================================================================
    
    public static void searchByIndex(int index){
if(paperStack.size()<=index)
return;

ArrayStack <String>temp=new ArrayStack();
if(index<0||index>=paperStack.size())
    return;

for(int i=paperStack.size()-1;i>index;i--){
    temp.push(paperStack.pop());
}
            System.out.println(paperStack.top());   
    
   while(!temp.isEmpty())
       paperStack.push(temp.pop());
    
}
//==============================================================================
    public  static void  deleteFromTo(int from,int to){
   
        if(from >to)
        return;
    if((to-from)>paperStack.size())
        return;
    ArrayStack <String>temp=new ArrayStack();
    for(int i=paperStack.size()-1;i>to;i--)
{
    temp.push(paperStack.pop());
}
           for(int i=to;i>from;i--) 
               paperStack.pop();
    
   while(!temp.isEmpty())
       paperStack.push(temp.pop());
    
    
    }
    //===========================================================================
    public static void printthenew(int num , String newname){
        ArrayStack<String>temp=new ArrayStack();
        
        for (int i = 0; i < num; i++) {
            temp.push(paperStack.pop());
        }
        
        paperStack.pop();
        paperStack.push(newname);
        
        
        while(!temp.isEmpty()){
            paperStack.push(temp.pop());
        }
        
    }
    //===========================================================================
    public static void printStack(){
        ArrayStack<String>temp=new ArrayStack();
    
while(!paperStack.isEmpty()){
    String x=paperStack.pop();
    System.out.println(x);
    temp.push(x);
}

while(!temp.isEmpty()){
    paperStack.push(temp.pop());
}    
    }
    //=================================================
    public static void main(String[] args) {
        System.out.println("###### Virtual Printer ######");
        System.out.println("Add 50 papers to stack");
        System.out.println();

        addPapaer(5);
        printStack();
        System.out.println();
printthenew(2,"jana");
        System.out.println("===================AFTER======================");
printStack();
//        System.out.println("Add 110 papers to stack");
//        System.out.println();
//
//        addPapaer(110);
//        System.out.println();
//
//        printDocument("1", 20);
//        System.out.println();
//
//        printDocument("2", 100);
//        System.out.println();
//
//        System.out.println("Add 50 papers to stack");
//        System.out.println();
//
//        addPapaer(50);
//        System.out.println();
//
//        printDocument("3", 50);
//
//        System.out.println();
//
//        printDocument("4", 60);
//        
//         addPapaer(50);
//         searchByIndex(33);
//         System.out.println(paperStack.size());
//         deleteFromTo(20, 30);
//         System.out.println(paperStack.size());
//         

    }


}
