public class floydtrianpatt {
    public static void main(String args[]){
        int n = 5;
        int sum =0;
        for(int i = 0; i<=n; i++){
            for( int j = 1; j<=i; j++){
                sum = sum +1;
                System.out.print(sum+" ");
            }
            System.out.println();
        }
    }
    
}
