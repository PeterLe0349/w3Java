import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllLongestStrings {
    public static void main(String[] args) {
        String[] s = {"bf", "jadf", "adkjf", "ad", "adfds"};
        System.out.println(Arrays.toString(solution(s)));

    }

    static String[] solution(String[] inputArray) {
        int longest = 0;
        int arrCount = 0;
        List<String> longStrings = new ArrayList<>();
        for(int i = 0; i< inputArray.length; i++){
            if(inputArray[i].length() > longest){
                longStrings.clear();
                longest = inputArray[i].length();
                arrCount = 1;
                longStrings.add(inputArray[i]);
            }else if(inputArray[i].length() == longest){
                arrCount++;
                longStrings.add(inputArray[i]);
            }
        }
        return longStrings.toArray(new String[0]);

    }

}
