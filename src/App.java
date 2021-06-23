public class App {
    public static void main(String[] args)  {
     String tên = "Mai Duy Hưng Thành";
     int tuổi = 28 ;
     String address = "Nghệ An";
            System.out.println("My name is "+tên + " ,"+"Iam " +tuổi +" year old");
            System.out.println("I from in "+address);
            System.out.println("----------------------------------------------");
        // Calculator
        Calculator cal = new Calculator();
        int one = cal.cong();
        int two = cal.tru();
        int three = cal.nhan();
        float four = cal.chia();

        
        System.out.println("ĐS phép cộng = " +one);
        System.out.println("ĐS phép trừ  = " +two);
        System.out.println( "ĐS phép nhân = " +three);
        System.out.println( "ĐS phép chia = " +four);
   }
}
