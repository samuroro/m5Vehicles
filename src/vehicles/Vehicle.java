package vehicles;

public class Vehicle {

		private int cilindrada;
		private int portes;
		private int velocitat_actual;
		public static final int VELOCITAT_MAXIMA = 120;		
		
		public Vehicle(int cilindrada, int portes, int velocitat_actual) {
			super();
			this.cilindrada = cilindrada;
			this.portes = portes;
			this.velocitat_actual = velocitat_actual;
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

}
