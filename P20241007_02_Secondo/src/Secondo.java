
public class Secondo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Prima riga");
		System.out.println("Seconda riga");
		System.out.println("Terza riga");
		
		// Tipi di dato
		
		byte b1 = 10;
		byte b2;
		b2 = 100;
		byte b3, b4, b5;
		
		System.out.println("Il valore di b1 è: " + b1);
		b1 = 127;
		System.out.println("Il valore di b1 è: " + b1);
		b1 += 1;
		System.out.println("Il valore di b1 è: " + b1);
		
		// per formattare ctrl + shift + f
		
		double d1 = 2.3;
		float f1 = 2.3F;
		
		/* Operatori aritmetici */
		
		/*
		 * +, -, *, /, %
		 * && (and)
		 * || (or)
		 * 
		 * Logica binaria
		 * & (and)
		 * | (or)
		 */
		
		// Esercizio 
		
		int v1 = 35;
		int v2 = 41;
		
		System.out.println(v1 & v2);
		// System.out.println(v1 && v2); non si può fare perchè le variabili sono int e con & logico non si può
		
		/* Altri operatori aritmetici:
		 * ++, --, +=, -=, /=, &=, |=, ^=
		 * Confronto:
		 * <<, >>, <<=, >>=
		 * 
		 * Operatori di shifting:
		 * <<, >>, <<=, >>=
		 * ecc.
		 */
		
		{
			int num1 = 10;
			System.out.println(num1);
		}
		{
			boolean num1 = true;
			System.out.println(num1);
		}
		// Per commentare un blocco di codice ctrl + shift + 7
		
	}

}
