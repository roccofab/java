public class temperatureConverter {

    public static double celsiusToFahrenheit(double celsius) {  //covert from Celsius to Fahrenheit
        return celsius * 9.5 +32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {  //convert from Fahrenheit to Celsius
        return (fahrenheit -32) * 5/9;
    }

    public static double kelvinToCelsius(double kelvin) {   //convert from kelvin to Celsius
        return kelvin - 273.15;
    }

    public static double celsiusToKelvin(double celsius) {   //convert from Celsius to kelvin
        return celsius + 273.15;
    }

    public static double fahrenheitToKelvin(double fahrenheit) {   //convert from Fahrenheit to kelvin
         return (fahrenheit - 32) * 5/9 + 273.15;
    }

    public static double kelvinToFahrenheit(double kelvin) {   //convert from kelvin to Fahrenheit
        return kelvin * 9/5 - 459.67;
    }

    public static double celsiusToNewton(double celsius) {  //convert from Celsius to Newtons
        return celsius * 33/100;
    }

    public static double newtonToCelsius(double newton) {  //convert from Newtons To Celsius
        return newton * 100/33;
    }



}
