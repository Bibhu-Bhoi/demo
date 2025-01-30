import java.util.Scanner;
public class posAlphabat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch = sc.next().charAt(0);
        int pos = ch&31;
        System.err.println(pos);
        
    }
    
}
