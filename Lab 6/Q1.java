public class Q1 {
    public  void subtract(int a, int b){
       System.out.println("Subtraction of " + b + " from " + a + " is: " +(a-b));
   }
     public void subtract(double a, double b){
       System.out.println("Subtraction of " + b + " from " + a + " is: " +(a-b));
   }
    public void subtract(int a, double b){
       System.out.println("Subtraction of " + b + " from " + a + " is: " +(a-b));
   }
    public void subtract(double a, int b){
       System.out.println("Subtraction of " + b + " from " + a + " is: " +(a-b));
   }
   public static void main(String[] args) {
       Q1 obj = new Q1();
       obj.subtract(7, 2);
       obj.subtract(5.7, 2.3);
       obj.subtract(5, 3.1);
       obj.subtract(2.1, 1);
   }
}