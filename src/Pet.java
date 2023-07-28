public class Pet {
//    INSTANCE VARIABLES
    private String name = null;
    private int age = 0;
    private String location = null;
    private String type = null;

    public Pet() {
        System.out.println("You should get a pet");
    }
    public Pet(String name, int age, String location, String type) {
        setName(name);
        setAge(age);
        setLocation(location);
    }

//    SET METHODS
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setLocation(String location) {
        this.location = location;
    }

//    GET METHODS
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getType() {
        return type;
    }

    public static void main(String[] args) {
        Pet newPet = new Pet("Teddy", 3, "Texas", null);
        System.out.println(newPet.getName());
        System.out.println(newPet.getAge());
        System.out.println(newPet.getType());
        newPet.setAge(5);
        System.out.println(newPet.getAge());
        System.out.println(new Pet());
    }
}
