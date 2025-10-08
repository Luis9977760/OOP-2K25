public class Pyramid {
    public static void main(String[] args) {

        int num= 6;

        for(int row = num; row>=1; row--){
            for (int col=1; col<=(num-row); col++){
                System.out.print("  ");
            }
            for (int j = 1; j <= row; j++) {
                System.out.print(j + " ");
            }
            System.out.println( );
        }
    }
}
