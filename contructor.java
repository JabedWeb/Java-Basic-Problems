
 class NumberValue {
     String Name;
   int num;
   public NumberValue(String name,int n) {
       Name=name;
      num = n;
   }
     public NumberValue(int n,String name) {
       Name=name;
      num = n;
   }
   public void display() {
      System.out.println("Name " + Name+" The number is: " + num);
   }
}
public class Main {
   public static void main(String[] args) {
   NumberValue obj1 = new NumberValue(20,"Nayeem");
      NumberValue obj2 = new NumberValue("Jabed",15);
      obj1.display();
      obj2.display();
   }
}

