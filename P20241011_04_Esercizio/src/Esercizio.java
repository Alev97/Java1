
/*
 * Realizzare una classe Computer coni seguenti attributi:
 * - prezzo
 * - peso
 * - dimensioni (larghezza, altezza, profondità)
 * - produttore
 * - anno di produzione
 * 
 * Nel main creare degli oggetti di tipo Computer 
 * e stampare il loro contenuto
 * 
 * N.B ricodate di usare getter, setter e costruttore generati 
 * 	   da eclipse
 * 
 * Bonus: aggiungere un metodo alla classe Computer
 * che stampi quanti oggetti (di tipo Computer) sono stati creati
 */

public class Esercizio {

	public static void main(String[] args) {
		
		Computer pc1 = new Computer(2.4f, 2.3f, 15.6f, 12.0f, 16.0f, "hp", 2024);
        Computer pc2 = new Computer(10.7, 1.0, 12.0, 18.0, 23.0, "Lenovo", 2014);

        // stampa info  dei pc
        pc1.stampaInfo();
        pc2.stampaInfo();

        // stampa il conteggio totale dei pc creati
        System.out.println("Numero totale dei pc creati: " + Computer.getConteggioPc());

	}
}
