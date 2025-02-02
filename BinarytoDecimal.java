import java.util.Scanner;
public class BinarytoDecimal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String binary = sc.nextLine();
        int decimal=0;
        int p=1;
        for(int i=binary.length()-1;i>=0;i--){
            int bit=binary.charAt(i)-'0';
            decimal = bit + p;
            p *= 2;
        }
        System.out.println(decimal);
    }}
