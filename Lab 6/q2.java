import java.util.Scanner;

class Number {
    public int[] arr;
    int n;

    Number() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the number of integers : ");
        n = sc.nextInt();
        arr = new int[n];
    }
    
    void getdata() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the data : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
    }

    void display() {
        System.out.print("\n");
        for (int i = 0; i < n; i++) {
            System.out.print("\tarr["+i+"] : "+arr[i]+"\n");
        }
    }

    void swap() {
        int min = arr[0], max = arr[0];
        int x = 0, y = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
                x = i;
            }
            if (arr[i] > max) {
                max = arr[i];
                y = i;
            }
        }
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
        System.out.print("\n\nNumbers to be swapped are : arr["+x+"] = "+arr[x]+" and arr["+y+"] = "+arr[y]);
        display();
    }
}

public class q2 {
    public static void main(String[] args) {
        Number obj = new Number();
        obj.getdata();
        obj.display();
        obj.swap();
    }
}