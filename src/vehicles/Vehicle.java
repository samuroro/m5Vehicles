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
			this.velocitat_actual = 0;
		}
		
		public void accelerar(int velocitat) {				
				velocitat += 10;
		}
}
