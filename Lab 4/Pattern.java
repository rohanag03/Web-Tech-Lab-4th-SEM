import java.util.*; 
public class Pattern  
{    
    public static void main(String args[])   
    {    
        int i, j, row;
        Scanner in = new Scanner(System.in); 
        System.out.print("IEnter no of rows: ");
        row = in.nextInt();       
        for (i=0; i<row; i++)   
        {      
            for (j=row-i; j>1; j--)   
            {   
                System.out.print(" ");   
            }     
            for (j=0; j<=i; j++ )  
            {         
                System.out.print("* ");   
            }   
            System.out.println();   
        }   
    }   
}