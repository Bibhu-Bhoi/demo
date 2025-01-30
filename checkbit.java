public class checkbit {
    public static void main(String[] args) {
        int n=12;
        int k=2;
        if ((n&(1<<k))==0){
            System.out.println("unset bit");

        }
        else{
            System.out.println("set bit");
        }
    }
    
}
