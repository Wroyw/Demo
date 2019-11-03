package Learnt;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        H h = new H();
        Scanner input = new Scanner(System.in);
        h.day();
        System.out.print("请输入查询年份：201");
        int i = input.nextInt();
        System.out.print("生日会主题:");
        switch(i){
            case 5:
                h.item(5);
                h.age(15);
                h.HotTip(5);
                h.support();
                break;
            case 6:
              h.item(6);
              h.age(16);
              h.HotTip(6);
                h.support();
              break;
            case 7:
                h.item(7);
                h.age(17);
                h.HotTip(7);
                h.support();
                break;
            case 8:
                h.item(8);
                h.age(18);
                h.HotTip(8);
                h.support();
                System.out.println(




                );
                System.out.println("他越来越棒了，姑娘，你也要加油");
                System.out.println("源，你始终是我唯一的孤注与意外，以后，也要陪你走下去吖");

                break;
        }


    }

}
