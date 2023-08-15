import java.util.Scanner;

public class MenuConcierto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ConciertoTaylor concierto = new ConciertoTaylor();
        
        while (true) {
            System.out.println("----- Menú del Concierto -----");
            System.out.println("1. Solicitar boleto");
            System.out.println("2. Salir del programa");
            System.out.print("Ingrese la opción deseada: ");
            
            //referencias https://www.w3schools.com/java/java_try_catch.asp
            int opcion;
            try {
                opcion = scanner.nextInt();
            } catch (java.util.InputMismatchException e) {
                System.out.println("Entrada no válida. Por favor, ingrese un número.");
                scanner.nextLine(); 
                continue;
            }
            //
            switch (opcion) {
                case 1:
                    concierto.solicitarBoletos();
                    break;
                case 2:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elija una opción válida.");
            }
        }
    }
}