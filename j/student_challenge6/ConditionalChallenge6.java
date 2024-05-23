import java.util.Scanner;
class ConditionalChallenge6{
  public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter URL: ");
   String url = sc.nextLine();
   String protocol = url.substring(0, url.indexOf(":"));
   String domain = url.substring(url.lastIndexOf(".")+1);
    if(protocol.equals("http")) {
    System.out.println("Hyper Text Transfer Protocol");
  } else if(protocol.equals("ftp")){
    System.out.println("File Transfer Protocol");
  }
   if(domain.equals("com")) {
    System.out.println("Commercial Domain");
  } else if(domain.equals("org")){
    System.out.println("Organization Domain");
  } else if(domain.equals("gov")) {
    System.out.println("Government Domain");
  } else{
   System.out.println("Not a Web Adress");
  }
 }
}