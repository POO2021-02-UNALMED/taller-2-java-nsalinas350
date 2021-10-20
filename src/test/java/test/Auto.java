package test;


public class Auto {
	String modelo;
	int precio;
	Asiento[] asientos;
	String marca;
	Motor motor;
	int registro; 
	static int cantidadCreados;
	
	
	int cantidadAsientos(){
		int cantidad = 0;
		for (int i = 0;i < asientos.length; i++) {
			if(asientos[i] instanceof Asiento) {
				cantidad++;
			}
		}
		return cantidad;
	}



	String verificarIntegridad() {
		String r = "Auto original";
		if (registro == motor.registro) {
			for (int i = 0;i < asientos.length; i++) {
				if(asientos[i] != null) {
					if(registro == asientos[i].registro) {
						continue;
					}else {
						r = "Las piezas no son originales";
						break;
					}
				}
			}
		}
		return r;
	}

				
}
	
