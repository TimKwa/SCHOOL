public class SelectionSort {

	private int[] liste = { 12, 34, 2, 1, 0, 9, 5, 2, 3, 54 };

	

	public void sortiere() {
		for (int i = 0; i < liste.length - 1; i++) {
			int minpos = getErsteStelle(i);
			tausche(minpos, i);
		}
	}

	private int getErsteStelle(int from) {
		int minpos = from;
		for (int i = from + 1; i < liste.length; i++)
			if (liste[i] < liste[minpos])
				minpos = i;
		return minpos;
	}

	private void tausche(int i, int j) {
		int temp = liste[i];
		liste[i] = liste[j];
		liste[j] = temp;
	}
	
	public void printList() {
		String ls = "";
		for (int i : liste) {
			ls = ls + ", " + i;
		}
		System.out.println(ls);
	}
}