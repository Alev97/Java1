
public class Studente extends Persona {
	private String corso;
	private int annoDiFrequenza;
	
	public Studente(String nome, int età, String corso, int annoDiFrequenza) {
		super(nome, età);
		this.corso = corso;
		this.annoDiFrequenza = annoDiFrequenza;
	}

	public String getCorso() {
		return corso;
	}

	public void setCorso(String corso) {
		this.corso = corso;
	}

	public int getAnnoDiFrequenza() {
		return annoDiFrequenza;
	}

	public void setAnnoDiFrequenza(int annoDiFrequenza) {
		this.annoDiFrequenza = annoDiFrequenza;
	}

	public String toString() {
		return "Studente [corso=" + corso + ", annoDiFrequenza=" + annoDiFrequenza + ", toString()=" + super.toString()
				+ "]";
	}

}
	
