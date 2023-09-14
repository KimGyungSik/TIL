package Chapter01;

public class Ex5_9 {
    public static void main(String[] args) {
        char[][] star = {
                {'*','*',' ',' ',' '},
                {'*','*',' ',' ',' '},
                {'*','*','*','*','*'},
                {'*','*','*','*','*'}
        };                          // [5][4]
        char[][] result = new char[star[0].length][star.length];
        for(int i=0; i < star.length;i++) { // 4번 반복
            for(int j=0; j < star[i].length;j++) { //star[0][j]
                System.out.print(star[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        for(int i=0; i < star.length;i++) { // 4번 반복
            for(int j=0; j < star[i].length;j++) { // 5번 반복
                //2차원 배열은 그림으로 좌표 찍어서 값비교하는 것이 좋음
                int x =  j;
                int y =  star.length-1-i; //i+y=3 => y= star.length-1-i
                result[x][y] = star[i][j];
            }
        }
        for(int i=0; i < result.length;i++) { // 5번 반복
            for(int j=0; j < result[i].length;j++) { // 4번 반복
               System.out.print(result[i][j]);
            }
            System.out.println();
        }
    } // end of main
} // end of class


