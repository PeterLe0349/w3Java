public class interestingPolygon {
    public static void main(String[] args) {
        solution(3);
    }

    static int solution(int n) {
        int area = 0;
        for(int i = 0; i <=n; i++){
            if(i==0){
                area += 0;
            }
            if(i==1){
                area += 1;
            }
            if(i>1){
                area += 4 + ((i-2)*4);
            }
            System.out.println(String.format("area of %d is %d", i, area));
        }
        return area;
    }
}
