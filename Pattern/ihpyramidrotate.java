import java.util.*;;

public class ihpyramidrotate {
    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);
    System.out.print("enter no of rows :");
    int n = sc.nextInt();
    for (int i=1; i<=n; i++){
        for (int j=1; j<=n-i; j++){
            System.out.print(" ");
        }
        for ( int j=1; j<=i; j++){
            System.out.print("*");
        }
        System.out.println();
    }
    }
    
}
