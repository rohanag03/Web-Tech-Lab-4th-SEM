import java.util.*;
public class q7
 {
    System.out.println("Enter the number of elements: ");
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();;
    int[] arr = new int[n];
    public void read(){
        System.out.println("Enter the elements: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
    }
    public void swap(){
        int smallest=0, largest=0;
        for(int i=0;i<n;i++){
            if(arr[i]<arr[smallest]){
                smallest = i;
            }
            if(arr[i]>arr[largest]){
                largest = i;
            }
        }
        int temp = arr[smallest];
        arr[smallest] = arr[largest];
        arr[largest] = temp;
    }
    public void display(){
        System.out.println("Array after swap-:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args){
        q7 obj = new q7();
        obj.read();
        obj.swap();
        obj.display();
    }
}