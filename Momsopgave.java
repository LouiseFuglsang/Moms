import java.util.Scanner;

public class Momsopgave {
    public static void main(String[] args) {
        plusDanskMoms();
        plusDanskMoms();
        plusDanskMoms();
    }
    public static void plusDanskMoms() {
        Scanner input = new Scanner(System.in);

        System.out.print("Skriv købsbeløb: ");
        double koebsbeløb = input.nextDouble();

        double moms = koebsbeløb * 0.25;
        System.out.println("salgsmoms er kr" + (int) (moms * 100) / 100.0);
    }

}

