
public class Main {

	public static void main(String[] args) {
		{

			for (int i = 0; i < 100; i++) {
				System.out.println(i);
			}
		}
		{
			int i = 0;
			while (i < 100) {
				System.out.println(i);
				i = i + 1;
			}
		}
		{
			int i = 0;
			do {
				System.out.println(i);
				i = i + 1;
			} while (i < 100);
		}

		{
			String i = "Embè";
			switch (i) {
			case "Uno":
			case "due":
			case "Cosa": { // istruzioni...
				System.out.println("Cosa");
			}
				break;
			case "Va bene?": // istruzioni...
				System.out.println("Va bene");
				break;
			case "Embè": // istruzioni...
				System.out.println("Ho trovato Embè");
				break;
			default:
				// istruzioni che verrano eseguite se
				// nessun case è verificato
				System.out.println("Default");
				break;
			// altri case...

			}
		}
	}
}
