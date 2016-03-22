  import java.util.Scanner;

  public class Lab09 {

    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      Scientist ted = new Scientist();
      int dimension;
      int units;
      int[] coordinates;
      String color;

      do {
        System.out.print("Enter Demension To Travel (1, 2, 3, 4, 5) (Negative to quit): ");
        dimension = input.nextInt();
        if (dimension > 0) {
          System.out.print("Enter Units To Travel (Negative to move backwards): ");
          units = input.nextInt();
          ted.move(dimension, units);
        }
        else
            System.out.println("Run.");
      } while (dimension > 0);
    }
}
