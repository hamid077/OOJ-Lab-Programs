 class Colour<c, s>{
   c color;
   s fade;
   Colour(c o,s r){
      this.color = o;
      this.fade=r;
   }
   public void display() {
      System.out.println("the content is: "+this.color+" and the fade is:"+this.fade);
     
   }
}
public class Generic1{
   public static void main(String args[]) {
      Colour<String, Integer>ob1=new Colour<String, Integer>("Orange", 88);
      ob1.display();
      Colour<String, Integer>ob2=new Colour<String, Integer>("Green", 90);
      ob2.display();
         }
}