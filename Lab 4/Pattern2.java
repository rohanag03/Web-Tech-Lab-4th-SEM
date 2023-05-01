import java.util.*;
public class Pattern2  
{              
    public static void main(String[] args)  
    {  
        int alphabet = 65;  
        Scanner in = new Scanner(System.in); 
        System.out.print("IEnter no of rows: ");
        int n = in.nextInt();
        for (int i = 0; i <= n; i++)  
        {        
        for (int j = 0; j <= i; j++)  
        {    
            System.out.print((char) (alphabet + j) + " ");   
        }  
        System.out.println();  
        }  
    }  
}  