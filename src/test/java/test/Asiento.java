package test;

public class Asiento {
	String color;
	int precio;
	int registro;
	
	void cambiarColor(String c) {
		switch(c)
		{
		case "rojo": color = c;
					break;
		case "verde": color = c;
					break;
		case "amarillo": color = c;
					break;
		case "negro": color = c;
					break;
		case "blanco": color = c;
					break;
		default: 	break;
		}	
	}
}
