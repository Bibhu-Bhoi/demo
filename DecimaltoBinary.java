import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int n = sc.nextInt();
        sc.close();
        
        // Convert decimal to binary
        String binary = Integer.toBinaryString(n);
        System.out.println("Binary: " + binary);
        
        // Calculate 1's complement
        StringBuilder onesComplement = new StringBuilder();
        for (char bit : binary.toCharArray()) {
            onesComplement.append(bit == '0' ? '1' : '0');
        }
        System.out.println("1's Complement: " + onesComplement);
        
        // Calculate 2's complement
        StringBuilder twosComplement = new StringBuilder(onesComplement);
        boolean carry = true;
        for (int i = twosComplement.length() - 1; i >= 0; i--) {
            if (carry) {
                if (twosComplement.charAt(i) == '1') {
                    twosComplement.setCharAt(i, '0');
                } else {
                    twosComplement.setCharAt(i, '1');
                    carry = false;
                }
            }
        }
        
        System.out.println("2's Complement: " + twosComplement);
    }
}
