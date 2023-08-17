package com.mycompany.senati;
//Importar Scanner
import java.util.Scanner;
//Crear la clase publica Calculadora
public class Calculadora {
    //Crear el Metodo Main para recibir los Argumentos
    public static void main(String[] args) {
        //Inicializar Scanner
        Scanner sc = new Scanner(System.in);
        //Variables para los Numeros Ingresados
        float N1;
        float N2;
        //Mostrar e Ingresar los Datos desde la Consola
        System.out.println("Primer Numero: ");
        N1 = sc.nextInt();
        
        System.out.println("Segundo Numero: ");
        N2 = sc.nextInt();
        //Variables para las Operaciones
        float suma = N1 + N2;
        float resta = N1 - N2;
        float division = N1 / N2;
        float multiplicacion = N1 * N2;
        //Imprimir las Repuestas
        System.out.println("La suma es: "+suma+
               "\nLa resta es: "+resta+
               "\nLa Division es: "+division+
               "\nLa Multiplicacion es: "+multiplicacion);
    }
}