import java.util.Scanner;
public class second {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("size: ");
        int n = a.nextInt();
        int[] b = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) {
            b[i] = a.nextInt();
        }
        int largest, secondLargest;
        if (b[0] > b[1]) {
            largest = b[0];
            secondLargest = b[1];
        } else {
            largest = b[1];
            secondLargest = b[0];
        }
        for (int i = 2; i < n; i++) {
            if (b[i] > largest) {
                secondLargest = largest;
                largest = b[i];
            }
            else if (b[i] < largest && b[i] > secondLargest)
                secondLargest = b[i];
        }
        System.out.println("second largest element is:"+secondLargest);
    }
}        
