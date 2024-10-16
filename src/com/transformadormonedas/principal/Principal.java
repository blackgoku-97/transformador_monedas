package com.transformadormonedas.principal;

import com.transformadormonedas.api.ExchangeAPI;
import com.transformadormonedas.modelos.Moneda;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        boolean exit = false;
        ExchangeAPI exchangeAPI = new ExchangeAPI("372c8b2823e75be7fbf9c197");

        while (!exit) {
            System.out.println("Menú de Conversión de Monedas");
            System.out.println("1. Convertir USD a CLP");
            System.out.println("2. Convertir EUR a CLP");
            System.out.println("3. Convertir CLP a USD");
            System.out.println("4. Convertir CLP a EUR");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            int opcion = lectura.nextInt();

            try {
                switch (opcion) {
                    case 1:
                        System.out.print("Ingresa la cantidad de dolares: ");
                        double montoUSD = lectura.nextDouble();
                        double montoClpFromUsd = exchangeAPI.convertir(Moneda.USD, Moneda.CLP, montoUSD);
                        System.out.println(montoUSD + " dolar es igual a " + montoClpFromUsd + " Pesos Chilenos");
                        break;
                    case 2:
                        System.out.print("Ingresa la cantidad de euros: ");
                        double montoEUR = lectura.nextDouble();
                        double montoClpFromEur = exchangeAPI.convertir(Moneda.EUR, Moneda.CLP, montoEUR);
                        System.out.println(montoEUR + " euro es igual a " + montoClpFromEur + " Pesos Chilenoz");
                        break;
                    case 3:
                        System.out.print("Ingresa la cantidad de pesos chilenos: ");
                        double montoCLP = lectura.nextDouble();
                        double montoUsdFromClp = exchangeAPI.convertir(Moneda.USD, Moneda.CLP, montoCLP);
                        System.out.println(montoCLP + " pesos chilenos es igual a " + montoUsdFromClp + " dolares");
                        break;
                    case 4:
                        System.out.print("Ingresa la cantidad de pesos chilenos: ");
                        double montoCLP2 = lectura.nextDouble();
                        double montoClp2FromEur = exchangeAPI.convertir(Moneda.USD, Moneda.CLP, montoCLP2);
                        System.out.println(montoCLP2 + " pesos chilenos es igual a " + montoClp2FromEur + " euros");
                        break;
                    case 5:
                        exit = true;
                        System.out.println("Saliendo del programa...");
                        break;
                    default:
                        System.out.println("Opción no válida. Por favor, intenta de nuevo.");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        lectura.close();
    }
}
