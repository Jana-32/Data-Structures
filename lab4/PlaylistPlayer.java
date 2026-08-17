package lab4;
import java.util.*;
public class PlaylistPlayer {
    
static DoublyLinkedList <AudioFile> list=new DoublyLinkedList<>();
static DoublyLinkedList <AudioFile> FavorateList=new DoublyLinkedList<>();

//=============================================================================
public static void Move_To_Next(){
list.movetoNext();
    System.out.println(list.getValue());
}

public static void Move_To_Previous(){
list.movetoPrev();
    System.out.println(list.getValue());
}

public static void addAudioFile(AudioFile ob){
    list.addLast(ob);
}

//---------------------------------------------------------------------------
public static void printPlaylist(DoublyLinkedList <AudioFile> list){
    for (int i = 0; i < list.size(); i++) {
        AudioFile f=list.removeFirst();
        System.out.println(f);
        list.addLast(f);
    }
}

//--------------------------------------------------------------------------
public static void printReverse(DoublyLinkedList <AudioFile> list){
    for (int i = 0; i < list.size(); i++) {
        AudioFile f=list.removeLast();
        System.out.println(f);
        list.addFirst(f);
    
    }
    
    
}
//--------------------------------------------------------------------------

public static void removeAudioFile(String title){
    int num=list.size();
    for (int i = 0; i < num; i++) {
        AudioFile f=list.removeFirst();
        if(f.getTitle().equals(title)==false){
            list.addLast(f);
    }
}}

//--------------------------------------------------------------------------
public static void displayLongestTrack(){
    if(list.isEmpty()){
        System.out.println("the play list is empty");
    return;
    }
    System.out.println("the longest is : ");
    int num=list.size();
    AudioFile longest=null;
    int max=0;
    for (int i = 0; i < num; i++) {
        AudioFile f=list.removeFirst();
        if(f.getDurationInSeconds()>max){
            max=f.getDurationInSeconds();
            longest=f;
        }
        list.addLast(f);
        
    }
    System.out.println(longest);
}


//--------------------------------------------------------------------------
public static void FavoriteList(String title){
    int num =list.size();
    for (int i = 0; i < num; i++) {
        AudioFile f=list.removeFirst();
        if(f.getTitle().equals(title))
            FavorateList.addLast(f);
        list.addLast(f);
    }
    
}

//--------------------------------------------------------------------------
public static void GoTo_Specific_file(int n){
    if(n<1 || n>list.size()){
        System.out.println("out of Boundrys");
        return;
    }
    list.movetoStart();
    for (int i = 1 ; i < n ; i++) {
        list.movetoNext();}
        System.out.println(list.getValue());
    
    
}


//--------------------------------------------------------------------------
public static void SetAllDurationsTo10(){
    list.movetoStart();
    for (int i = 0; i < list.size(); i++) {
        list.getValue().setDurationInSeconds(10);
        list.movetoNext();
    }
    
    
}
//--------------------------------------------------------------------------
public static void printShortestAudio(){
    list.movetoStart();
    
    AudioFile min=list.removeFirst();
    list.addLast(min);
    
    for (int i = 1; i <list.size(); i++) {
        AudioFile a=list.removeFirst();
        if(a.getDurationInSeconds()<min.getDurationInSeconds())
            min=a;
        list.addLast(a);
    }
    
    
}
//--------------------------------------------------------------------------

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        

int choice;
        do{
            System.out.println("======AudioFile menu=======");
            System.out.println("1-addd new AudioFile");
            System.out.println("2-next AudioFile");
            System.out.println("3- previous AudioFile");
            System.out.println("4- displayLongestTrack");
            System.out.println("enter your choice");
            choice=in.nextInt();
            
            
            switch(choice){
                
                case 1:
                    System.out.println("enter AudioFile data title , creator , duration in menuts");
                    AudioFile ob=new AudioFile(in.next(),in.next(),in.nextInt());
                    addAudioFile(ob);
                    break;
                    
                    
                case 2 :
                Move_To_Next();
                break;
           
                case 3: 
                    Move_To_Previous();
                    break;
                    
                case 4 :
                    displayLongestTrack();
                    break;
                case 999:
                    System.out.println("end of play list >>>");
                    break;
            }
            
        }while(choice !=999);
        
        
            }

    
}
