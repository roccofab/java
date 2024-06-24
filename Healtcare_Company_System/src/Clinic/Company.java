package Clinic;
import java.util.ArrayList;
/**
 * The Company class represents a healthcare company that manages multiple wards
 * and employs cleaners who work across all wards.
 * <p>
 * It provides methods to add and retrieve wards, manage cleaners, and perform operations
 * related to patients and doctors within the wards.
 * </p>
 */

public class Company {
    ArrayList<Ward> wards;
    ArrayList<Cleaners> cleaners; //cleaners work in all wards, so they are not assigned to a specific ward

    /**
     * Constructs a Company object with empty lists for wards and cleaners.
     */
    public Company() {
        wards = new ArrayList<Ward>();
        cleaners = new ArrayList<Cleaners>();
    }

    /**
     * Adds a new ward to the company's list of wards.
     *
     * @param ward the ward to be added
     */
    public void addWard(Ward ward) {
        wards.add(ward);
    }

    /**
     * Retrieves a specific ward from the company's list of wards by name.
     *
     * @param name the name of the ward to retrieve
     * @return the Ward object if found, or null if not found
     */
    public Ward getWard(String name) {  //search for a specific ward in the list wards by name
        for (Ward ward : wards) {
            if (ward.getName().equals(name)) {
                return ward;
            }
        }
        return null;
    }

    /**
     *Checks if a cleaner with the specified name exists in the company's list of cleaners.
     * @param name
     * @return true if the cleaner exists, false otherwise
     */
    public boolean SearchCleaner(String name) {
        for (Cleaners cleaner : cleaners) {
            if (cleaner.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    /**
     *Removes a cleaner from the company's list of cleaners.
     * @param cleaner the cleaner to remove
     */
    public void removeCleaner(Cleaners cleaner) {
        if (SearchCleaner(String.valueOf(cleaner))) {
            cleaners.remove(cleaner);
        }
    }

    /**
     * Adds a cleaner to the company's list of cleaners if it does not already exist.
     *
     * @param cleaner the cleaner to be added
     */
    public void addCleaner(Cleaners cleaner) {
        if (!SearchCleaner(String.valueOf(cleaner))) {
            cleaners.add(cleaner);
        }
    }

    /**
     * Retrieves a list of patients from all wards who have a specific personal doctor.
     *
     * @param name the name of the personal doctor
     * @return an ArrayList of patients who have the specified personal doctor
     */
    public ArrayList<Patient> DoctorPerPatient(String name) {  //get the card number of patients in a specific ward who have a specific doctor
        ArrayList<Patient> pat = new ArrayList<Patient>();
        for (Ward ward : wards) {
            for (Patient patient : ward.getPatients()) {
                if (patient.getPersonalDoctor().getName().equalsIgnoreCase(name)) {
                    pat.add(patient);
                }
            }
        }
        return pat;
    }
}

