
public class Test {
	
	
	private ListArray nListe = new ListArray();
	
	public Test(){
		fuegeTausendElementeHinzu();
		druckeAlles();
		longTest();
	}
	
	public void longTest(){
		long i = 0;
		while(true){
			System.out.println(i);
			i++;
		}
	}
	
	public void sachenHinzufuegen(String eingabe){
		nListe.add(eingabe);
	}
	
	public String getString(int position){
		return nListe.get(position);
	}
	
	public int getLaenge(){
		return nListe.size();
	}
	
	public String sucheString(String suche){
		for(int i = 0; nListe.size() < i; i++){
			if(nListe.get(i) == suche){
				return nListe.get(i);
						
			}			
		}
		return null;
	}
	
	public void fuegeTausendElementeHinzu(){
		for(int i = 0; i < 1000; i++){
			nListe.add("t");
		}
	}
	
	public void druckeAlles(){
		for(int i = 0; nListe.size() > i; i++){
			System.out.println(nListe.get(i)+i);
		}
		
	}
}
