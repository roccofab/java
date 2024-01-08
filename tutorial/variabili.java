//boolean | true or false | 1byte
//short | -32768-32767 | 2bytes
//int | -2miliardi - 2miliardi | 4bytes
//long | -9 quintilioni - 9 quintilioni | 8bytes

//float | fino a 7 cifre decimali es: 5.23456f | 4bytes
//double | fino a 15 cifre decimali es:5.23456789543 | 8bytes

//char | singolo carattere/lettera/ASCII es: 'f' | 2bytes
//String | sequenza di caratteri es: "Hello World" | variabile
public class variabili{
    public static void main(String[] args) {
        boolean ilBolean = false;
        byte ilByte = 127;

        short x = -32768;
        int y = 2000000000;
        long j = 123456043256781040l;

        float a = 5.234568f;
        double b = 15.0000000000000;

        char letter = 'S';
        String phrase = "Hello this is java's variables tutorial";
        /*phrase. fa apparire una barra di opzioni che si possono attuare sulla stringa, phrase.length
        che come output mi da il numero di caratteri che formano la stringa phrase*/
        System.out.println(phrase.length());                                      
    }
}
        