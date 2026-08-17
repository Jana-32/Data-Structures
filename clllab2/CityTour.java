package clllab2;
import java.util.*;
public class CityTour {
    
   
public static CllLab2<Landmark>list=new CllLab2();

//==============================================================================
  public static void Print_Tour_Route(){
      list.first();
      int n=list.size();
      for (int i = 0; i < list.size(); i++) {
          Landmark st=list.removeFirst();
          System.out.println(st.toString());
          list.addLast(st);
      }
      
        }
  //============================================================================
  public static void ReplaceLandMarkTime(String name,int time){
  list.first();
  int n=list.size();
      for (int i = 0; i < n; i++) {
          Landmark d=list.removeFirst();
          if(d.getLandmarkName().equalsIgnoreCase(name)){
              d.setScheduledTime(time);
          }
          list.addLast(d);
      }
      
      
      
  }
//==============================================================================
  public static void Search_For_Landmark(String LandmarkName){
      boolean found=false;
   list.first();
      int n=list.size();
      for (int i = 0; i < list.size(); i++) {
          Landmark st=list.removeFirst();
          if(st.getLandmarkName().equals(LandmarkName)){
              found=true;}
          list.addLast(st);
      }
      if (found==true){
          System.out.println(LandmarkName+"is found");
      }else{
               System.out.println(LandmarkName+"is NOT found");
      }
  }
//==============================================================================
    public static void Remove_Landmark(String LandmarkName) {
  list.first();
      int n=list.size();
      for (int i = 0; i < list.size(); i++) {
          Landmark st=list.removeFirst();
          if(!st.getLandmarkName().equals(LandmarkName)){
             list.addLast(st);
          }
          
      }  }

//==============================================================================
    public static void Tour_Duration(){
   list.first();
      int n=list.size();
      int total=0;
      for (int i = 0; i < list.size(); i++) {
          Landmark st=list.removeFirst();
          total+=st.getScheduledTime();
             list.addLast(st);
      }
        System.out.println("the city duration is "+(total/60)+" hour");
    
    }  
//==============================================================================
    public static void printTwice(){
    list.first();
    int n=list.size();
        for (int i = 0; i < n; i++) {
        Landmark d=list.removeFirst();
            list.addLast(d);
            list.addLast(d);
        }
        System.out.println("SIZE"+list.size());
    }
//==============================================================================
    public static void maxDuration(){
    Landmark max=list.first();
        for (int i = 0; i < list.size(); i++) {
            Landmark map=list.removeFirst();
            if(map.getScheduledTime()>max.getScheduledTime()){
                max=map;
            }
            list.addLast(map);
            
        }
        System.out.println("MAXIMUM DURATION IS "+max.getScheduledTime());
    
    
    }
    //==========================================================================
    
    
    public static void BubbleSortBasedOnTime(Landmark []arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if(arr[j-1].getScheduledTime()<arr[j].getScheduledTime()){
                    
                    Landmark temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
            }
            
        }
               
    }
//==============================================================================
    public static void Incertion(Landmark[]arr){
        for (int i = 0; i < 10; i++) {
            
            
            
            
            
            
        }
    }
//==============================================================================
     public static void Selection(Landmark[]arr){
        for (int i = 0; i < arr.length; i++) {
            int minIn=i;
            for (int j = 1; j < arr.length; j++) {
                if(arr[j-1].getScheduledTime()>arr[minIn].getScheduledTime()){
                    minIn=j;
                }
                
            }
            
            Landmark temp=arr[i];
            arr[i]=arr[minIn];
            arr[minIn]=temp;
            
        }
    }
     //========================================================================
    
public static void main(String[] args) {
    
    Scanner input=new Scanner(System.in);
    
    list.addLast(new Landmark("Effel", 80));
    list.addLast(new Landmark("mammlaka", 60));
    list.addLast(new Landmark("tour", 40));
    list.addLast(new Landmark("khalifa", 60));
    
    int choice=0;
    do{
    System.out.println("\nwelcome to the city tour manegment System .choose your option");
        System.out.println("1-print Tour Rout");
         System.out.println("2-Search for a Landmark");
          System.out.println("3-Remove a LandMark");
           System.out.println("4-Print tour Duration");
            System.out.println("5-print twice");
            System.out.println("6-print maximum duration");
            System.out.println("7-Exit");
            System.out.println("enter choice ");
            choice=input.nextInt();
            switch(choice){
                case 1:
                    Print_Tour_Route();
                    break;
                case 2:
                    System.out.println("Enter the Landmark name");
                    String name=input.next();
                    Search_For_Landmark(name);
                   
                    break;
                case 3:
                     System.out.println("Enter the Landmark name");
                     Remove_Landmark(input.next());
                     System.out.println("done !!!");
                     break;
                case 4:
                    ReplaceLandMarkTime(input.next(),input.nextInt());
                    break;
                case 5:
                    printTwice();
                    break;
                
                case 6:
                    maxDuration();
                    break;
                case 7:
                    Landmark []arr=new Landmark[list.size()];
                   
                    for (int i = 0; i < arr.length; i++) {
                        Landmark l=list.removeFirst();
                        arr[i]=l;
                        list.addLast(l);
                    }
                    BubbleSortBasedOnTime(arr);
                    for (int i = 0; i < arr.length; i++) {
                        System.out.println(arr[i]);
                        
                    }
                    break;
            
            }
    
    }while(choice!=9);

}

    
}
