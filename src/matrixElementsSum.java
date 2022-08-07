public class matrixElementsSum {
    public static void main(String[] args) {

        //do not add any room tha is under the previous row that is zero
        int[][] matrix = {{0, 1, 1, 2},
                {0, 5, 0, 0},
                {2, 0, 3, 3}};
        System.out.println(solution(matrix));

    }

    static int solution(int[][] matrix) {
        //sum up the first row
        //for rows after i, check p
        //replace with 0 if row column is under ghost 0
        //rectangular matrix, so excpect similiar row lengths
        int sum = 0;
        for(int i = 0; i< matrix.length; i++){
            //iterate through all the rows
            for(int j = 0; j < matrix[i].length; j++){
                sum += matrix[i][j];
                //iterate through the columns
                if(matrix[i][j] == 0){
                    //make underneath one zero if row exists
                    if(i+1 < matrix.length){
                        //change all the bottom columns to zero
                        matrix[i+1][j] = 0;
                    }
                }
            }
        }
        return sum;

    }


}
