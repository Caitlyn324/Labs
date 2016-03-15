import java.util.*;
import java.util.*;

public class lab8 {

	public static void main(String[] args) {

		int[] pGarden = new int[5];
		int[] mGarden = new int[5];
		int resizePangloss = 0;
		int resizeMartin = 0;
		Random random = new Random();
		int totalCrop = 0;
		int currentSeason;

		for (currentSeason = 0; currentSeason < 40; currentSeason++) {
			int crop = random.nextInt(5);
			totalCrop += crop;
			int pLength = pGarden.length;
			int mLength = mGarden.length;
			boolean pResize = false;
			boolean mResize = false;
			if ()


			for (int i = 0; i < crop; i++) {
				pGarden[currentSeason] = crop;
			}

			if (pResize) {
					pGarden = doubleArray(pGarden);
			}

			else if (mResize) {
					mGarden = addTwo(mGarden);
			}

		}


	}

	public static int[] doubleArray(int[] toGladen) {
		int toGladenLength = toGladen.length;
		int gladLength = toGladenLength * 2;
		int[] gladened = new int[gladLength];

		for (int i = 0; i < gladened.length; i++) {
			gladened[i] = toGladen[i];
		}
		return gladened;
	}

	public static int[] addTwo(int[] toWorsen) {
		int toWorsenLength = toWorsen.length;
		int worseLength = toWorsenLength + 2;
		int[] worsened = new int[worseLength];

		for (int i = 0; i < worsened.length; i++) {
			worsened[i] = toWorsen[i];
		}
		return worsened;
	}

	public static void printArray(int[] arr, int numItems) {
	 System.out.print("[ ");
	 for (int j=0; j < (arr.length - 1); j++) {
			 if (j >= numItems) {
			 System.out.print("***, ");
			 } else {
			 System.out.print(arr[j] + ", ");
			 }
	 }

	 if ((arr.length -1) >= numItems) {
			 System.out.println("*** ]");
	 } else {
			 System.out.println(arr[arr.length - 1] + " ]");
	 }
	}

}
