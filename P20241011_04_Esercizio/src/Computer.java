
public class Computer {
	
	float prezzo;
	float peso;
	float larghezza;
	float altezza;
	float profondità;
	String produttore;
	int anno_produzione;
	
	
	public double getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(float prezzo) {
		this.prezzo = prezzo;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public double getLarghezza() {
		return larghezza;
	}
	public void setLarghezza(float larghezza) {
		this.larghezza = larghezza;
	}
	public double getAltezza() {
		return altezza;
	}
	public void setAltezza(float altezza) {
		this.altezza = altezza;
	}
	public double getProfondità() {
		return profondità;
	}
	public void setProfondità(float profondità) {
		this.profondità = profondità;
	}
	public String getProduttore() {
		return produttore;
	}
	public int getAnno_produzione() {
		return anno_produzione;
	}
	
	
	private static int conteggioPc = 0;
	
	public Computer(float prezzo, float peso, float larghezza, float altezza, float profondità, String produttore, int anno_produzione) {
        this.prezzo = prezzo;
        this.peso = peso;
        this.larghezza = larghezza;
        this.altezza = altezza;
        this.profondità = profondità;
        this.produttore = produttore;
        this.anno_produzione = anno_produzione;
        conteggioPc ++;
	}
        
    
	public void stampaInfo() {
        System.out.println("Produttore: " + produttore);
        System.out.println("Prezzo: " + prezzo + "€");
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Dimensioni: Larghezza: " + larghezza + " cm, Altezza: " + altezza + " cm, Profondità: " + profondità + " cm");
        System.out.println("Anno di Produzione: " + anno_produzione);
        System.out.println();
    }
    
    public static int getConteggioPc() {
        return conteggioPc;
    }
    
}
