
package PayRollExam;
import java.util.*;

public class PayRoll {
public static void main(String[] args) {
  int days;
        float pday,insurance,tax,pmonth,money ;

     System.out.println("Give me work days: ");
     System.out.println(" ");
     
     days=new Scanner(System.in).nextInt();

     System.out.println("Give me payment/day: ");
     System.out.println(" ");
     
      pday=new Scanner(System.in).nextFloat();
      money=days*pday;
      insurance=money*(0.07f);
      tax=money*(0.05f);
      pmonth=money-(insurance+tax);

    System.out.println("Insurance is :" +insurance);
    System.out.println("Tax is :" +tax);
    System.out.println("Payroll is :" +pmonth);

}
}