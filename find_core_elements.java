import java.util.Scanner;
public class find_core_elements {
    public static void main(String[] args) {
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
        System.out.println("core elements are:");
        for(int i=0;i<r;i++){}
    }
}
