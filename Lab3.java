public class Lab3
{
  public static void main(String[] args) {
    double distance = 10;
    int steps = 0;
    System.out.println("Starting Distance: " + distance);
     while (distance > 0.0) {
       distance /= 2;
       ++steps;
       System.out.println("Steps Taken So Far: " + steps);
       System.out.println("Distance from Paris to Helen: " + distance);
     }
     System.out.println("Steps Needed to Disprove Zeno: " + steps);
  }
}
