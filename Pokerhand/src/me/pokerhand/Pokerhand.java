package me.pokerhand;
import java.util.ArrayList;

public class Pokerhand {

	private ArrayList<Karte> karten = new ArrayList<Karte>();

	public Pokerhand() {

	}

	public void addKarte(int wert, int typ) {
		karten.add(new Karte(wert, typ));
	}

	public Karte getKarte(int pos) {
		return karten.get(pos);
	}

	public void handLeeren() {
		karten.clear();
	}

	public void sortiereKarten() {

		for (int i = 0; i < karten.size() - 1; i++) {

			if (karten.get(i).getWert() > karten.get(i + 1).getWert()) {

				for (int j = 0; j < karten.size() - 2; j++) {

					if (karten.get(j).getWert() > karten.get(j + 1).getWert()) {

						Karte temp = karten.get(j);
								
									
								
						
					}
				}

			}

		}
		

		// for (int j = 0; j < liste.length - 2; j++) {
		// if (liste[j] > liste[j + 1]) {
		// int temp = liste[j];
		// liste[j] = liste[j + 1];
		// liste[j + 1] = temp;
		// }
		// }

		// for (int i = 0; i < liste.length - 1; i++) {
		//
		// if (karten.get(i).getWert() > karten.get(i + 1).getWert()) {
		//
		//
		//
		// }
		//
		// }
		//
		// // Karte k;
		// // for (int i = 0; i < karten.size() - 1; i++) {
		// // if (karten.get(i).getWert() < karten.get(i + 1).getWert()) {
		// // continue;
		// // }
		// //
		// // k = karten.get(i);
		// // karten.get(i) = karten.get(i + 1);
		// // karten.get(i + 1) = k;
		// // }

		
		public boolean isFlush(){
			
			for(int i = 0; karten.size() < i; i++){
				
				
				
			}
			
		}
	}

}
