public class Countbit {
    public static void main(String[] args) {
        int n=12;
        int count = 0;
        while (n>0){
            count=count+(n&1);
            n=n>>1;
        }
        System.out.println(count);
    }
    
}
