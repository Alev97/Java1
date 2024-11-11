
/*

Dato un triangolo rettangolo i cui cateti misurano rispettivamente 45.3 e 67.2 metri,

1) calcolare e stampare la lunghezza dell'ipotenusa

2) calcolare e stampare la sua area

3) calcolare e stampare il suo perimetro

Infine stampare circonferenza e area di u cerchio di raggio pari ai 3/4 dell'ipotenusa.

NB: In java per la radice quadrata utilizzare Math.sqrt(x). Se Math viene mostrato sottolineato, andare con il mouse su Math e selezionare la import della libreria

 */

public class Pitagora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double c1 = 45.3;
		double c2 = 67.2;
		double i = Math.sqrt((c1 * c1) + (c2 * c2));
		
		double p = (c1 + c2 + i);
		double a = (c1 * c2)/2;
		
		System.out.println("Ipotenusa: " + i);
		System.out.println("Perimetro: " + p);
		System.out.println("Area: " + a);
				
		// cerchio
		
		double r = (i/4)*3;
		double ac = (r * r)*3.14;
		double pc = 2*(3.14*r);
		
		System.out.println("Raggio: " + r);
		System.out.println("Perimetro cerhio: " + pc);
		System.out.println("Area cerchio: " + ac);
		
		TriangoloRettangolo tr = new TriangoloRettangolo(3,4);
		
		System.out.println("Ipotenusa: " + tr.getHyp());
		System.out.println("Area: " + tr.getArea());
		
		tr.setCat1(6);
		System.out.println("Ipotenusa: " + tr.getHyp());
		System.out.println("Area: " + tr.getArea());
		
		TriangoloRettangolo tr1 = new TriangoloRettangolo(900, 0.2);
		tr1.setCat2(9876);
	}

}
