public class orderFromSmallToBigdifference1 {
    //arrange small to big, size of 1 difference, find minimal number of statues
    public static void main(String[] args) {
        int[] ints = {2,3,4,5,10};
        System.out.println(solution(ints));
    }

    public static int solution(int[] statues) {
        //get smallest and biggest, get difference to find total statues needed, compare with size
        //difference is least number of statues needed
        int smallest = statues[0];
        int largest = statues[0];
        for(int i = 0; i < statues.length; i++){
            if(statues[i] < smallest){
                smallest = statues[i];
            }
            if(statues[i]> largest){
                largest = statues[i];
            }
        }
        int totalNeeded = largest - smallest + 1;
        return totalNeeded - statues.length;

    }
}

