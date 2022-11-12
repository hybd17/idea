package daily111;

public class StringTest05 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("hello");
        sb2.append("world").append("java").append(100);
        sb2.reverse();
//        System.out.println(sb2);
        //转化
        String s = sb.toString();
        StringBuilder sb3 = new StringBuilder(s);
    }
}
