//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int binaryNum = 10110001;
        String exaNum = "B234A";
        String date = "01/12/2024";
        String str = String.valueOf(binaryNum);
        System.out.println(str.matches("[01]*"));  //verifica se la stringa rappresenta un numero binario
        System.out.println(exaNum.matches("[A-F0-9]*")); //verifica se la stringa rappresenta un numero esadecimale: un numero esadecimale contiene numeri tra 0 e 9 e caratteri tra A e F
        System.out.println(date.matches("[0-9]{2}/[0-9]{2}/[0-9]"));
    }
}