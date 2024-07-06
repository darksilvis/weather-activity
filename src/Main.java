import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float heat;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter temperature:");
        heat = input.nextFloat();

        if (heat < 5) {
            System.out.println("You can go skiing");
        } else if (heat >= 5 && heat <= 25) {
            if (heat >= 10 && heat < 15) {
                System.out.println("You can go to the cinema");
            } else if (heat >= 15 && heat < 25) {
                System.out.println("You can go for a picnic");
            } else {
                System.out.println("You can do some other activity suitable for this range");
            }
        } else if (heat > 25) {
            System.out.println("You can go swimming");
        }

        input.close();
    }
}
