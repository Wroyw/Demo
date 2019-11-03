package Choice;

import com.sun.media.sound.RIFFInvalidDataException;

public class Detail extends Packet  {
    @Override
    public void active(String o) {

        super.active(o);
    }
    @Override
    public void payway(int i) {
        super.payway(i);
    }

    @Override
    public void people(String x, String h) {
        super.people(x, h);
    }

    public void detail(String y, double p1, double p2){
        if (y.equals("是")){
            System.out.println("是");
            System.out.println("加急件,总计价格："+p1);
        }else{
            System.out.println("否");
            System.out.println("普通件, 总计价格"+p2);
        }
    }


}
