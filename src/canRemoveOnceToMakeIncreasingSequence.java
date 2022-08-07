public class canRemoveOnceToMakeIncreasingSequence {
    public static void main(String[] args) {
        int[] ints = {1,2,3,4,3,6};
        System.out.println(solution(ints));

    }

    static boolean solution(int[] sequence) {
        //loop it with i < length-1 (includes the one in front to compare)
        //have a boolean for one removal set to true
        //compare to next, if it's bigger and can remove , remove the number, set it to itself'
        //to avoid having to delete an array element
        //change boolean to false if they did delete/swap
        //correction - remove the number itself it is bigger
        boolean isIncreasing = true;
        boolean canRemoveONce = true;
        int biggest = sequence[0];
        for(int i = 0; i< sequence.length-1; i++){
            System.out.println(String.format("i/i+1:  %d/%d", sequence[i],sequence[i+1]));
            if(sequence[i] >= sequence[i+1]){
                //if bigger or same size
                if(canRemoveONce) {
                    canRemoveONce = false;
                    //do a remove the next one instead of front one;
                    //copy array except for i
                    System.out.println("exclude i");
                    int[] copy = new int[sequence.length - 1];
                    int count = 0;
                    for (int j = 0; j < sequence.length; j++) {
                        if (j != i) {
                            copy[count++] = sequence[j];
                        }
                    }
                    boolean checkExcludeCurrent = true;
                    for(int k = 0; k < copy.length-1; k++){
                        if(copy[k] >= copy[k+1]){
                            checkExcludeCurrent = false;
                            break;
                        }
                    }
                    if( checkExcludeCurrent == true) {
                        return true;
                    }
                    System.out.println("exclude i+1");
                    //copy arrray except for i+1
                    int[] copy2 = new int[sequence.length - 1];
                    int count2 = 0;
                    for (int l = 0; l < sequence.length; l++) {
                        if (l != i+1) {
                            copy2[count2++] = sequence[l];
                        }
                    }
                    for(int z = 0; z < copy2.length; z++){
                        System.out.print(copy2[z] + " ");
                    }
                    boolean checkExcludeCurrent2 = true;
                    for(int m = 0; m < copy2.length-1; m++){
                        if(copy2[m] >= copy2[m+1]){
                            System.out.println(String.format("i and i+2: %d / %d", copy[m],copy[m+1]));
                            checkExcludeCurrent2 = false;
                            break;
                        }
                    }
                    return checkExcludeCurrent2;
                }else{
                    isIncreasing = false;
                }
            }else{
                //if smaller than next number skip
            }
        }

        return isIncreasing;

    }


}
