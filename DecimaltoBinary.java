import java.util.Scanner;
public class DecimaltoBinary {

    public static void main(String[] args) {
        StringBuilder onesComplement = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String binary=" ";
        while(n>0){
            int bit=n%2;
                binary = bit + binary;
            n/=2;
        }
        return binary;
        System.out.println(result);
        for(int i=0;i<result.length();i++){
            char bit = result.charAt(i);
            if(bit == '0'){
                onesComplement.append('1');

            }
            else{
                onesComplement.append('0');
            }
        }
        System.out.println(result);
    }
}
    
