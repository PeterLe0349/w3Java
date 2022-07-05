import java.util.ArrayList;

public class ZTest2 {
    public static void main(String[] args) {
        String abra = "abracadbra";
        System.out.println(abra.length());
        char[] chars = abra.toCharArray();
        for(char c: chars){
            System.out.println(c);
        }
        ArrayList<Character> cha = new ArrayList<>();
        for(char c: chars){
            cha.add(c);
        }
        System.out.println(cha.size());
        for(int i = cha.size()-1; i >=0; i--){
            System.out.printf("%s ", cha.get(i));
        }
    }
}
