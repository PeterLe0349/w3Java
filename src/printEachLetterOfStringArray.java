public class printEachLetterOfStringArray {

    public static void main(String[] args) {
        String[] strings = {"Hello", "Pete", "Le", "Bahumbug"};
        String fs = "";
        int longest = 0;
        for(int i= 0; i< strings.length; i++){
            if(strings[i].length() > longest){
                longest = strings[i].length();
            }
        }
        for(int j = 0; j < longest; j++){
            for(int k= 0; k < strings.length; k++){
                if(strings[k].length() > j){
                    fs += strings[k].charAt(j);
                }
            }
        }
        System.out.println(String.format("Final mixed string is: %s", fs));



        System.out.println(String.format("The longest is: %d", longest));


    }

}
