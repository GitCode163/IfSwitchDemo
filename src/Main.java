import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Gib eine Zahl ein: ");
        int zahl = sc.nextInt();

        // IF / ELSE – prüft positiv/negativ/0
        if (zahl > 0) {
            System.out.println("Die Zahl ist positiv.");
        } else if (zahl < 0) {
            System.out.println("Die Zahl ist negativ.");
        } else {
            System.out.println("Die Zahl ist 0.");
        }

        // SWITCH – reagiert auf bestimmte Werte
        switch (zahl) {
            case 1:
                System.out.println("Du hast die 1 eingegeben.");
                break;
            case 2:
                System.out.println("Du hast die 2 eingegeben.");
                break;
            case 0:
                System.out.println("Spezialfall: Null.");
                break;
            default:
                System.out.println("Andere Zahl.");
        }

        sc.close();
    }
}

