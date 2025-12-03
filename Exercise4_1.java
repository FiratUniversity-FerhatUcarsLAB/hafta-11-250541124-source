faik dursun 
    2505411124
    exercise 4.1 tamamlandı. 

public class EXERCİSE1 {

    // AMERİCAN FORMAT : DAY, MONTH DATE , YEAR
    public static void printAmerica ( String day , int date, String month , int year ) {
        System.out.println( day + ", "+month+ " "+ date +", " +year);
    }

     // EUROPEAN FORMAT: DAY DATE MONTH YEAR
    public static void printEuropean ( String day, int date , String month , int year ) {
         System.out.println(day + "  " + date + " " +month+" "+year);
        }
      public static void main(String[] args) {


        String day = " THURSDAY ";
        int date=  26  ;
        String month = " DECEMBER ";
        int year = 1975;

        System.out.print( "AMERİCAN FORMAT");
        printAmerica(day,date,month,year);

        System.out.print( "EUROPEAN FORMAT");
        printEuropean(day,date,month,year);

      }


}



