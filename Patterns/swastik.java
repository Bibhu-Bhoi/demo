package Patterns;
public class swastik {

    public static void main(String[] args) {
        int n = 9;
        int mid = n /2;
        if (n%2==1){
            for(int i=0; i<n;i++){
                for(int j=0; j<n;j++){
                    if((i==mid || j==mid) || (j==0 && i<=mid)||(i==0 && j>=mid) || (i==n-1 && j<=mid) || (j==n-1 && i>=mid)){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }

        }
        else{
            System.out.println(" please enter a odd number");
        }
    }
}