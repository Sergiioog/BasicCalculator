package CalculadoraBasic;

public class Calculadora {
	
	private double numero1;
	private double numero2;
	private String operacion;
	private double resultado;
	
	public Calculadora (int numero, String operacion, int numero2, int resultado) {
	
		this.numero1 = numero;
		this.operacion = operacion;
		this.resultado = resultado;
		this.numero2 = numero2;
		
	}		
	
//---------------------------------------------------------------------------------------------SETTERS-------------------------------------------------------------------------------------------------------
	
	public void setNumero1(double numero1) {
		
		this.numero1 = numero1;
		
	}

	public void setNumero2(double numero2) {
		
		this.numero2 = numero2;
		
	}

	public void setOperacion(String operacion) {
		
		this.operacion = operacion;
		
	}

	public void setResultado(double resultado) {
		
		this.resultado = resultado;
		
	}

//----------------------------------------------------------------------------------------------GETTERS-------------------------------------------------------------------------------------------------------

	public void getResultado(double numero1,double numero2) {
		//COMO HACER UNA CONDICION QUE DEPENDIENDO DE LA FUNCION DE LA CALCULADORA MAIN ESCOJA DIFERENTES OPERACIONES
		resultado = numero1 + numero2;
	}



	@Override
	public String toString() {
		return numero1 + " " +operacion + " " + numero2 + " = " + resultado ;
	}
	
	
}
