public class swap {
    public static void main(String[] args) {
        int n=19;
        int n1=20;
        System.out.println("the numbe is before swapping:"+n+" "+n1);
        n=n^n1;
        n1=n^n1;
        n=n^n1;
        System.out.println("afetr swapping the numbers are:"+n+" "+n1);
    }
}
