package CalculadoraBasic;

import java.util.Scanner;

public class CalculadoraMain {
	
	static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Calculadora calculator = new Calculadora(0,"+",0,0);
		
		System.out.println("¡Bienvenido a la BasicCalculator!");
		System.out.println("¡Introduce una opción de nuestro menú!");
		System.out.println("1.SUMAR \n2.RESTAR \n3.MULTIPLICAR \n4.DIVIDIR" );
		int eleccion = entrada.nextInt();
		
		switch (eleccion) {
		case 1: {
			//public void Suma () { //COMO METER ESTO EN UNA FUNCION Y LLAMAR AL OBJETO CALCULADORA SE PUEDE ¿?
			//METER SWITCH
			
				System.out.println("Introduce tu primer número: ");
				double numero1 = entrada.nextDouble();
				calculator.setNumero1(numero1);
				System.out.println("Introduce tu segundo número: ");
				double numero2 = entrada.nextDouble();
				calculator.setNumero2(numero2);
				calculator.getResultado(numero1, numero2);
				System.out.println(calculator);
				
			//}
			break;
		}
		case 2: {
		
			break;
		}
		case 3: {
			break;
		}
		case 4: {
			break;
		}	
		default:
			System.err.println("Elección errónea vuelva a introducirla.");
		}
	
		
	}

}
