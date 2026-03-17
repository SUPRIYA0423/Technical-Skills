import java.util.Scanner;
public class pair-sum-problem{
    public static void main(String args[]){
        Scanner a=new Scanner(System.in);
        System.out.println("enter size:");
        int n=a.nextInt();
        int b[]=new int[n];
        System.out.print("enter array elements:");
        for(int i=0;i<n;i++){
            b[i]=a.nextInt();
        }
        System.out.println("enter the value of k:");
        int k=a.nextInt();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(i!=j && b[i]+b[j]==k){
                    System.out.println("yes pair exist");
                }
                else{
                    System.out.print("no pair exist");
                }
            }
        }
     
    }
}
