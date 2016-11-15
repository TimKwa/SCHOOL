
public class ListArray {

	String[] inhalt;
	int anzahlElemente = 0;
	int zaehlerChange;

	public ListArray() {
		inhalt = new String[10];
	}

	public ListArray(int anzahl) {
		inhalt = new String[anzahl];
	}

	public void add(String eingabe) {
		if(inhalt.length == anzahlElemente){
			kapazitaetErhoehen();
		}
		inhalt[anzahlElemente] = eingabe;
		anzahlElemente++;
	}

	public String get(int position) {
		return inhalt[position];
	}

	public void setPos(int pos, String text) {
		inhalt[pos] = text;
	}

	public void removeString(int pos) {
		inhalt[pos] = null;
	}

	public int size() {
		return anzahlElemente;
	}

	public void clear() {
		anzahlElemente = 0;
		String[] inhalt = new String[10];
	}

	private void kapazitaetErhoehen() {

		int neueLaenge = inhalt.length * 20 / 100;
		neueLaenge = neueLaenge + inhalt.length;
		String[] neueListe = new String[neueLaenge];

		for (int i = 0; inhalt.length < i; i++) {
			neueListe[i] = inhalt[i];
		}
		zaehlerChange++;
		inhalt = neueListe;
	}

	
	private void trim() {
		boolean status = false;

		for (String s : inhalt) {
			if (s == null) {
				status = true;
			}
		}

		int i = 0;
		while (status) {
			if (inhalt[i] == null) {
				inhalt[i] = inhalt[i + 1];
				inhalt[i + 1] = null;
			}
			i++;

			for (String s : inhalt) {
				if (s == null) {
					status = true;
				} else {
					status = false;
				}
			}

		}

	}

}
