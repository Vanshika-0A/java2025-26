package javatutorial;
class MYEmployee{
    private int id;
   private  String name;
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


public class getterssetters {
    public static void main(String[] args) {
        MYEmployee vanshi = new MYEmployee();
//        vanshi.id = 45;
//        vanshi.name = "Vanshika Teotia"
// throws error due to private modifiers
        vanshi.setName("Vanshika Teotia");
        System.out.println(vanshi.getName());

    }
}
