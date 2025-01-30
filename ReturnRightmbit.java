public class ReturnRightmbit {
    public static void main(String[] args) {
        
    int n = 16;
    int mask = 1;
    int pos=0;
    while((n & mask) == 0){
        pos +=1;
        mask = mask<<1;
    }
    System.out.print(pos);
    
}
}