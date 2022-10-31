package material.q1;

import java.util.Scanner;

public class UDLR {


    public static void main(String[] args) {

        // n을 입력 받기
        Scanner sc = new Scanner(System.in);

        System.out.println("지도의 크기를 입력하시오>> ");
        int n = sc.nextInt();



        System.out.println("이동하고자 하는 방향을 띄어쓰기로 적어주세요>> ");
        sc.nextLine();
        String test = sc.nextLine();
        System.out.println("test>>> "+test);

        //방향 문자 입력 받기, 몇개가 입력 받을지 모름
//        String[] direction = new String[n];

        String[] direction = test.split(" ");

        //시작하는 값 (x,y) == (1,1)
        int x = 1, y =1;

        // 글자에 따른 이동하는 방향
        int[] dx = {0, 0, -1 ,1};
        int[] dy = {-1, 1, 0, 0};
        String[] move_types = {"L", "R", "U", "D"};



        // 방향값 하나씩 꺼내서
        for(int i=0; i<direction.length; i++){
//            System.out.println(direction[i]);
            //기존 좌표 x,y에 값을 움직이기
            String check = direction[i];
            int tempY = 1;
            int tempX = 1;
            boolean checkLR = false;
            switch (check){
                case "L":
                    System.out.println("L~~");
                    tempY = y + dy[0];
                    System.out.println(tempY);
                    break;
                case "R":
                    System.out.println("R~~");
                    tempY = y + dy[1];
                    break;
                case "U":
                    System.out.println("U~~");
                    tempX = x + dx[2];
                    checkLR = true;
                    break;
                case "D":
                    System.out.println("D~~");
                    tempX = x + dx[3];
                    checkLR = true;
            }

            //공간을 벗어나는 경우 움직이지 않는다
            if(tempX<1||tempX>n){
                System.out.println("x 없었던 일로");
                continue;
            }
            if(tempY<1||tempY>n){
                System.out.println("y 없었던 일로");
                continue;
            }

            if(checkLR){
                x= tempX;
            }else{
                y = tempY;
            }



        }// end for

        System.out.println("결과>>> "+x+y);





    }
}
