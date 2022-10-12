package bookex;

public class quickdip {
    public static void main(String[] args) {
//        ex1();
        ex2();

    }

    public static void ex2(){
        int x = 5;
        while(x > 1){
            x= x-1;
            if( x<3){
                System.out.println("small x");
            }
        }
    }

    public static void ex1(){
        int x = 1;
        while( x< 10) {
            if (x>3){
                System.out.println("big x");
            }
            x++;
        }
    }

}
