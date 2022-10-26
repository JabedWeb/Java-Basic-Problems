
 class NumberValue {
     String Name;
   int num;
   public NumberValue(String name,int n) {
       Name=name;
      num = n;
   }
   public void display() {
      System.out.println("Name" + Name+" The number is: " + num);
   }
}
public class simplecon {
   public static void main(String[] args) {
      NumberValue obj2 = new NumberValue("Jabed",15);
      obj2.display();
   }
}
