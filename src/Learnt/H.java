package Learnt;

public class H extends Age implements FANS,A{
    public  void day(){
        System.out.println("源哥生日"+day);
    }
    @Override
    public void support() {
        System.out.println("粉丝的公益应援年年有，祝福视频暖心头");
    }

    @Override
    public void HotTip(int i) {
        System.out.print("热点：");
        switch(i){
            case 5:
                System.out.println("首支原创单曲因为遇见你送粉丝");
            break;
            case 6:
                System.out.println("房间温暖心灵");
                break;
            case 7:
                System.out.println("原创骄傲送给母亲");
                break;
            case 8:
                System.out.println("粉丝互怼成表情包");
                break;
        }

    }

    @Override
    public void item(int i) {
        switch(i){
            case 5:
                System.out.println("森林里的小王子");
                break;
            case 6:
                System.out.println("遇见");
                break;
            case 7:
                System.out.println("X-ROY");
                break;
            case 8:
                System.out.println("BORN FREE");
                break;
        }
    }

    @Override
    public void age(int age) {
        System.out.println("我的少年"+age+"岁了！");
    }
}
