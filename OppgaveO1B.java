package no.hvl.dat100;

public class OppgaveO1B {
	
	public static void skrivUtv1(int[][] matrise) {
		for (int[] liste : matrise) {
			System.out.print("[");
			for (int tall : liste) {
				System.out.print(tall + "\t");
			}
			System.out.print("]");
		}
	}
	
	public static String tilStreng(int[][] matrise) {
		String streng = "";
		for (int i = 0; i < matrise.length; i++) {
			for (int k = 0; k < matrise[i].length; k++) {
				if (k != 0)
					streng += " ";
				
				streng += Integer.toString(matrise[i][k]);
				
				if (k == matrise[i].length - 1)
					streng += "\n";
			}
		}
		return streng;
	}
	
	
	public static int[][] skaler(int tall, int[][] matrise) {
		int[][] skalert = matrise;
		
		for (int i = 0; i < skalert.length; i++) {
			for (int k = 0; k < skalert[i].length; k++) {
				skalert[i][k] *= tall;
			}
		}
		
		return skalert;
	}
	
	public static boolean erLik(int[][] mat1, int[][] mat2) {
		if (mat1.length == mat2.length) {
			for (int i = 0; i < mat1.length; i++) {
				if (mat1[i].length == mat2[i].length) {
					for (int k = 0; k < mat1[i].length; k++) {
						if (mat1[i][k] == mat2[i][k])
							continue;
						else
							return false;
					}
				} else
					return false;
			}
		} else
			return false;
		return true;
	}

	
	public static void main(String[] args) {
		int[][] matrise = {
				{5, 7, 3, 9, 2},
				{34, 67, 2, 89, 45},
				{23, 4, 9, 0, 12},
				};
		
		System.out.println(tilStreng(matrise));
	}

}
