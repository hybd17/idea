package daily111;

public class st_ring {
    public static void main(String[] args){
        //四种方式
        String s1 = new String();
        char[] chs = {'a','b','c'};
        String s2 = new String(chs);
        byte[] bys = {97,98,99};
        String s3 = new String(bys);
        //推荐 直接赋值
        String s4 = "abc";
        System.out.println(s2.equals(s3));
    }
}
