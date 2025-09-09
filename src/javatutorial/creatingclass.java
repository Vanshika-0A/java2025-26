package javatutorial;
class Employee{
    int id;
    String name;
    public void printDetails(){
        System.out.println("My name is "+name);
        System.out.println("My id is "+id);
    }
}

public class creatingclass {
    public static void main(String[] args) {
        System.out.println("This is our custom class ");
        Employee vanshi = new Employee();
        vanshi.name = "Vanshika Teotia";
        vanshi.id = 14;
        Employee kannu = new Employee();
        kannu.name = "Kanishka Teotia";
        kannu.id = 18;
        kannu.printDetails();
        vanshi.printDetails();



    }
}
