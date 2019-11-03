public class level1 {
    public static void main(String[] args){
        int a=555555;
        int i=999;
        for(;;i--) {
            int r = a % i;
            if (r == 0) {
                System.out.println("555555最大三位约数为" + i);
                break;
            }
        }
    }

}
