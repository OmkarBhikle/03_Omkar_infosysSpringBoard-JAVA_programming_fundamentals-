import java.util.Scanner;

public class EnhancedForLoop {
    int[] arr = new int[5];

    public  void getarr(int[] arr) { 
        for(int i: arr) {
            System.out.println(i);
        }    
    }


    public void setarr(int[] arr) {
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<arr.length; i++) {
            System.out.println("Enter the value for index " + i + ": ");
            arr[i] = sc.nextInt();
        }
        sc.close();
    }

    public static void main(String[] args) {
        EnhancedForLoop loop = new EnhancedForLoop();
        loop.setarr(loop.arr);
        loop.getarr(loop.arr);
    }
}
