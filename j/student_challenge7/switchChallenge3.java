import java.util.Scanner;
class switchChallenge3{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter Browser Adress: ");
   String url = sc.nextLine();
   String domain = url.substring(url.lastIndexOf(".")+1);
   switch(domain){
      case "com":
        System.out.println("Commercial url");
        break;

      case "org":
        System.out.println("Organization url");
        break;

      case "it":
        System.out.println("Italian url");
        break;

      case "gov":
        System.out.println("Government url");
        break;

      default:
        System.out.println("Invalid");
        break;
  }
 }
}