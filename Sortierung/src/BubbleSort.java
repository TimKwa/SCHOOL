
public class BubbleSort {

	private int[] liste = { 12, 34, 2, 1, 0, 9, 5, 2, 3, 54 };

	public boolean isSortiert() {

		for (int i = 0; i < liste.length - 1; i++) {

			if (liste[i] > liste[i + 1]) {
				return false;
			}

		}
		System.out.println("SORTIERT");
		return true;

	}

	public void sortiere() {

		while (!isSortiert()) {
			tausche();
		}

	}

	public void tausche() {

		for (int j = 0; j < liste.length - 2; j++) {
			if (liste[j] > liste[j + 1]) {
				int temp = liste[j];
				liste[j] = liste[j + 1];
				liste[j + 1] = temp;
			}
		}

	}

	public void printList() {
		String ls = "";
		for (int i : liste) {
			ls = ls + ", " + i;
		}
		System.out.println(ls);
	}

}
