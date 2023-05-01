import java.util.Scanner; 
public class Name 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String fname = sc.nextLine();
        System.out.print("Enter your lastname: ");
        String lname = sc.nextLine();
        System.out.println(lname + ", " + fname);
    }
}