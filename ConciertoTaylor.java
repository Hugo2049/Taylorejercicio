import java.util.Scanner;
import java.util.Random;

public class ConciertoTaylor {
    public void solicitarBoletos() {
        Scanner scanner = new Scanner(System.in);
        
        int totalBoletosDisponibles = 60;
        int boletosVendidos = 0;
        // recibe los datos del "usuario" comprador
        while (boletosVendidos < totalBoletosDisponibles) {
            System.out.print("Ingrese su nombre: ");
            String nombre = scanner.nextLine();
            
            System.out.print("Ingrese su correo: ");
            String correo = scanner.nextLine();
            
            System.out.print("Ingrese la cantidad de boletos a comprar: ");
            long boletosAComprar = scanner.nextLong();
            scanner.nextLine(); 
            
            System.out.print("Ingrese su presupuesto: ");
            long presupuesto = scanner.nextLong();
            scanner.nextLine();
            
            // Genera el  número de boleto
            Random rand = new Random();
            int ticket = rand.nextInt(15000) + 1;
            
            // Generar números aleatorios a y b
            int a = rand.nextInt(15000) + 1;
            int b = rand.nextInt(15000) + 1;
            
            // Verificar si el ticket es apto para comprar boletos
            boolean esApto = ticket >= Math.min(a, b) && ticket <= Math.max(a, b);
            
            if (esApto) {
                // Selecciona localidad al azar
                int localidad = rand.nextInt(3); // 0: Localidad 1, 1: Localidad 5, 2: Localidad 10
                
                // Validar espacio, disponibilidad y precio
                int precioBoleto = 0;
                
                if (localidad == 0) {
                    precioBoleto = 100;
                    if (boletosVendidos < 20 && boletosAComprar <= 20 - boletosVendidos) {
                        if (precioBoleto * boletosAComprar <= presupuesto) {
                            // Vender los boletos
                            boletosVendidos += boletosAComprar;
                            System.out.println("Venta realizada a " + nombre + " para " + boletosAComprar + " boleto(s) en la localidad 1");
                        } else {
                            System.out.println("No se puede comprar boletos debido al presupuesto insuficiente.");
                        }
                    } else {
                        System.out.println("No se puede comprar boletos debido a la falta de espacio en la localidad.");
                    }
                } else if (localidad == 1) {
                    precioBoleto = 500;
                    if (boletosVendidos < 20 && boletosAComprar <= 20 - boletosVendidos) {
                        if (precioBoleto * boletosAComprar <= presupuesto) {
                            // Vende los boletos
                            boletosVendidos += boletosAComprar;
                            System.out.println("Venta realizada a " + nombre + " para " + boletosAComprar + " boleto(s) en la localidad 5");
                        } else {
                            System.out.println("No se puede comprar boletos debido al presupuesto insuficiente.");
                        }
                    } else {
                        System.out.println("No se puede comprar boletos debido a la falta de espacio en la localidad.");
                    }
                } else if (localidad == 2) {
                    precioBoleto = 1000;
                    if (boletosVendidos < 20 && boletosAComprar <= 20 - boletosVendidos) {
                        if (precioBoleto * boletosAComprar <= presupuesto) {
                            // Vender boletos
                            boletosVendidos += boletosAComprar;
                            System.out.println("Venta realizada a " + nombre + " para " + boletosAComprar + " boleto(s) en la localidad 10");
                        } else {
                            System.out.println("No se puede comprar boletos debido al presupuesto insuficiente.");
                        }
                    } else {
                        System.out.println("No se puede comprar boletos debido a la falta de espacio en la localidad.");
                    }
                }
            } else {
                System.out.println("El ticket no es apto para comprar boletos.");
            }
            
            
        }
        
        scanner.close();
    }
}