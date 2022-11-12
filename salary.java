import java.util.Scanner;

public class salary{

public static void main(String[] Args) {       

Scanner scan = new Scanner(System.in);

System.out.println("Name :");
String name = scan.nextLine();

System.out.println("Type F if Full Time, Type P if Part Time");
String input = scan.nextLine();

//Variables

double rph = 71.25;
double  ot = 140;

if (input.equals("F")) {

System.out.println("Monthly Salary : ");
String ms = scan.nextLine(); 

System.out.println("\n \n \n \n \n");

System.out.println("Name :"+name+"\nMonthly Salary : "+ms);
}

else if (input.equals("P")){
System.out.println("Number of Hr spent in OT");
Double hot = scan.nextDouble();

System.out.println("Number of Hr spent in Work");
Double hhr = scan.nextDouble();

//compute

double wages = hot*(rph*1.25)+(rph*hhr);

System.out.println("\n \n \n \n \n");

System.out.println("Name : "+name+"\nWage : "+wages);
}

else {
System.out.println("Please type *F* or *P*");
}
    
}
                                                }
