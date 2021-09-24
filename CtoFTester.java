//Nicole Liu
//Period 9
//The function celsiusToFahrenheit() should have the parameter celsius which will be replaced by the temperature
//in celsius. This parameter will be a double since temperatures can be decimals. The function fahrenheitToCelsius()
//should have the parameter fahrenheit which will be replaced by the temperature in fahrenheit. This parameter will also
//be a double. The function celsiusToFahrenheit() should return the Fahrenheit conversion of the celsius argument.
// The function fahrenheitToCelsius() should return the Celsius conversion of the fahrenheit argument.
public class CtoFTester{
  public static double celsiusToFahrenheit(double celsius){
    double Fahrenheit = (celsius*(9.0/5.0))+32.0;
    return Fahrenheit;
  }
  public static double fahrenheitToCelsius(double fahrenheit){
    double Celsius = (fahrenheit-32.0)*(5.0/9.0);
    return Celsius;
  }
	public static void main(String[] args){
		System.out.println(celsiusToFahrenheit(30.0));
    System.out.println(celsiusToFahrenheit(20.0));
	}
}
