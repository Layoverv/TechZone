import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        int[] edades = {25, 30}; 
        int[] estadosCiviles = {1, 2};  
        int[] estaturas = {175, 160};  
        int[] sexos = {1, 2};  

        int edad = 0, estadoCivil = 0, estatura = 0, sexo = 0;
        double promedioEdad = 0, promedioEstatura = 0, porcentajePersonas = 0;
        int contadorPersonas = 0, acumuladorEdad = 0, acumuladorEstatura = 0;
        int cantidadPersonas = 2;

        for (int numeroPersona = 1; numeroPersona <= cantidadPersonas; numeroPersona++) {
            
            System.out.println("Usando datos predeterminados para la persona " + numeroPersona);
            
            edad = edades[numeroPersona - 1];
            
            estadoCivil = estadosCiviles[numeroPersona - 1];
            
            estatura = estaturas[numeroPersona - 1];
            
            sexo = sexos[numeroPersona - 1];

            System.out.println("Edad: " + edad);
            System.out.println("Estado Civil: " + (estadoCivil == 1 ? "Soltero" : "Casado"));
            System.out.println("Estatura: " + estatura + " cm");
            System.out.println("Sexo: " + (sexo == 1 ? "Hombre" : "Mujer"));

            if (edad > 18 && estadoCivil == 1 && estatura > 170 && sexo == 1) {
                contadorPersonas++;
                acumuladorEdad += edad;
                acumuladorEstatura += estatura;
            }
        }

        if (contadorPersonas > 0) {
            
            promedioEdad = (double) acumuladorEdad / contadorPersonas;
            
            promedioEstatura = (double) acumuladorEstatura / contadorPersonas;
            
            porcentajePersonas = (double) contadorPersonas / cantidadPersonas * 100;

            System.out.println("El promedio de edad de las personas que cumplen es: " + promedioEdad + " años");
            System.out.println("El promedio de estatura de las personas que cumplen es: " + promedioEstatura + " centímetros");
            System.out.println("El porcentaje de las personas que cumplen con la condición es del: " + porcentajePersonas + " %");
        } else {
            System.out.println("Ninguna persona cumple con las condiciones.");
        }

        scanner.close();
    }
}
