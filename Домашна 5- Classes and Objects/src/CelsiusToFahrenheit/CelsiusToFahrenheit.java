package CelsiusToFahrenheit;

import java.util.Scanner;

public class CelsiusToFahrenheit {
	private double celsius;
	
	public CelsiusToFahrenheit(){
		this.celsius=0;
	}
	
	public void CelsiusToFahrenheit(double celsius){
		setCelsius(celsius);
		
	}
	public void setCelsius(double celsius){
		this.celsius=celsius;
	}
	public double getCelsius(){
		return celsius;
	}
	
	public static double Convert(double temp) {
		double tempFahrenheit = (temp*9)/5+32;
		return tempFahrenheit;
	}
	
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");
		System.out.print("Enter temperature in Celsius: ");
		double temperature = input.nextDouble();
		temperature = Convert(temperature);
		System.out.println("The temperature in Fahrenheit is: " + temperature);
		input.close();
	

	}

}
