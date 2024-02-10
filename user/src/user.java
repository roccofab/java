public class user {
    String name = "user_from_Japan";
    String origin = "Japan";
    int age = 30;
    String profession = "programmer";
    int workingYears = 5;
    String[] favoriteOperatingSystems = {"Linux Debian", "Kali Linux", "Windows11", "Parrot Os"};
    String favoriteProgramminLanguage = "java";
    String favoriteIDE = "vscode";
    String favoriteFramework = "Spring Boot";

    void printAllInformation() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Origin: " + origin);
        System.out.println("Profession: " + profession);
        System.out.println("Years working: " + workingYears);
        System.out.println("Favorite Operating Systems:");
        for (String os : favoriteOperatingSystems) {
            System.out.println("- " + os);
        }
        System.out.println("Favorite Programming Language: " + favoriteProgramminLanguage);
        System.out.println("Favorite IDE: " + favoriteIDE);
        System.out.println("Favorite Framework: " + favoriteFramework);
    }
}
