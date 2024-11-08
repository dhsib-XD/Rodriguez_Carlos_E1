/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication42;

import java.util.Scanner;

/**
 *
 * @author CarlosXl
 */
public class Rodriguez_Carlos_Examen1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
          Scanner scanner = new Scanner(System.in);
        int eleccion;
        
        // Bucle para el menú de opciones
        while (true) {
            System.out.println("Favor seleccionar una opcion\n"
                    + "1. Piramides\n"
                    + "2. El mayor\n"
                    + "3. HD o Normal\n"
                    + "4. Caracteres vocales\n"
                    + "5. Salir");
            System.out.print("Favor ingrese una opcion: ");
            eleccion = scanner.nextInt();
            
            if (eleccion == 5) {
                System.out.println("¡HASTA LUEGO!");
                break; // Terminar Programa
            }
            
            switch (eleccion) {
                case 1: {
                    // Opción 1: Pirámide
                    System.out.print("Cantidad de filas de la piramide: ");
                    int filas = scanner.nextInt();
                    
                    int impar = 1; // 
                    
                    for (int i = 1; i <= filas; i++) {
                        int sumaFila = 0; // Suma de los números de la fila actual
                        
                        // Generar la fila con 'i' números impares
                        for (int j = 0; j < i; j++) {
                            System.out.print(impar + " ");
                            sumaFila += impar;
                            impar += 2; // Pasar al siguiente número impar
                        }
                        
                        System.out.println("= " + sumaFila); // Imprimir la suma de la fila
                    }
                    break; // Fin de la opción 1
                }

                case 2: {
                    // Opción 2: Encontrar el mayor número y calcular el promedio
                    int contador = 0;
                    int suma = 0;
                    int max = Integer.MIN_VALUE;
                    int numero;
                    
                    while (true) {
                        System.out.println("Para terminar el programa ingrese un número negativo.");
                        System.out.print("Favor ingrese su número: ");
                        
                        numero = scanner.nextInt();
                        
                        if (numero < 0) {
                            break; // Salir si el número es negativo
                        }

                        suma += numero;
                        contador++;

                        if (numero > max) {
                            max = numero;
                        }
                    }

                    // Calcular  el promedio y el número mayor
                    if (contador > 0) {
                        double promedio = (double) suma / contador;
                        System.out.println("El número mayor ingresado es: " + max);
                        System.out.println("El promedio de los números ingresados es: " + promedio);
                    } else {
                        System.out.println("No se ingresaron números positivos.");
                    }
                    break; // Fin de la opción 2
                }

                case 3: {
                    // Opción 3: Normal o Canal HD
                    scanner.nextLine(); // Limpiar el buffer
                    System.out.println("Ingrese el nombre del cliente:");
                    String Cliente = scanner.nextLine();

                    int canalesNormales = 0;
                    int canalesHD = 0;
                    int costoPorCanalNormal = 20;
                    int costoPorCanalHD = 30; // 20 lps + 10 lps adicionales para HD
                    int costoCajaDigital = 0;

                    // Ingreso de canales
                    while (true) {
                        System.out.println("Ingrese el tipo de canal (HD o NORMAL):");
                        String Canal = scanner.next().toUpperCase();

                        if (Canal.equals("HD")) {
                            canalesHD++;
                        } else if (Canal.equals("NORMAL")) {
                            canalesNormales++;
                        } else {
                            System.out.println("Tipo de canal inválido. Por favor, ingrese 'HD' o 'NORMAL'.");
                            continue; // Repetir en caso de entrada no válida
                        }

                        System.out.println("¿Desea ingresar otro canal? (SI o NO):");
                        String respuesta = scanner.next().toUpperCase();
                        if (!respuesta.equals("SI")) {
                            break;
                        }
                    }

                    // Ingreso del tipo de caja 
                    System.out.println("Ingrese el tipo de Caja Digital (LIGHTBOX, HDBOX, DVRBOX):");
                    String Caja = scanner.next().toUpperCase();

                    if (Caja.equals("LIGHTBOX")) {
                        costoCajaDigital = 50;
                    } else if (Caja.equals("HDBOX")) {
                        costoCajaDigital = 100;
                    } else if (Caja.equals("DVRBOX")) {
                        costoCajaDigital = 150;
                    } else {
                        System.out.println("Tipo de caja inválido. Se asignará el costo mínimo de la caja LIGHTBOX.");
                        costoCajaDigital = 50;
                    }

                    //  subtotal
                    int subtotal = (canalesNormales * costoPorCanalNormal) + (canalesHD * costoPorCanalHD) + costoCajaDigital;

                    //  impuesto 
                    double impuesto = subtotal * 0.15;

                    //  total a pagar
                    double totalAPagar = subtotal + impuesto;

                    //  detalles
                    System.out.println("\n--- Detalle de Cobro ---");
                    System.out.println("Cliente: " + Cliente);
                    System.out.println("Canales NORMALES agregados: " + canalesNormales);
                    System.out.println("Canales HD agregados: " + canalesHD);
                    System.out.println("Tipo de Caja Digital: " + Caja);
                    System.out.println("Subtotal: " + subtotal + " Lps");
                    System.out.println("Impuesto (15%): " + impuesto + " Lps");
                    System.out.println("Total a Pagar: " + totalAPagar + " Lps");
                    break; // Fin de la opción 3
                }

                case 4: {
                    // Opción 4: Contar vocales en una cadena
                    scanner.nextLine(); // Limpiar el buffer
                    System.out.print("Favor ingrese un texto: ");
                    String texto = scanner.nextLine();

                    int vocales = 0;

                    // Contar vocales en el texto ingresado
                    for (int i = 0; i < texto.length(); i++) {
                        char caracter = texto.charAt(i);

                        // Comparar el caracter actual con las vocales
                        if (caracter == 'a' && caracter == 'e' && caracter == 'i' && caracter == 'o' && caracter == 'u') {
                            vocales++;
                        }
                    }

                    System.out.println("La cantidad de vocales en la cadena es: " + vocales);
                    break; // Fin de la opción 4
                }

                default: {
                    System.out.println("Opción inválida. Por favor, ingrese una opción válida.");
                    break;
                }
            }
        }

        scanner.close(); 
    }
}