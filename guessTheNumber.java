import java.util.Scanner;

public class guessTheNumber {
  public static void main(String[] args) {
    try {
      int max = 100;
      int min = 0;
      int range = max - min + 1;
      int rnum = (int) (Math.random() * range) + min;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the number between 0-100 : ");
      int gnum = sc.nextInt();
      do {
        if (gnum <= 100) {
          if (gnum == rnum) {
            System.out.println("Number guessed matches the original number");
            break;
          } else if (gnum > rnum) {
            System.out.println("Number guessed is more than original number");
          } else {
            System.out.println("Number guessed is less than original number");
          }
          System.out.println("if you want to exit enter -1 or any negatinve number");

        } else {
          System.out.println("Invalid input. Enter the number between 0-100 ");

        }
        System.out.println("Enter the number : ");
        gnum = sc.nextInt();

      } while (gnum >= 0);

      System.out.println("You have exited the game and the number is : " + rnum);
    } catch (Exception e) {
      System.out.println("Invalid input.The enter number is not an integer.");
      System.out.println("You have exited the game.");
    }
  }
}
