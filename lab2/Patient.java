
package lab2;
class Patient {
    
    String id;
    int age;
    String name;
    String clinic;

    public Patient() {
    }

    public Patient(String id, int age, String name, String clinic) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.clinic = clinic;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getclinic() {
        return clinic;
    }

    public void setclinic(String clinic) {
        this.clinic = clinic;
    }

    @Override
    public String toString() {
        return String.format("Name: %s , Age: %d, clinic: %s ", name, age, clinic);
    }


}
