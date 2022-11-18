package daily1111;

public class NewPhone extends PHone{
//    public void call(String name) {
//        System.out.println("开启视频");
//        System.out.println(name);
//        super.call(name);
//    }
    @Override
    public  void call(String name){
        System.out.println("开启视频");
        super.call(name);
    }
}
