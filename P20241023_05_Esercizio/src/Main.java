
public class Main {

	public static void main(String[] args) {
		
		int[] vint = new int[100];
		double[] vdou = new double[100];
		
		System.out.println(vint);
		System.out.println(vdou);
		
		for (int i=0; i<100; i++) {
			vint[i]= i+1;
		}
		
		// inserire in vint i numeri da 1 a 100 e
		// in posizione 0 metto 100 poi 99, 98 ecc
		for (int i=100; i>0; i--) {
			vint[100-i]= i; 
		}
		StampaVint(vint);
		
		// inserire in vint i numeri pari (0=>2, 0=>4, 0=>6 ...)
		for (int i=0; i<100; i++) {
			vint[i]=(i+1)*2;
		}
		
		// inserire in vint i numeri dispari (0=>1, 0=>3, 0=>5 ...)
		for (int i=0; i<100; i++) {
			vint[i]=(i+1)*2-1;
		}
		
		// inserire in vdou la serie armonica (1/1, 1/2, 1/3, 1/4, 1/5...)
		for (int i=1; i<=100; i++) {
			vdou[i-1]=1.0/i;
		}
		
		// inserire in vint la seguente serie numerica:
		// 1, 1, 2, 3, 5, 8, 13,... (serie di fibonacci)
		vint[0]=1;
		vint[1]=1;
				
		for (int i=2; i<100; i++) {
			vint[i]=vint[i-1]+vint[i-2];
		}
		StampaVint(vint);
		/*
		// inserire in vint i numeri primi in sequenza: 2, 3, 5, 7, 11, 13, 17,...
		// Crivello di Eratostene
		// implementiamo il crivello e stampiamo i primi 10000 numeri
		Eratostene(10000);
		
	}
		private static void Eratostene(int N) {
			// facciamo un miliardo perchè non so quanti primi
			// ci sono prima di arrivare ad un miliardo
			boolean [] v = new boolean[1000000000];
			for (int i=2; i<v.length; i++) {
				v[i]=true;
			}
			/*
			 * dato che la creazione di un vettore inizializza i suoi valori
			 * al valore di default, tutti gli elementi di v sono stati messi a false
			 * con il for abbiamo messo a true gli elementi da 2 in poi
			 * 0 non è primo e anche 1 non lo consideriamo primo			
			 */
			/* ora il ciclo per determinare i num primi
			int numprimi = 0;
			for (int i=2; i<v.length; i++) {
				if (v[i]==true) {
					System.out.println(i + " è il " + ++numprimi + "esimo numero primo");
					
					// metto a false tutti i suoi multipli
					for (int k=i+i; k<v.length; k+=i) {
						v[k]=false;
					}
				}
			}
            */
		
			// stampare il Fattoriale di un numero N
			System.out.println(Fattoriale(15));
			System.out.println(Fact(15));
			
			// inserire nel vettore vdou la seguente serie geometrica
			// 1, 1/2, 1/(2*2), 1/(2*2*2), 1/(2*2*2*2),...
			// 1/2^0, 1/2^1, 1/2^2, 1/2^3, 1/2^4...
			for (int i=0; i<100; i++) {
				vdou[i] = 1.0/Math.pow(2, i);
			}
			StampaVdou(vdou);

			// la stessa cosa senza Math.pow
			for (int i=0; i<100; i++) {
				// calcolo 2^1
				double dueAllaI = 1;
				for (int j=1; j<=i; j++) {
					dueAllaI *= 2;
				}
				vdou[i]=1.0/dueAllaI;
			}
			StampaVdou(vdou);
		}
		
		// soluzione iterativa
		private static int Fattoriale(int N) {
			int p=1;
			
			for (int i=2; i<N; i++) {
				p = p*i;
			}
			return p;
		}
		
		// soluzione ricorsiva
		public static int Fact(int N) {
			if (N == 0) {
				return 1;
			} else {
				return N * Fact(N-1);
			}
		}
			
		
		private static void StampaVint(int[] vint) {
			for (int v: vint) {
				System.out.print(v + " ");
			}
		System.out.println();
	}
		private static void StampaVdou(double[] vdou) {
			for (double v: vdou) {
				System.out.println(v + " ");
			}
		System.out.println();
		}
}
