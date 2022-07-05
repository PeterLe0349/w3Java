public class ZTest1 {
    public static void main(String[] args) {
        System.out.println("Hello World");
        String s = "Hello Fantastic World";
        String[] sTokens = s.split("\\s");
        System.out.println(sTokens.length);
        for(String ss: sTokens){
            System.out.println(ss);
        }

    }
}
