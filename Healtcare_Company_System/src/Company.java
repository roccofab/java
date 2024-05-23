import java.util.ArrayList;

public class Company {
    ArrayList<Ward> wards;
    ArrayList<Cleaners> cleaners; //cleaners work in all wards, so they are not assigned to a specific ward

    public Company() {
        wards = new ArrayList<Ward>();
        cleaners = new ArrayList<Cleaners>();
    }

    public void addWard(Ward ward) {
        wards.add(ward);
    }

    public Ward getWard(String name) {  //search for a specific ward in the list wards by name
        for (Ward ward : wards) {
            if (ward.getName().equals(name)) {
                return ward;
            }
        }
        return null;
    }

    public boolean SearchCleaner(String name) {
        for (Cleaners cleaner : cleaners) {
            if (cleaner.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    public void removeCleaner(Cleaners cleaner) {
        if (SearchCleaner(String.valueOf(cleaner))) {
            cleaners.remove(cleaner);
        }
    }

    public void addCleaner(Cleaners cleaner) {
        if (!SearchCleaner(String.valueOf(cleaner))) {
            cleaners.add(cleaner);
        }
    }

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

