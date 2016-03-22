public class World {

    public int [][][][][] worldArray;

    public World() {
        worldArray = new int [10][10][10][10][10];
        for (int i=0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    for (int l = 0; l < 10; l++) {
                        for (int m = 0; m < 10; m++) {
                            worldArray[i][j][k][l][m] = (i + j + k + l + m) % 10;
                        }
                    }
                }
            }
        }
    }

    public void visited(int[] coordinates) {
        worldArray [coordinates[0]] [coordinates[1]] [coordinates[2]] [coordinates[3]] [coordinates[4]] = 11;
    }

    public String getColor(int value) {
        String color;
        if (value == 1)
            color = "Lime";
        else if (value == 2)
            color = "Cerulean";
        else if (value == 3)
            color = "Goldenrod";
        else if (value == 11)
            color = "White";
        else
            color = "Black";
        return color;
    }
}
