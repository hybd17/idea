package csa03;

public class Homework05 {
    public static void main(String[] args) {

    }
    public static int answer(String s,String[] words,String[] zi){
        zi = select(s);
        int count = 0;
        for(int i = 0;i<words.length;i++)
        {
            for(int k =0;k< zi.length;k++)
            {
                if(words[i].equals(zi[k]));
                count++;
            }
        }
        return count;
    }
    public static String[] select(String s){
        String[] zi = new String[length(s.length())];
        int temp = 0;
        for(int i =0;i<s.length();i++)
        {
            for(int k = i+1;k<=s.length();k++)
            {
                zi[temp] = s.substring(i,k);
                temp++;
            }
        }
        return zi;
    }
    public static int length(int m){
        int n = 0;
        for(int i =1;i<=m;i++)
        {
            n += i;
        }
        return n;
    }
}
