import java.util.Scanner;

public class Level1 {
    public static void  main(String[] args){
        Scanner in = new Scanner(System.in);
        String answer = "yes";
        boolean isprime = true;
        int time;
        double all= 0.0;
        int cnt = 1;
        while(isprime== answer.contains("yes"))
        {
            while(cnt<=7)
            {
                time = in.nextInt();
                all += time;
                cnt++;
            }
            System.out.println(all/7);
            cnt = 1;
            all = 0;
            System.out.println("是否要再玩一局？");
            answer = in.next();
        }
    }
}
