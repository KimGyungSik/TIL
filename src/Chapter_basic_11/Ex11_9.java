package Chapter_basic_11;

import java.util.HashSet;
import java.util.Objects;

public class Ex11_9 {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        set.add("abc");
        set.add("abc");
        set.add(new Person("David",10));
        set.add(new Person("David",10));

        System.out.println(set); //[David:10, abc]
    }
}
// equals()와 hashCode()를 오버라이딩해야 HashSet이 바르게 동작
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
   // 나자신(this)의 이름과 나이를 p와비교
    public boolean equals(Object obj) {
        if(obj instanceof Person) {
            Person p = (Person) obj;
            return name.equals(p.name) && age==p.age;
        }
        return false;
    }
    public int hashCode() {
        return toString().hashCode();
        // return Objects.hash(name, age);
    }
    //int hash(Object...values); // 가변인자
    public String toString() {
        return name+":"+age;
    }
}
