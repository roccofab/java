import java.util.Scanner;
public class ex11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      String[] [] studentsMath = {
        {"marco", "10"},
        {"andrea", "7"},
        {"gianni", "3"},
        {"gianmarco", "3"},
        {"gianfranco", "6.5"},
        {"roberto", "7"},
        {"dario", "8.5"},
        {"alberto", "7"},
        {"emanuele", "9"},
        {"sara", "9"},
        {"alessia", "6"},
        {"elisa", "7"},
        {"carla", "3"}
      };
      double average = 0;
      double sum = 0;

      for(String[]  l : studentsMath) {
         System.out.println("\n\nNome: " +l[0]+ "\t\t voto: " +l[1]+ "\n\n");
        
         double voto = Double.parseDouble(l[1]);
          sum += voto;
      }
      int numStu = studentsMath.length;
      average = sum / numStu;

      System.out.println("\t\tThe class average is: " +average+ "\n\n");
    }
}