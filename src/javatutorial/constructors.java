package javatutorial;
class MyEmployee{
    private int id;
    private  String name;
//this is done when nothing is given kind of predefined function
//    when no arguments is passed it will run this one
//    public MyEmployee(){
//        id = 45;
//        name = "Vanshika Teotia";
//    }
//    here ive passed arguments
    public MyEmployee(String n,int i){
        name = n;
        id = i;
    }
    public void setName(String n){
        name = n;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public void setId(int i){
        id = i;
    }
}
public class constructors {
    public static void main(String[] args) {
//given parameters
        MyEmployee vanshi = new MyEmployee("vanshika teotia ",12);
//        vanshi.setName("Vanshika Teotia");
//        vanshi.setId(34);
        System.out.println(vanshi.getId());
        System.out.println(vanshi.getName());

    }
}
