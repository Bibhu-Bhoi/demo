public class pattern1 {
    public static void pattern1(int n) {
        for(int i=0;i<=n;i++){
            for(int j=0; j<=n; j++){
                if(j==n-1){
                System.out.print("* ");
                }
                else{
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n=3;
        pattern1(n);
    }
    
}
