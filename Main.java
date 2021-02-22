import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);

    System.out.println("Your bill is?...");
    int bill = scan.nextInt();

    System.out.println("Your pin number?...");
    int pin = scan.nextInt();

    int result = pay(bill);
    System.out.println("Your bill has reduced to, $" + result);
  }
   public static int pay(int bill) {
    if (bill > 0) {
      return bill * pay(bill - 1);
    } else {
      return 0;
    }
  }
}