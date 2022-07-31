public class swapOnceOnlyForIncrementArray {
    public static void main(String[] args) {
//        System.out.println(reverse(12300));
        String regex = "^0+";
        String s = "00000004500123";
        s = s.replaceAll(regex, "");
        System.out.println(s);
    }


    public  static int reverse(int n){
        int revNum = 0;
        String s = n + "";
        StringBuffer sb = new StringBuffer(s);
        sb.reverse();
        s = "";
        revNum = Integer.parseInt(sb + "");
        return revNum;

    }
}
