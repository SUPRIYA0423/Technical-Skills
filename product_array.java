import java.util.Scanner;

public class ProductArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] A = new int[n];
        int[] P = new int[n];
        System.out.print("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        int totalProduct = 1;
        for (int i = 0; i < n; i++) {
            totalProduct = totalProduct * A[i];
        }
        for (int i = 0; i < n; i++) {
            P[i] = totalProduct / A[i];
        }
        System.out.print("Product array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(P[i] + " ");
        }
    }
}
