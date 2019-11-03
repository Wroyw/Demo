package Choice;
public class Packet {
    private int type;
    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    private int j;
    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }

    public void inspect(int i){
        if(i>j){
            System.out.println("是，请适当减少货物") ;
        }else{
            System.out.println("否");
        }
    }

    public void active(String o){

        System.out.println("收货地址："+o);
    }
    public void people(String x,String h){
        System.out.println("收件人:"+x);
        System.out.println("手机号码:"+h);
    }

    public void payway(int i){
        switch(i){
            case(1):
                System.out.println("我选支付宝");
                break;
            case(2):
                System.out.println("我选微信");
                break;
            case(3):
                System.out.println("我有现金");
                break;
        }
    }









}
