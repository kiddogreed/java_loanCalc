
import java.util.Scanner;

public class LoanCalc {


public static double calculatePercentage(double percent, double total) {
return percent * 100 / total;
}

public static void display(int amount,int interestAmount, int finalAmount, int month){
System.out.println("Month:"+ month);
System.out.println("TOTAL:"+ amount);
System.out.println("interest:"+interestAmount);
System.out.println("Final amount:"+finalAmount);
System.out.println("__________________________");
}

public static void main(String[] args) {
Scanner sCancer = new Scanner(System.in);
System.out.println("Enter your payment:");
int amount = sCancer.nextInt();

double interest = 10.0;
int month = 3;
double interestAmount = (int)(amount/100 *interest);
double finalAmount = amount - interestAmount;
//int computation = (int)(amount*interest/100.0);
//System.out.println(finalAmount);
double lastAmount = finalAmount;


while (month >1){
double newInterest = lastAmount/100 * interest;
double newFinal = lastAmount - newInterest;
int value = (int)newFinal;
lastAmount = value;
month -= 1;
if(month == 1) {
System.out.println(value);
}
}

// = [];
// for (int m = month ; m > 1; m--){
// double newInterest = lastAmount/100 * interest;
// double newFinal = lastAmount - newInterest;
// int value = (int)newFinal;
// if(m == 1){
// System.out.println(value);
// }else{
// System.out.println(0);
// }
// //System.out.println(value);
// lastAmount = value;
// // System.out.println(value);
//
// }














}
}