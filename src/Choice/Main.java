package Choice;

import java.util.Scanner;

/*这是一个快递公司自助生成快递订单的东西。
 咳咳，虽然介个可能真的很简陋，但本菜鸟还是想了很久的,
 希望看到的大佬不要嫌弃就好^-^*/
//介个是看物件有没有超重的方法
public class Main {
    public static void main(String[] args) {
        Packet a = new Packet();
        //基本信息
        Yuan yuan = new Yuan();
        yuan.name = "Yuan";
        yuan.welcome();
        a.setType(1108);
        System.out.println("系统版本为：" + a.getType());

        a.setJ(17.0f);
        System.out.println("机器载重量：" + a.getJ() + "千克");

        System.out.println("请输入电子秤显示的物体重量(精确到0.1)");
        Scanner input = new Scanner(System.in);
        float i = input.nextFloat();
        System.out.print("物品是否超重：");
        a.inspect(i);





















    }


}
