package recent;

public class new4 {


        String[] name = new String[100];
        int[] numbers1 = new int[100];
        int[] numbers2 = new int[100];
        int[] numbers3 = new int[100];
        int[] numbers4 = new int[100];
        int[] numbers5 = new int[100];

        public void setName(String[] name) {
            name[0] = "《3G是怎么炼成的》";
            name[1] = "《java开发实战经典》";
            name[2] = "《美丽新重邮》";
            name[3] = "《仿生RedRocker》";
            name[4] = "《南山伯爵》";
            this.name = name;
        }

        public void setNumbers1(int[] numbers1) {
            this.numbers1 = numbers1;
            numbers1[0] = 33;
            numbers1[1] = 88;
            numbers1[2] = 40;
            numbers1[3] = 20;
            numbers1[4] = 30;
        }

        public void setNumbers2(int[] numbers2) {
            this.numbers2 = numbers2;
            numbers2[0] = 1;
            numbers2[1] = 1;
            numbers2[2] = 4;
            numbers2[3] = 1;
            numbers2[4] = 0;
        }

        public void setNumbers3(int[] numbers3) {
            this.numbers3 = numbers3;
            numbers3[0] = 5;
            numbers3[1] = 2;
            numbers3[2] = 3;
            numbers3[3] = 1;
            numbers3[4] = 0;
        }

        public void setNumbers4(int[] numbers4) {
            this.numbers4 = numbers4;
            numbers4[0] = 5;
            numbers4[1] = 5;
            numbers4[2] = 1;
            numbers4[3] = 0;
            numbers4[4] = 0;
        }

        public void setNumbers5(int[] numbers5) {
            this.numbers5 = numbers5;
            numbers5[0] = 5;
            numbers5[1] = 1;
            numbers5[2] = 1;
            numbers5[3] = 0;
            numbers5[4] = 0;
        }

        void prop(){
            System.out.println("购买道具，改变人生");
            System.out.println("道具列表：");
            System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s","序号","名字","价格","修德","博学","求实","创新");
            for(int i = 1;name[i-1] !=null;i++)
            {
                System.out.println(i+"+"+name[i-1]+"+"+numbers1[i-1]+"+"+numbers2[i-1]+"+"+numbers3[i-1]+"+"+numbers4[i-1]+"+"+numbers5[i-1]);
            }
        }
        void shop(){
            System.out.println("请输入你要购买的道具的序号：");
        }
        void youzi(){

        }

    public static void main(String[] args){
        new4 functions = new new4();
        functions.prop();
    }
}
