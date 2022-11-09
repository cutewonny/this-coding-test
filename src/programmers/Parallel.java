package programmers;

public class Parallel {
    public static void main(String[] args) {

        int[][] dots = {{1, 4}, {9, 2}, {3, 8}, {11, 6}};
//        int[][] dots = {{3, 5}, {4, 1}, {2, 4}, {5, 10}};

        Parallel parallel = new Parallel();
        Parallel.Solution solution = parallel.new Solution();
        int result = solution.solution(dots);
        System.out.println("결과는>>>>>>>>>>> "+result);


    }


    class Solution {
        public int solution(int[][] dots) {
            int answer = 0;
            float degree1 = (dots[0][0]-dots[1][0]) / (float)(dots[0][1]-dots[1][1]);
            float degree1_sub = (dots[2][0]-dots[3][0]) / (float)(dots[2][1]-dots[3][1]);
            System.out.println(degree1+"  "+degree1_sub);

            float degree2 = (dots[0][0]-dots[2][0]) / (float)(dots[0][1]-dots[2][1]);
            float degree2_sub = (dots[1][0]-dots[3][0]) / (float)(dots[1][1]-dots[3][1]);
            System.out.println(degree2+"  "+degree2_sub);

            float degree3 = (dots[0][0]-dots[3][0]) / (float)(dots[0][1]-dots[3][1]);
            float degree3_sub = (dots[1][0]-dots[2][0]) / (float)(dots[1][1]-dots[2][1]);
            System.out.println(degree3+"  "+degree3_sub);

            if(degree1==degree1_sub || degree2 == degree2_sub || degree3 == degree3_sub){
                return 1;
            }

            return answer;
        }
    }
}


