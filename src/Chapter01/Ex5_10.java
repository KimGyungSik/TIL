package Chapter01;

public class Ex5_10 {
    public static void main(String[] args) {
        char[] abcCode =
                { '`','~','!','@','#','$','%','^','&','*',
                        '(',')','-','_','+','=','|','[',']','{',
                        '}',';',':',',','.','/'};
                            // 0 1 2 3 4 5 6 7 8 9
        char[] numCode = {'q','w','e','r','t','y','u','i','o','p'};

        String src = "123xyz";
        String result = "";
        //문자열 src의 문자를 charAt()으로 하나씩 읽어서 변환 후 result에 저장
        for(int i=0; i < src.length();i++) {
            char ch = src.charAt(i);
            if('a'<=ch&&ch<='z') { // ch가 소문자 a~z사이라면
                ch = abcCode[ch-'a'];
            } else if ('0'<=ch&&ch<='9') { // ch가 0~9사이의 정수라면
                ch = numCode[ch-'0'];
            }
            result += ch;
        }
        System.out.println("src:"+src);
        System.out.println("result:"+result);
    } // end of main
} // end of class

