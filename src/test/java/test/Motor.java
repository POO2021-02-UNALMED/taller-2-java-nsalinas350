package test;


public class Motor {
	int numeroCilindros;
	String tipo;
	int registro;
	
	
	void cambiarRegistro(int r) {
		registro = r;
	}
	
	void asignarTipo(String t) {
		switch(t)
		{
		case "electrico": tipo = t;
					break;
		case "gasolina": tipo = t;
					break;
		default: 	break;
		}	
	}
	
	
	
}
