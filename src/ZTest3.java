import java.util.Arrays;

public class ZTest3 {
    public static void main(String[] args) {

        System.out.println("Hello Peter");
        String s = "aasdfbba";
        char[] chars= s.toCharArray();
        if(chars[1] == chars[2]){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }

        int[] nums = {1,3,4};
//        System.out.println(Arrays.toString(nums));nums
//        System.out.println(s.substring(2,3));
        String a = "abbaa";
        String b = a;
        a = "petele";
        System.out.println(b);

        String[] tokens= a.split(" ");
        System.out.println(Arrays.toString(tokens));
        System.out.println(a.substring(0,0));

    }
}
