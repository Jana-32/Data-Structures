
package lab2;
import java.nio.file.Paths;
import java.util.*;
public class HospitalSystem {
    
    public static Scanner input;
    
    static  SinglyLinkedList<Doctor>doctors=new SinglyLinkedList();
  static  SinglyLinkedList<Patient>patients=new SinglyLinkedList();


    public HospitalSystem() {
        try {
            Addoctors("doctors.txt");
        } catch (Exception ex) {
            System.out.println("Failed to read from the file.");
        }
    }

    public void Addoctors(String fileName) throws Exception {
        input = new Scanner(Paths.get(fileName));
        while (input.hasNext()) {
doctors.addLast(new Doctor(input.next(), input.next(), input.next()));

        }
        input.close();
    }

    public static void Add_patient() {
        //Approach 1
//        input=new Scanner(System.in);
//      String id,name, clinic; int age; 
//        
//        System.out.println("enter id");
//        id=input.next();
//         System.out.println("enter age");
//        age=input.nextInt();
//         System.out.println("enter name");
//        name=input.next();
//         System.out.println("enter clinic");
//        clinic=input.next();
//        Wlst.addLast(new Patient(id,age,name,clinic));
//------------------------------------------------------------------------------

//  Approach 2
        patients.addLast(new Patient("123", 40, "manal", "Urology"));
        patients.addLast(new Patient("124", 57, "omran", "Dermatology"));
        patients.addLast(new Patient("125", 66, "khalid", "Pediatrics"));
        patients.print();
    } 
 //    ------------------------------------------------------------
public static void PrintInfo(){
    patients.moveToStart();
    
    for (int i = 0; i < patients.size(); i++) {
        Patient p=patients.getValue();
        if(p.getAge()>50)
            System.out.println(p);
        patients.next();
    }
    
}

//===========================================================================
public static void CountDoctors(String Clinic){
    int count=0;
    doctors.moveToStart();
    for (int i = 0; i < doctors.size(); i++) {
        Doctor d=doctors.getValue();
        if(d.getSpecialty().trim().equalsIgnoreCase(Clinic.trim()))
            count++;
        doctors.next();
    }
    System.out.println("number of Doctors In"+Clinic+" is :"+ count);
    
    
    
} 
//===========================================================================
    //------------------------------------------------------
   public static Patient Search_patient(String id){
       patients.moveToStart();
       
       for(int i=0;i<patients.size();i++)
       {
        Patient p=patients.getValue();
       if(p.getId().equals(id))
       return p;
      patients.next();
          }
       return null;
              }
   
   //-----------------------------------------------------
   public static void Remove_Patient(String id){
    patients.moveToStart();
       
       for(int i=0;i<patients.size();i++)
       {
        Patient p=patients.getValue();
       if(p.getId().equals(id))
      
       { patients.remove(i);
       break;}
       
       patients.next();
              }
   
   
   
   }
    //---------------------------------------------------------------------------------------
     //Assigning the patient to a doctor according to the clinic name.
    public static void Assigning_patient_to_doctor(String id){
        Patient p=Search_patient(id);
        
        if(p==null)
    return;
        String clinic=p.getclinic();
        doctors.moveToStart();
        Doctor d=null;
        for(int i=0;i<doctors.size();i++){
        if(doctors.getValue().getSpecialty().equals(clinic))
        
        {d=doctors.getValue();
        break;
        }
        doctors.next();
             
        }
        if(d!=null){
               
       System.out.println(" the patient "+p.getName()+ "  Assigned to doctor "+d.getName());
        }
       else
   System.out.println("system Error!!");


    }
    
// ----------------------------------------------------------------------------------
    


   

    public static void main(String[] args) {
        HospitalSystem x = new HospitalSystem();
        input = new Scanner(System.in);
        int choice = 0;
        System.out.println("Welcome to the Hospital System");
         do{
        System.out.println("1-Adding a patient to the waiting list."); 
        
        System.out.println("2-Assigning the patient to a doctor according to the clinic name.");
        
 
        System.out.println("3-Remove a patient record from the list using patient ID.");

       

        System.out.println(" Enter your choice ");
    choice=input.nextInt();
    
    
    
    
    
    switch(choice)
    {
        case 1:
            Add_patient();
            
            break;
        case 2:
            System.out.println("enter Patient id for  Assigning to doctor ");
            Assigning_patient_to_doctor(input.next());
            break;
        case 3:
                        System.out.println("enter Patient id to remove from waiting list");

            Remove_Patient(input.next());
            patients.print();
            
        case 4:
            System.out.println("Enter Clinic Name ");
            
            CountDoctors(input.next());

                    
    }
    
    }while(choice!=999);

}
}