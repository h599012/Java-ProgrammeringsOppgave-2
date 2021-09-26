package no.hvl.dat100;

public class OppgaveO1A {
	
	public static void skrivUt(int[] tabell) {
		for (int i = 0; i < tabell.length; i++) {
			System.out.println(tabell[i]);
		}
	}
	
	public static String tilStreng(int[] tabell) {
		String resultat = "[";
		
		for (int i = 0; i < tabell.length; i++) {
			resultat += Integer.toString(tabell[i]);
			if (i < tabell.length - 1)
				resultat = resultat + ",";
		}
		
		resultat = resultat + "]";
		
		return resultat;
	}
	
	public static boolean finnesTall(int[] tabell, int tall) {
		for (int element : tabell) {
			if (tabell[element] == tall)
				return true;
		}
		return false;
	}
	
	public static int posisjonTall(int[] tabell, int tall) {
		for (int indeks : tabell) {
			if (tabell[indeks] == tall)
				return indeks;
		}
		return -1;
	}
	
	public static int[] reverser(int[] tabell) {
		int[] r_tabell = new int[tabell.length];
		
		for (int element : tabell)
			r_tabell[i] = tabell[tabell.length - (element + 1)];
		
		return r_tabell;
	}
	
	public static boolean erSortert(int[] tabell) {
		for (int element : tabell) {
			if (tabell[element] > tabell[element + 1])
				return false;
		}
		return true;
	}
	
	public static int[] settSammen(int[] tabell1,int[] tabell2) {
		int[] sammensatt = new int[tabell1.length + tabell2.length];
		
		for (int element : sammensatt) {
			if (element < tabell1.length - 1)
				sammensatt[element] = tabell1[element];
			
			else
				sammensatt[element] = tabell2[element];
			
			return sammensatt;
		}
	}
	
	public static int summer(int[] tabell) {
		
		int sum = 0;
		
		for (int i = 0; i < tabell.length; i++) {
			sum += tabell[i];
		}
		/*
		int antall = 0;
		while (antall < tabell.length) {
			sum += tabell[antall];
			antall++;
		}
		
		for (int tall : tabell) {
			sum += tabell[tall];
		}
		*/
		
		return sum;
	}

	public static void main(String[] args) {
		int[] liste = new int[5];
		
		liste[0] = 7;
		liste[1] = 2;
		liste[2] = 8;
		liste[3] = 23;
		liste[4] = 68;
		
		System.out.print(summer(liste));
	}

}
