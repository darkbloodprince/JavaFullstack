class Customer {
    String id;
    String name;
    String phone;
    String email;
    String location;

    Customer(String id, String name, String phone, String email, String location) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.location = location;
    }
}

class DefaultConstructor1 {
    public static void main(String args[]) {
        Customer c = new Customer("1", "Ramesh", "948362748", "ramesh@gmail.com", "Hyd");
        System.out.println(c.id + " " + c.name + " " + c.phone + " " + c.email+ " " + c.location);
    }
}