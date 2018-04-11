package vehicles;

public class Vehicle {

	private int cilindrada;
	private int portes;
	private int velocitat_actual;
	private int marxa_actual = 0;
	public static final int VELOCITAT_MAXIMA = 120;
	public static final int MARXES = 5;
	
		
		public Vehicle(int cilindrada, int portes, int velocitat_actual) {
			super();
			this.cilindrada = cilindrada;
			this.portes = portes;
			this.velocitat_actual = 0;
		}
		
		public void accelerar(int velocitat) {	
			
			if (velocitat < this.VELOCITAT_MAXIMA) {
				velocitat += 10;
			}		
			else {
				velocitat =  this.VELOCITAT_MAXIMA;
			}
		}
		
		public void desaccelerar(int velocitat) {	
			
			if (velocitat > 0) {
				velocitat -= 10;
			}		
			else {
				velocitat =  0;
			}
		}
		
		public void pujarMarxa (int marxa) {	
			if (marxa < MARXES && marxa > 0) {
				marxa += 1; 
			}
		}
		
		public void baixarMarxa (int marxa) {	
			if (marxa < MARXES && marxa > 0) {
				marxa -= 1; 
			}
		}

}
