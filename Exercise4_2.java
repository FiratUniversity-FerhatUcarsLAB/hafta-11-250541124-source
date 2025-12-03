faik dursun
  250541124
  Exercise 4.2 tamamlandı.





public class EXERCISE42 {


    public static void main(String[] args) {
        zippo("rattle",13 );   //1
    }

    public static void baffle(String blimp) {
        System.out.println( blimp);          // 5
        zippo ("ping", -5 );   // 4,6
    }
    public static void zippo(String quince, int flag) {
        if (flag < 0) {
            System.out.println(quince + "zoop"); // 7
        }else  {
             System.out.println("ik");         // 2
             baffle(quince);                  //3
             System.out.println("boo-wa-ha-ha"); // 8
        }
    }
}
