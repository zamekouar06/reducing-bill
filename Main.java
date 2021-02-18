import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);

    System.out.println("Your bill is?...");
    int bill = scan.nextInt();

    System.out.println("Your pin number?...");
    int pin = scan.nextInt();
  }
  public static int pay(int bill){
    if(bill > 0);{
      return bill - pay(1 - pay);
    }else{
      return 0;
    }
  }
}