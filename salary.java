//imports
import java.math.BigDecimal;
import java.util.Currency;
import java.util.Scanner;

public class salary{

//main function
public static void main(String[] Args) {       

Scanner scan = new Scanner(System.in);

System.out.print("Name : ");
String name = scan.nextLine();

System.out.print("Type F if Full Time, Type P if Part Time \nLetter : ");
String input = scan.nextLine();

//Variables

BigDecimal rph = new BigDecimal("67.50");
BigDecimal per = new BigDecimal("1.25");

//Currency Sysmbols

Currency cur = Currency.getInstance("PHP");
String sym = cur.getSymbol();

// If Statements If, Else If, Else

if (input.equals("F")) {

System.out.print("Monthly Salary : ");
String ms = scan.nextLine(); 

System.out.println("\n \n \n \n \n");

System.out.println("Name : "+name+"\nMonthly Salary : "+sym+" "+ms);
}

else if (input.equals("P")){

System.out.print("Number of Hr spent in OT : ");
BigDecimal hot = scan.nextBigDecimal();

System.out.print("Number of Hr spent in Work : ");
BigDecimal hhr = scan.nextBigDecimal();

//compute

BigDecimal one = rph.multiply(per);
BigDecimal two = rph.multiply(hhr);
BigDecimal cone = one.multiply(hot);
BigDecimal wages = cone.add(two);

System.out.println("\n \n \n \n \n");

System.out.println("Name : "+name+"\nWage : "+sym+" "+wages);
}

else {
System.out.println("Please type *F* or *P*");
}

}
}
