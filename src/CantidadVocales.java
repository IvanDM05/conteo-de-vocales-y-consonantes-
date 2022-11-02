import java.util.Scanner;

public class CantidadVocales{
    public static boolean esConsonante(char letra) {
        return "bcdfghjklmnñpqrstvwxyz".contains(String.valueOf(letra).toLowerCase());}

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese un texto");
        String cad = sc.nextLine();



        int cantidadVocales = 0;
        int letras =0;

        int conta = 0 ,conte = 0 , conti = 0 , conto = 0 , contu = 0; letras =0;
        for (int x = 0; x < cad.length(); x++) {
            char letra = cad.charAt(x);
            if( esConsonante(letra)) {
                letras++;
            }

        }
        for (int i = 0; i < cad.length(); i++) {

            if (cad.charAt(i) == 'a') {
                conta++;
            }
            if (cad.charAt(i) == 'e') {
                conte++;

            }
            if (cad.charAt(i) == 'i') {
                conti++;

            }
            if (cad.charAt(i) == 'o') {
                conto++;

            }
            if (cad.charAt(i) == 'u') {
                contu++;


            }

            cantidadVocales = ( conta + conte + conti + conto +contu );
        }

        System.out.println("la cantidad de vocales es " + cantidadVocales);
        System.out.println ( "la cantidad de a es " + conta);
        System.out.println("la cantidad de e es " + conte);
        System.out.println("la cantidad de i es " + conti);
        System.out.println("la cantidad de o es " + conto);
        System.out.println("la cantidad de u es " + contu);
        System.out.println("la cantidad de consonantes es "+ letras);

    }

}