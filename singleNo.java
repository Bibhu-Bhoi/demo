public class singleNo {
    public static void main(String[] args) {
        int nums[]={2,2,1};
        int uni = 0;
        for(int i : nums){
            uni = uni ^ i;
        }
        System.out.println(uni);
    }
    
}
