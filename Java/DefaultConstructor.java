class Employee {
    String id;
    String name;
    String location;
    String designation;

    Employee(String id, String name, String location, String designation) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.designation = designation;
    }
}

class DefaultConstructor {
    public static void main(String args[]) {
        Employee e = new Employee("1", "Suresh", "Hyd", "Manager");
        System.out.println(e.id + " " + e.name + " " + e.location + " " + e.designation);
    }
}