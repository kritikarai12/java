import java.util.*;
public class rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number of rows: ");
        
        int m = sc.nextInt();
        // for (int i=1; i<=m; i++){
        //     System.out.println("****");
        // }
        //OR
        System.out.print("enter number of col: ");
        int n = sc.nextInt();
        for (int i=1; i<=m; i++){
            for (int j=1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();

        }
    }

    
}