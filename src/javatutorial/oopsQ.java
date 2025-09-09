package javatutorial;
class Employee1{
    int salary;
    String name;
    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
    public void setSalary(int i){
        salary = i;
    }
}
class cellphone{
    public void vibrate(){
        System.out.println("vibrating....");
    }
    public void ring(){
        System.out.println("Ringing.....");
    }
    public void callfriend(){
        System.out.println("friend is calling");
    }
}
class square {
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }

}
public class oopsQ {
    public static void main(String[] args) {
/*
//        problem 1
        Employee1 kannu = new Employee1();
        kannu.setSalary(15);
        kannu.setName("Kanishka Teotia");
        System.out.println(kannu.getName());
        System.out.println(kannu.getSalary());
//problem 2
        cellphone vivo = new cellphone();
       vivo.vibrate();
       vivo.ring();
       vivo.callfriend();
*/}
}
