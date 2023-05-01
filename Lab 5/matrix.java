import java.util.Scanner;

public class matrix
{
    public static void main(String[] args) 
    {
        int LDiag=0;
        int RDiag=0;
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        System.out.println("Enter the elements: ");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                arr[i][j] = sc.nextInt();
                if(i==j)
                    RDiag += arr[i][j];
            }
        }
        int m=3;
        for(int i=0; i<3; i++){
            m--;
            for(int j=0; j<3; j++){
                if(j==m)
                    LDiag += arr[i][j];
            }
        }

        System.out.println("Right Diagonal sum: "+RDiag);
        System.out.println("Left Diagonal sum: "+LDiag);
    }
}