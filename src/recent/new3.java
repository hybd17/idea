package recent;

import java.util.Scanner;

public class new3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String[][] pool = {{"超级稀有"}, {"稀有"}, {"普通", "普通", "普通", "普通", "普通", "普通", "普通", "普通","普通"}};
        System.out.println("请输入你的抽卡次数");
        int n = in.nextInt();
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int hang = (int)(Math.random()*10);
        int lie = (int)(Math.random()*10);
        for(int i = 0;i<n;i++)
        {
            for(;;)
            {
                if(hang>=0 && hang< pool.length && lie<pool[hang].length && lie>=0)
                {
                        if(hang == 0)
                        {
                            count1++;
                        }
                    if(hang == 1)
                    {
                        count2++;
                    }
                    if(hang == 2)
                    {
                        count3++;
                    }
                        break;
                }
                else
                {
                    hang = (int)(Math.random()*10);
                    lie = (int)(Math.random()*10);
                }
            }
            hang = (int)(Math.random()*10);
            lie = (int)(Math.random()*10);
        }
        System.out.println("您抽到了"+count1+"个超级稀有");
        System.out.println("您抽到了"+count2+"个稀有");
        System.out.println("您抽到了"+count3+"个普通");
    }
}
