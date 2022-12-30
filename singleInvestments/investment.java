import java.util.Scanner;

public class investment {
  public static void main(String[] args) {
    //Enter buying price per share
    //closing price on subsequent day
    //calculate aggregate earnings end of each day
    //end program if in negative

    Scanner scan = new Scanner(System.in);
    System.out.println("Enter buying price per share: ");
    double buyingPrice = scan.nextDouble();
    int numOfDays = 1;
    

    while(true) {
      System.out.println("Enter closing price at the end of day " + numOfDays + ": \n (negative values will leave program):  ");
      double closingPrice = scan.nextDouble();
      if (closingPrice < 0.0) {
        System.out.println("You ended the day in a loss");
        break;
      }

      double totalEarnings = closingPrice - buyingPrice;
      if (totalEarnings > 0) {
        System.out.println("After day: " + numOfDays + "\n You have a  positive earning of: \n " + String.format("%.2f", totalEarnings) + " per share.");
      } else if (totalEarnings < 0.0) {
        System.out.println("You have lost: " + String.format("%.2f",(-totalEarnings)) + " per share./n" + "After day: " + numOfDays);
      } else {
        System.out.println("You have no earnings. total Earnings: " + String.format("%.2f", totalEarnings) + "\n After " + numOfDays + " days.");
      }
      numOfDays += 1;
    }
    scan.close();
  }
}