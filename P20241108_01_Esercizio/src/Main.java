import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		
		LinkedList<Studente> lstud = new LinkedList<Studente>();
		lstud.add(new Studente("pippo", 34, "altro", 12));
		lstud.add(new Studente("ugo", 22, "altro", 11));
		lstud.add(new Studente("aaa cercasi", 18, "altro", 11));
		
		System.out.println(lstud);
		
		LinkedList<Integer> li = new LinkedList<Integer>();
		li.add(10);
		li.add(20);
		li.add(1);
		System.out.println(li);
		
		Collections.sort(li);
		System.out.println(li);
		
		Collections.reverse(li);
		System.out.println(li);
		
		// per mischiare gli elementi:
		Collections.shuffle(li);
		System.out.println(li);
		
		// Collections.max(li);
		System.out.println(Collections.max(li));
		
		// Collections.min(li);
		System.out.println(Collections.min(li));
		
		Collections.sort(lstud);
		System.out.println(lstud);
		
		System.out.println("Studenti creati: " + Studente.studentiCreati);
		
		if (false) {
		
			/*
			Persona p1 = (Persona)ParseClass.Parse("Persona");
			// oppure Persona p1 = (Persona)ParseClass.Parse(Persona.class);
			System.out.println(p1);
			*/
				
			Studente s1 = (Studente)ParseClass.Parse(Studente.class);
			System.out.println(1);
			
			
			Studente[] studenti = new Studente[4];
			studenti[0] = new Studente("ugo", 190, "cloud", 1);
			
			Paziente[] pazienti = new Paziente[4];
			pazienti[0] = new Paziente("pino", 215, "tutto", true);
			
			Persona[] persone = new Persona[8];
			
			persone[0] = studenti[0];
			persone[1] = studenti[0];
			
			System.out.println(persone[0]);
			
			for (int i=0; i<persone.length; i++) {
				// persone[i] è un paziente o unn studente?	
			}
			EssereVivente[] ev = new EssereVivente[0];
			
			List<EssereVivente> lev = new LinkedList<EssereVivente>();
			
			EssereVivente p = new EssereVivente() {
				
				public void SetColoreOcchi(String s) {
					// TODO Auto-generated method stub
					
				}
				
				public String GetColoreOcchi(String s) {
					// TODO Auto-generated method stub
					return null;
				}
			};
		}		
	}
}

