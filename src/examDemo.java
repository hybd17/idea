import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class examDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        List<Integer> la = new ArrayList<>();
        for(int i = a.length()-1;i>=0;--i){
            la.add(a.charAt(i)-'0');
        }

    }
}
