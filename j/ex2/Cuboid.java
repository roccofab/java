import java.lang.*;
import java.util.Scanner;

class Cuboid{
 public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  int heigth, length, breadth;
  int volume, totalArea;
  System.out.println("Enter heigth, length, breadth: ");
  heigth = sc.nextInt();
  length = sc.nextInt();
  breadth = sc.nextInt();
  volume = length * breadth * heigth;
  totalArea = 6 * (length * length);
System.out.println("Volume: " +volume+ "\n Total Area: " +totalArea);
 }
}