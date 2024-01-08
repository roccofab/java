import java.util.Scanner;
public class romanNumber {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         while(true) {
         String [] from1to30 = {"I", "II", "III", "IV", "V", "VI", "VII", "IIX", "IX", "X", "XI", "XII","XIII","XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX", "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX"};
         String [] from30to60 = {"XXXI", "XXXII", "XXIII", "XXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL", "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX"}; 
         String [] from60to100 = {"LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX", "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX", "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC", "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"};
         System.out.println("Enter number from 1 to 100(stop to finish): ");
         int numI = input.nextInt();

         switch(numI) {
            case 1:
            System.out.println(from1to30[0]);
            break;

            case 2:
            System.out.println(from1to30[1]);
            break;

             case 3:
            System.out.println(from1to30[2]);
            break;

             case 4:
            System.out.println(from1to30[3]);
            break;

             case 5:
            System.out.println(from1to30[4]);
            break;

             case 6:
            System.out.println(from1to30[5]);
            break;

             case 7:
            System.out.println(from1to30[6]);
            break;

             case 8:
            System.out.println(from1to30[7]);
            break;

             case 9:
            System.out.println(from1to30[8]);
            break;

             case 10:
            System.out.println(from1to30[9]);
            break;

             case 11:
            System.out.println(from1to30[10]);
            break;

             case 12:
            System.out.println(from1to30[11]);
            break;

             case 13:
            System.out.println(from1to30[12]);
            break;

             case 14:
            System.out.println(from1to30[13]);
            break;

             case 15:
            System.out.println(from1to30[14]);
            break;

             case 16:
            System.out.println(from1to30[15]);
            break;

             case 17:
            System.out.println(from1to30[16]);
            break;

             case 18:
            System.out.println(from1to30[17]);
            break;

             case 19:
            System.out.println(from1to30[18]);
            break;

             case 20:
            System.out.println(from1to30[19]);
            break;

            case 21:
            System.out.println(from1to30[20]);
            break;

            case 22:
            System.out.println(from1to30[21]);
            break;

              case 23:
            System.out.println(from1to30[22]);
            break;

              case 24:
            System.out.println(from1to30[23]);
            break;

              case 25:
            System.out.println(from1to30[24]);
            break;

              case 26:
            System.out.println(from1to30[25]);
            break;

              case 27:
            System.out.println(from1to30[26]);
            break;

              case 28:
            System.out.println(from1to30[27]);
            break;

              case 29:
            System.out.println(from1to30[28]);
            break;

              case 30:
            System.out.println(from1to30[29]);
            break;

             case 31:
            System.out.println(from30to60[0]);
            break;

             case 32:
            System.out.println(from30to60[1]);
            break;

             case 33:
            System.out.println(from30to60[2]);
            break;

             case 34:
            System.out.println(from30to60[3]);
            break;

             case 35:
            System.out.println(from30to60[4]);
            break;

             case 36:
            System.out.println(from30to60[5]);
            break;

             case 37:
            System.out.println(from30to60[6]);
            break;

             case 38:
            System.out.println(from30to60[7]);
            break;

             case 39:
            System.out.println(from30to60[8]);
            break;

             case 40:
            System.out.println(from30to60[9]);
            break;

             case 41:
            System.out.println(from30to60[10]);
            break;

             case 42:
            System.out.println(from30to60[11]);
            break;

             case 43:
            System.out.println(from30to60[12]);
            break;

             case 44:
            System.out.println(from30to60[13]);
            break;

             case 45:
            System.out.println(from30to60[14]);
            break;

             case 46:
            System.out.println(from30to60[15]);
            break;

             case 47:
            System.out.println(from30to60[16]);
            break;

             case 48:
            System.out.println(from30to60[17]);
            break;

             case 49:
            System.out.println(from30to60[18]);
            break;

             case 50:
            System.out.println(from30to60[19]);
            break;

             case 51:
            System.out.println(from30to60[20]);
            break;

             case 52:
            System.out.println(from30to60[21]);
            break;

             case 53:
            System.out.println(from30to60[22]);
            break;

             case 54:
            System.out.println(from30to60[23]);
            break;

             case 55:
            System.out.println(from30to60[24]);
            break;

             case 56:
            System.out.println(from30to60[25]);
            break;

             case 57:
            System.out.println(from30to60[26]);
            break;

             case 58:
            System.out.println(from30to60[27]);
            break;

              case 59:
            System.out.println(from30to60[28]);
            break;

              case 60:
            System.out.println(from30to60[29]);
            break;

             case 61:
            System.out.println(from60to100[0]);
            break;

             case 62:
            System.out.println(from60to100[1]);
            break;

             case 63:
            System.out.println(from60to100[2]);
            break;

             case 64:
            System.out.println(from60to100[3]);
            break;

             case 65:
            System.out.println(from60to100[4]);
            break;

             case 66:
            System.out.println(from60to100[5]);
            break;

             case 67:
            System.out.println(from60to100[6]);
            break;

             case 68:
            System.out.println(from60to100[7]);
            break;

             case 69:
            System.out.println(from60to100[8]);
            break;

             case 70:
            System.out.println(from60to100[9]);
            break;

             case 71:
            System.out.println(from60to100[10]);
            break;

             case 72:
            System.out.println(from60to100[11]);
            break;

             case 73:
            System.out.println(from60to100[12]);
            break;

             case 74:
            System.out.println(from60to100[13]);
            break;

             case 75:
            System.out.println(from60to100[14]);
            break;

             case 76:
            System.out.println(from60to100[15]);
            break;

             case 77:
            System.out.println(from60to100[16]);
            break;

             case 78:
            System.out.println(from60to100[17]);
            break;

             case 79:
            System.out.println(from60to100[18]);
            break;

             case 80:
            System.out.println(from60to100[19]);
            break;

             case 81:
            System.out.println(from60to100[20]);
            break;

             case 82:
            System.out.println(from60to100[21]);
            break;

             case 83:
            System.out.println(from60to100[22]);
            break;

             case 84:
            System.out.println(from60to100[23]);
            break;

             case 85:
            System.out.println(from60to100[24]);
            break;

              case 86:
            System.out.println(from60to100[25]);
            break;

              case 87:
            System.out.println(from60to100[26]);
            break;

              case 88:
            System.out.println(from60to100[27]);
            break;

              case 89:
            System.out.println(from60to100[28]);
            break;

              case 90:
            System.out.println(from60to100[29]);
            break;

              case 91:
            System.out.println(from60to100[30]);
            break;

              case 92:
            System.out.println(from60to100[31]);
            break;

              case 93:
            System.out.println(from60to100[32]);
            break;

              case 94:
            System.out.println(from60to100[33]);
            break;

             case 95:
            System.out.println(from60to100[34]);
            break;

              case 96:
            System.out.println(from60to100[35]);
            break;

              case 97:
            System.out.println(from60to100[36]);
            break;

              case 98:
            System.out.println(from60to100[37]);
            break;

              case 99:
            System.out.println(from60to100[38]);
            break;

              case 100:
            System.out.println(from60to100[39]);
            break; 

            default:
            System.out.println("I can convert only numbers from 1 to 100 =(");
         }
         }
    }
}