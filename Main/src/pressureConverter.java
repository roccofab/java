public class pressureConverter {

    public static double pascalToAtmosphere(double pascal) {  //convert from Pascal to Atmosphere
        return pascal * 9.86923e-6;
    }

    public static double atmosphereToPascal(double atmosphere) {  //convert from atmosphere to Pascal
        return atmosphere * 101325;
    }

    public static double pascalToTorr(double pascal) {   //convert from Pascal to Torr
        return pascal * 0.00750062;
    }
    public static double torrToPascal(double torr) {  //convert from Torr to Pascal
        return torr * 133.322;
    }

    public static double pascalToPsi(double pascal) {   //convert from Pascal to Psi
        return pascal * 0.00014503773773375;
    }

    public static double psiToPascal(double psi) {
        return psi * 6894.76;
    }

    public static double atmosphereToTorr(double atmosphere) {  //convert from atmosphere to Torr
        return atmosphere * 760;
    }

    public static double torrToAtmosphere(double torr) {   //convert from Torr to atmosphere
        return torr / 760;
    }
    public static double atmosphereToPsi(double atmosphere) {  //convert from atmosphere to Psi
        return atmosphere * 14.6959;
    }

    public static double psiToTorr(double psi) {   //convert from psi to Pascal
        return psi * 51.7149;
    }

    public static double torrToPsi(double torr) {
        return torr / 51.7149;
    }

    public static double psiToAtmosphere(double psi) {
        return psi * 0.00689476;
    }

}
