import java.util.Scanner;
public class frame_elements_sum {
    public static void main(String args[]){
        Scanner a=new Scanner(System.in);
        System.out.println("enter rows:");
        int r=a.nextInt();
        System.out.print("enter column:");
        int c=a.nextInt();
        int [][]m=new int[r][c];
        System.out.print("enter elements:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                m[i][j]=a.nextInt();
            }
        }
        int sum=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(i==0 || j==0 || i==r-1 || j==c-1){
                    sum=sum+m[i][j];
                }
            }
        }
        System.out.print("sum of frame is:"+sum);
    }
}
