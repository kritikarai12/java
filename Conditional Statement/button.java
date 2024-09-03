import java.util.*;
public class button {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();
        // if (button==1){
        //     System.out.println("hello");
        // }else if (button==2){
        //     System.out.println("world");
        // }else if (button==3){
        //     System.out.println("hiii");
        // }else{
        //     System.out.println("invalid button");
        // }        
        switch (button) {
            case 1:System.out.print("hello");
            break;
            case 2:System.out.print("world");
            break;
            case 3:System.out.print("hiii");
        
            default:System.out.print("invalid statement");
            
        }
    }        
}
