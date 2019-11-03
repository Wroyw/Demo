package Choice;
/*介个是不超重的话的后续流程。
emmm，因为不知道判定超重后怎么停止系统所以又搞了一个main方法-_-||
(被自己菜到了。。。。。。)
 */
public class Main2 {
    public static void main(String[] args) {
        Detail detail = new Detail();
        //收件地址
        System.out.println("请输入包裹收货地址");
        detail.active("重庆市沙坪坝区南开中学");
        //收件人
        System.out.println("请输入收件人相关信息");
        detail.people("王源","110817");
        //包裹类型判断
        System.out.println("是否为加急件：是   否");
        detail.detail("否",15.0,10.0);
        //支付方式选择
        System.out.println("请选择支付方式：1.支付宝；2.微信；3.现金");
        detail.payway(3);
        System.out.println("支付成功，欢迎下次使用！");










    }
}
