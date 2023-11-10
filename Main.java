public class Main{
  public static void main(String[] args) {
    String Name = "Ezikiele P. Manganaan";
    String Elementary1 = "Cubao Elementary School";
    int ElemYearsOfLearning = 6;

    String HighSchool1 = "Philippine Science High School";
    String Accepted = "Waitlisted";
    int CurrentYearsOfLearning1 = 4;

    String Club1 = "Himig Agham";
    String ChoirVoiceClass = "Tenor 1";
    String ModalVocalRange = "G2-F#4";

    System.out.println("Elementary");
    System.out.println("Name: " + Name);
    System.out.println("Elementary School: " + Elementary1);
    System.out.println("Years of Learning: " + ElemYearsOfLearning);

    System.out.println("\nHigh School");
    System.out.println("Current School: " + HighSchool1);
    System.out.println("Status: " + Accepted);
    System.out.println("Current Years Of Learning: " + CurrentYearsOfLearning1);

    System.out.println("\nClub");
    System.out.println("Club: " + Club1);
    System.out.println("Voice Class: " + ChoirVoiceClass);
    System.out.println("Modal Vocal Range: " + ModalVocalRange);

    int totalYearsOfLearning = ElemYearsOfLearning + CurrentYearsOfLearning1;
    boolean timeSpentStudying = ElemYearsOfLearning > CurrentYearsOfLearning1;
    int yearsUntilGraduation = 6 - CurrentYearsOfLearning1;

    System.out.println("\nTotal Learning Years: " + totalYearsOfLearning);
    System.out.println("True or False: I spent more years in Elementary than my current school: " + timeSpentStudying);
    System.out.println("Years Until Graduation: " + yearsUntilGraduation);
  }
}