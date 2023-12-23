public class StringBufferMethods {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("name");
        StringBuffer stringBuffer2 =  new StringBuffer("Name");
        StringBuffer stringBuffer3 =stringBuffer;
                System.out.println(stringBuffer.append("test")); // nametest
        System.out.println(stringBuffer.capacity()); //20
        System.out.println(stringBuffer.compareTo(stringBuffer2)); //32
        System.out.println(stringBuffer.delete(1,3)); //[) netest
        stringBuffer = stringBuffer.deleteCharAt(3);
        stringBuffer = new StringBuffer(stringBuffer.substring(0,1));
        System.out.println(stringBuffer.deleteCharAt(3)); //netst
        System.out.println(stringBuffer.indexOf("t")); // 2
        System.out.println(stringBuffer.indexOf("t",3)); //4
        System.out.println(stringBuffer.lastIndexOf("t")); //4
        System.out.println(stringBuffer.lastIndexOf("t",3)); //2
        System.out.println(stringBuffer.insert(1, "am")); //nametst
        System.out.println(stringBuffer.charAt(1)); //a
        System.out.println(stringBuffer.length()); //7
        System.out.println(stringBuffer.replace(4,7,"test")); //nametest
        System.out.println(stringBuffer.reverse()); //tseteman
        System.out.println(stringBuffer.subSequence(1,5)); //sete
        System.out.println(stringBuffer.substring(1,2)); //s
        System.out.println(stringBuffer.substring(2)); //eteman
        System.out.println(stringBuffer.equals(stringBuffer3)); //true
        System.out.println(stringBuffer.equals(stringBuffer2)); // false
        System.out.println(stringBuffer.toString());
        stringBuffer.setLength(3);
        System.out.println(stringBuffer); //tse
        stringBuffer.setCharAt(0,'V');
        System.out.println(stringBuffer); //Vse
    }
}
