import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String str =" name surname", str2 ="", str3 =" ";
        String str1 = new String("namE");
        System.out.println(Arrays.toString(str.getBytes()));
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.charAt(1));
         System.out.println(str.compareTo(str1));
         System.out.println(str.compareToIgnoreCase(str1));
        System.out.println(str.contains("am"));
        System.out.println(str.contentEquals(str1));
        System.out.println(str.equals(str1));
        System.out.println(str.equalsIgnoreCase(str1));
        System.out.println(str.endsWith("E"));
        System.out.println(str.startsWith("n"));
        System.out.println(str.startsWith("n",1));
        System.out.println("index 10: " + str.indexOf('A',10)); // 1. "" 2. "   1 "
        System.out.println("str 2empty" + str2.isEmpty());
        System.out.println("str 2 blank" + str2.isBlank());
        System.out.println("str 3 empty" +str3.isEmpty());
        System.out.println("str 3 blank" + str3.isBlank());
        System.out.println(str.replace("A", "******")); //salam  2
        System.out.println(str.replaceAll("[A-Z,a-z]", "*_"));
        System.out.println(str.replaceFirst("[A-Z,a-z]", "*_"));
        System.out.println("salam: " + "salam".lastIndexOf("a"));
        System.out.println("salam".lastIndexOf("a",10));
        String[] strList = str.split(" "); //"name surname"
        System.out.println( strList[1]);
        System.out.println(Arrays.toString(str.split(" ")));
        System.out.println(str.length());
        System.out.println(str.substring(5));
        System.out.println(str.substring(str.indexOf(" ") +1,str.indexOf(" ") + 4)); //[)
        System.out.println(str.trim());
        StringBuilder stringBuilder=new StringBuilder("name");


    }
}