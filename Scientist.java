public class Scientist {
  World ourWorld;
  int[] coordinates;
  String color;

  public Scientist() {
    coordinates = new int[6];
    for (int i = 0; i < 6; i++) {
      coordinates[i] = 0;
    }
    ourWorld = new World();
  }

  public void move(int dimension, int numUnits) {
    int setCoordinate = (numUnits + coordinates[dimension-1]) % 10;
    if (setCoordinate < 0)
      setCoordinate = 10 + setCoordinate;
    coordinates[dimension-1] = setCoordinate;
    coordinates[5] = ourWorld.worldArray[coordinates[0]][coordinates[1]][coordinates[2]][coordinates[3]][coordinates[4]];
    color = ourWorld.getColor(coordinates[5]);
    System.out.println("Location: [" + coordinates[0] + " " + coordinates[1] + " " + coordinates[2] + " " + coordinates[3] + " " + coordinates[4] + "] = " + color);
    ourWorld.visited(coordinates);
  }

}
