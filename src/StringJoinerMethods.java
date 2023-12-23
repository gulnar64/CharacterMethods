import java.util.StringJoiner;

public class StringJoinerMethods {
    public static void main(String[] args) {
        StringJoiner strJoiner = new StringJoiner(" ");
        StringJoiner stringJoiner2 = new StringJoiner(" ", "prefix", "suffix");

//        stringJoiner2.setEmptyValue("empty value");
        strJoiner.setEmptyValue("empty value");
        strJoiner.add("this");
        strJoiner.add("is");
        strJoiner.add("for");
        strJoiner.add("test");
        stringJoiner2.merge(strJoiner);
        System.out.println(strJoiner);
        System.out.println(stringJoiner2);
    }
}
