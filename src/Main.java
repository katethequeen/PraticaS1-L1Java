import java.util.Arrays;
import java.util.Scanner;

public class Main {

//    #1
    public static int moltiplicazione(int x, int y) {
        return x * y;
    }

    public static String concatenazione(String stringa, int intero) {
        return stringa + " " + intero;
    }

    public static String[] creazioneArray(String[] elementi, String parola) {
        String[] nuovoArray = new String[elementi.length + 1];

        for (int i = 0; i < 2; i++) {
            nuovoArray[i] = elementi[i];
        }
        nuovoArray[2] = parola;
        for (int i = 2; i < elementi.length; i++) {
            nuovoArray[i + 1] = elementi[i];
        }
        return nuovoArray;
    }

    //#2
    public static String concatTanteStringhe(String primaStringa, String secondaStringa, String terzaStringa) {
        return primaStringa + " " + secondaStringa + " " + terzaStringa;
    }

    //#3
    public static  double perimetro(double a, double b) {
        return (a+b) * 2;
    }

    public static String pariODispari(int num) {
        if(num % 2 == 0) {
            return "è pari";
        } else {
            return "è dispari";
        }
    }

    public static double areaTriangolo(double c, double f) {
        return (c*f) / 2;
    }

    public static void main(String[] args) {

        //esercizio n°1
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci un numero intero");
        int x = scanner.nextInt();
        System.out.println("Inserisci un altro numero intero");
        int y = scanner.nextInt();
        int risultato = moltiplicazione(x, y);

        System.out.println("Il risultato della moltiplicazione tra i due numeri è: " + risultato);
        scanner.nextLine();

        //esercizio n°2
        System.out.println("Inserisci una stringa");
        String stringa = scanner.nextLine();
        System.out.println("Inserisci un numero intero");
        int intero = scanner.nextInt();

        String concat = concatenazione(stringa, intero);

        System.out.println("Concatenazione tra i due elementi " + concat);
        scanner.nextLine();

        //esercizio n°3
        String[] elementi = {"uno", "due", "tre", "quattro", "cinque"};

        System.out.println("Inserisci una stringa");
        String parola = scanner.nextLine();
        String[] nuovoArray = creazioneArray(elementi, parola);
        System.out.println("Il nuovo array comprende: " + Arrays.toString(nuovoArray));
        scanner.nextLine();

        //esercizio n°4
        System.out.println("Inserisci la prima stringa");
        String primaStringa = scanner.nextLine();
        System.out.println("Inserisci la seconda stringa");
        String secondaStringa = scanner.nextLine();
        System.out.println("Inserisci la terza stringa");
        String terzaStringa = scanner.nextLine();

        String concatenazione = concatTanteStringhe(primaStringa, secondaStringa, terzaStringa);
        System.out.println("La tua concatenazione è: " + concatenazione);
        System.out.println("La tua concatenazione inversa è: " + terzaStringa + " " + secondaStringa + " " + primaStringa);

        scanner.nextLine();
        //esercizio n°5 (Perimetro)
        System.out.println("Inserisci il primo lato");
        double a = scanner.nextInt();
        System.out.println("Inserisci il secondo lato");
        double b = scanner.nextInt();

        double perimeter = perimetro(a, b);
        System.out.println("Il perimetro del tuo rettangolo è: " + perimeter);

        scanner.nextLine();

        //esercizio n6 (Pari)
        System.out.println("Inserisci un numero e ti dirò se è pari o dispari");
        int num = scanner.nextInt();
        String pariDis = pariODispari(num);
        System.out.println("il numero è: " + pariDis);

        scanner.nextLine();

        //esercizio n7 (area)
        System.out.println("Inserisci la base");
        double c = scanner.nextInt();
        System.out.println("Inserisci l altezza");
        double f = scanner.nextInt();

        double risArea = areaTriangolo(c, f);
        System.out.println("L'area del triangolo è: " + risArea);

        scanner.close();


    }
}