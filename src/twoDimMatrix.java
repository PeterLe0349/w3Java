public class twoDimMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6}};
//        for(int i = 0; i < matrix.length; i++){
//            for(int j = 0; j<matrix[i].length; j++){
//                System.out.println(matrix[i][j]);
//            }
//        }
        int k = 3;
        System.out.println(k++);
        int[][] matrix2 = {{0, 1, 1, 2},
                {0, 5, 0, 0},
                {2, 0, 3, 3}};
//        System.out.println(solution(matrix2));
    }

    static int solution(int[][] matrix) {
        int s = 0;
        for (int c = 0; c < matrix[0].length; ++c)
            for (int r = 0; r < matrix.length; ++r) {
                if (matrix[r][c] > 0)
                    s+=matrix[r][c];
                else break;
            }
        return s;
    }
}
