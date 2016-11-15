
public class InsertSort {

	private int[] liste = { 12, 34, 2, 1, 0, 9, 5, 2, 3, 54 };

	public void sortieren() {
		int temp;
		for (int i = 1; i < liste.length; i++) {
			temp = liste[i];
			int j = i;
			while (j > 0 && liste[j - 1] > temp) {
				liste[j] = liste[j - 1];
				j--;
			}
			liste[j] = temp;
		}
	}

	public void printList() {
		String gg = "" + liste[0];
		for (int i = 1; i < liste.length; i++) {
			gg = gg + ", " + liste[i];
		}
		System.out.println(gg);
	}
}
