import java.util.Scanner;
public class Main {

    public static void main(String[] args) {


        System.out.println("Witaj w klinice.\n\nWybierz jedną z opcji:\n1.Przeglądaj zwierzęta.\n2.Dodaj pacjenta.\n3.Wyjście.");
        Scanner in = new Scanner(System.in);
        int i=in.nextInt();
        while (i>3) {
            System.out.println("Wybierz jedną z opcji.");
            in.nextInt();
        }
            if (i==1){
                System.out.println("jeden");
            }
            if (i==2){
                System.out.println("dwa");
            }
            if (i==3){
                System.out.println("trzy");
            }
        }

    }


