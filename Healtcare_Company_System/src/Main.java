import Clinic.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //creation of the healthcare company
        Ward ward1 = new Ward("Analysis Ward");
        Ward ward2 = new Ward("Emergency");
        Ward ward3 = new Ward("Radiology");
        Ward ward4 = new Ward("Cardiology");
        Ward ward5 = new Ward("Rehabilitation");
        Company company = new Company();
        company.addWard(ward1);
        company.addWard(ward2);
        company.addWard(ward3);
        company.addWard(ward4);
        company.addWard(ward5);
        int wardChoice;
        do {
            System.out.println("\n\n1.Analysis Ward (press 1): ");
            System.out.println("2.Emergency Ward (press 2): ");
            System.out.println("3.Radiology Ward (press 3): ");
            System.out.println("4.Cardiology Ward (press 4): ");
            System.out.println("5.Rehabilitation Ward (press 5): ");
            System.out.println("6. Exit (press 6): ");
            wardChoice = sc.nextInt();
            sc.nextLine(); // Consume the newline character

            Ward selectedWard = null;
            switch (wardChoice) {
                case 1:
                    selectedWard = ward1;
                    break;
                case 2:
                    selectedWard = ward2;
                    break;
                case 3:
                    selectedWard = ward3;
                    break;
                case 4:
                    selectedWard = ward4;
                    break;
                case 5:
                    selectedWard = ward5;
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

            if (selectedWard != null) {
                System.out.println("Selected Ward: " + selectedWard.getName());
                System.out.println("1.Add Doctor (press 1): ");
                System.out.println("2.Add Nurse (press 2): ");
                System.out.println("3.Add Operator (press 3): ");
                System.out.println("4.Add Patient (press 4): ");
                System.out.println("5.Remove Doctor (press 5): ");
                System.out.println("6.Remove Nurse (press 6): ");
                System.out.println("7.Remove Operator (press 7): ");
                System.out.println("8.Remove Patient (press 8): ");
                System.out.println("9.Search Doctor (press 9): ");
                System.out.println("10.Search Nurse (press 10): ");
                System.out.println("11.Search Operator (press 11): ");
                System.out.println("12.Search Patient (press 12): ");
                System.out.println("13.Exit (press 13): ");
                int actionChoice = sc.nextInt();
                sc.nextLine(); // Consume the newline character

                switch (actionChoice) {
                    case 1:
                        System.out.println("Enter the name of the doctor: ");
                        String doctorName = sc.nextLine();
                        Doctor doctor = new Doctor(doctorName, selectedWard);
                        selectedWard.addDoctor(doctor);
                        break;
                    case 2:
                        System.out.println("Enter the name of the nurse: ");
                        String nurseName = sc.nextLine();
                        Nurses nurse = new Nurses(nurseName, selectedWard);
                        selectedWard.addNurse(nurse);
                        break;
                    case 3:
                        System.out.println("Enter the name of the operator: ");
                        String operatorName = sc.nextLine();
                        Operator operator = new Operator(operatorName, selectedWard);
                        selectedWard.addOperator(operator);
                        break;
                    case 4:
                        Random rand = new Random();
                        try {
                            if (selectedWard.getDoctors().isEmpty()) {
                                throw new RuntimeException("No doctors available in the ward.");
                            }
                            System.out.println("Enter the card number of the patient: ");
                            String cardNum = sc.nextLine();
                            Doctor doctorPatient = selectedWard.getDoctors().get(rand.nextInt(selectedWard.getDoctors().size()));
                            Patient newPatient = new Patient(cardNum, selectedWard, doctorPatient);
                            selectedWard.addPatient(newPatient);
                            System.out.println("\t- " + newPatient + " \n\tFollowed by: " + doctorPatient);
                        } catch(RuntimeException e) {
                            System.out.println(e.getMessage());
                        } catch(Exception e) {
                            System.out.println("An unexpected error occurred: " + e.getMessage());
                        }
                        break;
                    case 5:
                        System.out.println("Enter the name of the doctor: ");
                        String doctorToRemove = sc.nextLine();
                        selectedWard.removeDoctor(doctorToRemove);
                        break;
                    case 6:
                        System.out.println("Enter the name of the nurse: ");
                        String nurseToRemove = sc.nextLine();
                        selectedWard.removeNurse(nurseToRemove);
                        break;
                    case 7:
                        System.out.println("Enter the name of the operator: ");
                        String operatorToRemove = sc.nextLine();
                        selectedWard.removeOperator(operatorToRemove);
                        break;
                    case 8:
                        System.out.println("Enter the card number of the patient: ");
                        String cardNumToRemove = sc.nextLine();
                        selectedWard.removePatient(cardNumToRemove);
                        break;
                    case 9:
                        System.out.println("Enter the name of the doctor: ");
                        String doctorToSearch = sc.nextLine();
                        System.out.println(selectedWard.SearchDoctor(doctorToSearch));
                        break;
                    case 10:
                        System.out.println("Enter the name of the nurse: ");
                        String nurseToSearch = sc.nextLine();
                        System.out.println(selectedWard.SearchNurse(nurseToSearch));
                        break;
                    case 11:
                        System.out.println("Enter the name of the operator: ");
                        String operatorToSearch = sc.nextLine();
                        System.out.println(selectedWard.SearchOperator(operatorToSearch));
                        break;
                    case 12:
                        System.out.println("Enter the card number of the patient: ");
                        String cardNumToSearch = sc.nextLine();
                        System.out.println(selectedWard.SearchPatient(cardNumToSearch));
                        break;
                    case 13:
                        System.exit(0);
                        break;
                }
            }
        } while(wardChoice != 6);
    }
}