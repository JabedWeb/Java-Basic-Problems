
 class NumberValue {
    int length;
    int height;
    String areaname;
    double area;
  public NumberValue(int l,int h,String type) {
      length=l;
      height=h;
      areaname=type;
      area=0.5*length*height;
  }
   public NumberValue(String type,int h,int l) {
      length=l;
      height=h;
      areaname=type;
      area=length*height;
  }
      public NumberValue(String type,int r) {
      length=r;
      areaname=type;
      area=3.14*(r*r);
  }
  public void display() {
     System.out.println("total area of "+ areaname +" "+ area);
  }
}
public class area {
  public static void main(String[] args) {
  NumberValue obj1 = new NumberValue(20,10,"tri");
    NumberValue obj2 = new NumberValue("rec",20,10);
     NumberValue obj3 = new NumberValue("circle",10);
     obj1.display();
        obj2.display();
        obj3.display();
  }
}

