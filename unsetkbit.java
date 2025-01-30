public class unsetkbit {
    public static void main(String[] args) {
        int n=14;
        int p=0;
        int r= n &~ (1<<p);// if you want to start the potion from to 1 then n|(1<<p-1)
        System.out.println(r);
    }
    
}
