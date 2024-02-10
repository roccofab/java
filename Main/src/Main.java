import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press 1 to convert temperature, press 2 to convert length, press 3 to convert weight, press 4 to convert pressure: ");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Press C to enter Celsius temperature, Press F to enter Fahrenheit temperature, Press K to enter Kelvin temperature, Press N to enter Newtons temperature: ");
                String symbol = new Scanner(System.in).nextLine();
                switch (symbol) {
                    case "C":
                        System.out.println("Enter the temperature in Celsius: ");
                        double celsius = scanner.nextDouble();
                        double fahrenheit = temperatureConverter.celsiusToFahrenheit(celsius);
                        double kelvin = temperatureConverter.celsiusToKelvin(celsius);
                        double newtons = temperatureConverter.celsiusToNewton(celsius);
                        System.out.println("Fahrenheit: " + fahrenheit + "\n Kelvin: " + kelvin + "\n Newtons: " + newtons);
                        break;

                    case "F":
                        System.out.println("Enter the temperature in Fahrenheit: ");
                        double fahrenheit2 = scanner.nextDouble();
                        double celsius2 = temperatureConverter.fahrenheitToCelsius(fahrenheit2);
                        double kelvin2 = temperatureConverter.fahrenheitToKelvin(fahrenheit2);
                        System.out.println("Celsius: " + celsius2 + " \n Kelvin: " + kelvin2);
                        break;
                    case "K":
                        System.out.println("Enter the temperature in Kelvin: ");
                        double kelvin3 = scanner.nextDouble();
                        double celsius3 = temperatureConverter.kelvinToCelsius(kelvin3);
                        double fahrenheit3 = temperatureConverter.kelvinToFahrenheit(kelvin3);
                        System.out.println("Celsius: " + celsius3 + "\n Kelvin: " + fahrenheit3);
                        break;
                    case "N":
                        System.out.println("Enter the temperature in Newtons: ");
                        double newtons2 = scanner.nextDouble();
                        double celsius4 = temperatureConverter.newtonToCelsius(newtons2);
                        System.out.println("Celsius: " + celsius4);
                        break;
                }
                break;

            case 2:
                System.out.println("Press m to enter metres, press km to enter kilometres, press cm to enter centimeters, press in to enter inches, press ft to enter feet, press y to enter yards");
                String symbol2 = new Scanner(System.in).nextLine();
                switch (symbol2) {
                    case "m":
                        System.out.println("Enter the length in metres: ");
                        double metres = scanner.nextDouble();
                        double kilometres = lengthConverter.metresToKilometers(metres);
                        double centimeters = lengthConverter.metresToCentimeters(metres);
                        double inches = lengthConverter.metresToInches(metres);
                        double feet = lengthConverter.metresToFeet(metres);
                        double yards = lengthConverter.metresToYards(metres);
                        System.out.println("Kilometers: " + kilometres + "\n Centimeters: " + centimeters + "\n Inches: " + inches + "\n Feet:  " + feet + "\n Yards: " + yards);
                        break;

                    case "km":
                        System.out.println("Enter the length in Kilometers: ");
                        double kilometres2 = scanner.nextDouble();
                        double metres2 = lengthConverter.kilometersToMetres(kilometres2);
                        double centimeters2 = lengthConverter.kilometersToCentimeters(kilometres2);
                        System.out.println("Metres: " + metres2 + "\n Centimeters: " + centimeters2);
                        break;

                    case "cm":
                        System.out.println("Enter the length in Centimeters: ");
                        double centimeters3 = scanner.nextDouble();
                        double metres3 = lengthConverter.centimetersToMetres(centimeters3);
                        double kilometers3 = lengthConverter.centimetersToKilometers(centimeters3);
                        double inches2 = lengthConverter.centimetersToInches(centimeters3);
                        double feet2 = lengthConverter.centimetersToFeet(centimeters3);
                        double yards2 = lengthConverter.centimetersToYards(centimeters3);
                        System.out.println("Metres: " + metres3 + "\n Kilometers: " + kilometers3 + "\n Inches: " + inches2 + "\n Feet: " + feet2 + "\n Yards: " + yards2);
                        break;

                    case "in":
                        System.out.println("Enter the length in Inches: ");
                        double inches4 = scanner.nextDouble();
                        double metres4 = lengthConverter.inchesToMetres(inches4);
                        double centimeters4 = lengthConverter.inchesToCentimeters(inches4);
                        System.out.println("Metres: " + metres4 + "\n Centimeters: " + centimeters4);
                        break;

                    case "ft":
                        System.out.println("Enter the length in Feet: ");
                        double feet5 = scanner.nextDouble();
                        double metres5 = lengthConverter.feetToMetres(feet5);
                        System.out.println("Metres: " + metres5);
                        break;

                    case "y":
                        System.out.println("Enter the length in Yards: ");
                        double yards3 = scanner.nextDouble();
                        double metres6 = lengthConverter.yardsToMetres(yards3);
                        System.out.println("Metres: " + metres6);
                        break;
                }
                break;
            case 3:
                System.out.println("Press g to enter Grams, press kg to enter Kilograms, press o to enter Ounces, press p to enter Pounds: ");
                String symbol3 = new Scanner(System.in).nextLine();
                switch (symbol3) {
                    case "g":
                        System.out.println("Enter the weight in Grams: ");
                        double grams = scanner.nextDouble();
                        double kg = converterWeight.gramsToKilograms(grams);
                        double ounces = converterWeight.gramsToOunces(grams);
                        double pounds = converterWeight.gramsToPounds(grams);
                        System.out.println("Kilograms: " + kg + "\n Ounces: " + ounces + "\n Pounds: " + pounds);
                        break;

                    case "kg":
                        System.out.println("Enter the weight in Kilograms: ");
                        double kg2 = scanner.nextDouble();
                        double grams2 = converterWeight.kilogramsToGrams(kg2);
                        double ounces2 = converterWeight.kilogramsToOunces(kg2);
                        double pounds2 = converterWeight.kilogramsToPounds(kg2);
                        System.out.println("Grams: " + grams2 + "\n Ounces: " + ounces2 + "\n Pounds: " + pounds2);
                        break;

                    case "o":
                        System.out.println("Enter the weight in Ounces: ");
                        double ounces3 = scanner.nextDouble();
                        double grams3 = converterWeight.ouncesToGrams(ounces3);
                        double kg3 = converterWeight.ouncesToKilograms(ounces3);
                        double pounds3 = converterWeight.ouncesToPounds(ounces3);
                       System.out.println("Grams: " + grams3 + "\n Kilograms: " + kg3 + "\n Pounds: " + pounds3);
                        break;

                    case "p":
                        System.out.println("Enter the weight in Pounds: ");
                        double pounds4 = scanner.nextDouble();
                        double grams4 = converterWeight.poundsToGrams(pounds4);
                        double kg4 = converterWeight.poundsToKilograms(pounds4);
                        double ounces4 = converterWeight.poundsToOunces(pounds4);
                        System.out.println("Grams: " +grams4+ "\n Kilograms: " +kg4+ "\n Ounces: " +ounces4);
                        break;
                }
            case 4:
                String symbol4;
                System.out.println("Press P to enter Pascal, press atm to enter Atmpsheres, press torr to enter Torr, Press psi to enter Psi: ");
                         symbol4 = new Scanner(System.in).nextLine();
                         switch(symbol4) {
                             case "P":
                                 System.out.println("Enter the pressure in Pascal: ");
                                 double pascal = scanner.nextDouble();
                                 double atm = pressureConverter.pascalToAtmosphere(pascal);
                                 double torr = pressureConverter.pascalToTorr(pascal);
                                 double psi = pressureConverter.pascalToPsi(pascal);
                                 System.out.println("Atmospheres: " +atm+ "\n Torres: " +torr+ "\n Psi: " +psi);
                                 break;

                             case "atm":
                                 System.out.println("Enter the pressure in Atmospheres: ");
                                 double atm2 = scanner.nextDouble();
                                 double pascal2 = pressureConverter.atmosphereToPascal(atm2);
                                 double torr2 = pressureConverter.atmosphereToTorr(atm2);
                                 double psi2 = pressureConverter.atmosphereToPsi(atm2);
                                 System.out.println("Pascal: " +pascal2+ "\n Psi: " +psi2+ "\n Torr: " +torr2);
                                 break;

                             case "psi":
                                 System.out.println("Enter the pressure in Psi: ");
                                 double psi3 = scanner.nextDouble();
                                 double atm3 = pressureConverter.psiToAtmosphere(psi3);
                                 double torr3 = pressureConverter.psiToTorr(psi3);
                                 System.out.println("Atmospheres: " +atm3+ "\n Torres: " +torr3);
                                 break;
                         }
                break;
        }

    }
}