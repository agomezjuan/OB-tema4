public class Main {

    public static void main(String[] args) {
	// write your code here
        Integer numeroIf = 3;
        Integer numeroWhile = 0;
        String estacion = "Lluvias";

        System.out.println("\nCondicional If-Else");
        if (numeroIf > 0) {
            System.out.println(numeroIf.toString() + " es mayor que 0");
        } else if (numeroIf < 0) {
            System.out.println(numeroIf.toString() + " es menor que 0");
        } else {
            System.out.println(numeroIf.toString() + " es igual a 0");
        }

        System.out.println("\nCiclo While");
        while (numeroWhile < 3) {
            System.out.println(numeroWhile);
            numeroWhile++;
        }

        System.out.println("\nCiclo Do-While");
        do {
            System.out.println(numeroWhile);
        } while (numeroWhile < 3);

        System.out.println("\nCiclo For");
        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println(numeroFor);
        }

        System.out.println("\nSwitch/Case");
        switch (estacion) {
            case "Primavera":
                System.out.println("Estamos en " + estacion + " y los arboles florecen.");
                break;
            case "Verano":
                System.out.println("Estamos en " + estacion + " y el sol brilla.");
                break;
            case "Otoño":
                System.out.println("Estamos en " + estacion + " y las hojas caen de los árboles.");
                break;
            case "Invierno":
                System.out.println("Estamos en " + estacion + " y la nieve cae en las montañas.");
                break;
            default:
                System.out.println("'" + estacion + "' no es una estación.");

        }
    }
}
