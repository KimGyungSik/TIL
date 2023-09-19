package Chapter01;

public class Ex6_30 {
    public static void main(String[] args) {
        Document d1 = new Document();
        Document d2 = new Document("자바.txt");
        Document d3 = new Document();
        Document d4 = new Document();
    }
}
class Document {
    static int count;
    String name = "제목없음";
    Document() {
        System.out.println("문서 "+name+(++count)+"가 생성되었습니다");
    }
    Document(String name) {
        this.name = name;
        System.out.println("문서"+name+"가 생성되었습니다");
    }
}