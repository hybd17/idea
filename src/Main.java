import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        BigDecimal a = new BigDecimal(String.valueOf(m));
        BigDecimal b = new BigDecimal(String.valueOf(n));
        b = b.add(a);
        System.out.println(b);
    }
}
