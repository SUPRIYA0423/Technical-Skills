import java.util.Scanner;
public class timetaken {
    public static void main(String args[]){
        Scanner a= new Scanner(System.in);
        System.out.println("enter the size :");
        int n=a.nextInt();
        int b[]=new int[n];
        System.out.println("enter array elements:");
        for(int i=0;i<n;i++){
            b[i]=a.nextInt();
        }
        int max = b[0];
        for (int i = 1; i < n; i++) {
            if (b[i] > max) {
                max = b[i];
            }
        }
         int time = 0;
        for (int i = 0; i < n; i++) {
            time += (max - b[i]);
    }
    System.out.println("time taken is:"+time);
}
}
