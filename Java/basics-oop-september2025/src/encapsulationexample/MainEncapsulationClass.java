package encapsulationexample;

public class MainEncapsulationClass {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher();

        teacher1.setId(123);
        teacher1.setName("Deepika");
        teacher1.setQualification("Msc");
        teacher1.setSalary(30000.00);
        teacher1.setEmail("deepika123@gmail.com");

        System.out.println("teacher1 is : "+teacher1);

        System.out.println("teacher1 name is  : "+teacher1.getName());
        System.out.println("teacher1 qualification is  : "+teacher1.getQualification());
        System.out.println("teacher1 email is  : "+teacher1.getEmail());
    }
}
