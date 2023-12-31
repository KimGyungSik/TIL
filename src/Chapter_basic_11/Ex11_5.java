package Chapter_basic_11;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Ex11_5 {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4};
        int[][] arr2D = {{11,12,13}, {21,22,23}};

        System.out.println("arr="+ Arrays.toString(arr));
        System.out.println("arr2D="+Arrays.deepToString(arr2D));

        int[] arr2 = Arrays.copyOf(arr, arr.length); // arr2 = 0,1,2,3,4
        int[] arr3 = Arrays.copyOf(arr,3); // arr3 = 0,1,2
        int[] arr4 = Arrays.copyOf(arr,7); // arr4 = 0,1,2,3,4,0,0
        int[] arr5 = Arrays.copyOfRange(arr,2,4); // arr5 = 2,3
        int[] arr6 = Arrays.copyOfRange(arr,0,7); // arr6 = 0,1,2,3,4,0,0

        System.out.println("arr2="+ Arrays.toString(arr2));
        System.out.println("arr3="+ Arrays.toString(arr3));
        System.out.println("arr4="+ Arrays.toString(arr4));
        System.out.println("arr5="+ Arrays.toString(arr5));
        System.out.println("arr6="+ Arrays.toString(arr6));

        int[] arr7 = new int[5];
        Arrays.fill(arr7,9); // arr=[9,9,9,9,9] 9로 채우기
        System.out.println(Arrays.toString(arr7));

        Arrays.setAll(arr7,i->(int)(Math.random()*6)+1); // 1~6사이의 난수로 채우기
        System.out.println(Arrays.toString(arr7));

        for(int i : arr7) {  // 향상된 for문
            //for(int x=0; x<arr7.length; x++) {
            //      int i = arr7[x];
            char[] graph = new char[i]; // i값의 크기만큼의 문자배열 생성
            Arrays.fill(graph,'*'); // 문자배열에 '*'로 채우기
            System.out.println(new String(graph)+i); // 문자배열을 문자열로 바꾸고 + i값
        }

        String[][] str2D = new String[][]{{"aaa","bbb"},{"AAA","BBB"}};
        String[][] str2D2 = new String[][]{{"aaa","bbb"},{"AAA","BBB"}};

        System.out.println(Arrays.equals(str2D,str2D2)); // false
        System.out.println(Arrays.deepEquals(str2D,str2D2)); // True

        char[] chArr = {'A','D','C','B','E'};

        System.out.println("chArr = "+Arrays.toString(chArr));
        System.out.println("index of B = "+Arrays.binarySearch(chArr,'B'));
        System.out.println("= After sorting =");
        Arrays.sort(chArr); // 배열을 정렬, binarySearch하기 전에는 반드시 정렬먼저
        System.out.println("chArr = "+Arrays.toString(chArr));
        System.out.println("index of B = "+Arrays.binarySearch(chArr,'B'));



    }
}
