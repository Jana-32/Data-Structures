
package lab2;
public class Doctor {
   
    String id;
    String name;
    String clinic;

    public Doctor(String id, String name, String clinic) {
        this.id = id;
        this.name = name;
        this.clinic = clinic;

    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setclinic(String clinic) {
        this.clinic = clinic;
    }

    public String getSpecialty() {
        return clinic;
    }

    @Override
    public String toString() {
        return "\nName :" + name + ", Clinic:" + clinic;
    }


        
        
    }
    

