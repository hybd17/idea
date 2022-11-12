package daily111;

public class StringTest03 {
    public static void main(String[] args){
        int[] arr = {1,2,3};
        String s = arrayToString(arr);
        System.out.println(s);
    }
    public static String arrayToString(int[] arr){
        String s = "";
        s += "[";
        for(int i = 0;i<arr.length;i++)
        {
            if(i == arr.length-1){
                s += arr[i];
            }
            else
            {
                s += arr[i];
                s += ", ";
            }
        }
        return s;
    }
}
