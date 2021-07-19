package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("¿Que desea obtener?\n1) Perímetro\n2) Área");
        int seleccionDeOperacion = sc.nextInt();
        if (seleccionDeOperacion == 1){
            System.out.println("¿Que figura desea usar?\n1) Cuadrado\n2) Círculo\n3) Triángulo");
            int seleccionDeFigura = sc.nextInt();
            if (seleccionDeFigura == 1){
                System.out.println("Inserte la longitud de los lados en centimetros\n");
                int longitud = sc.nextInt();
                Square square = new Square(longitud);
                System.out.println("El perimetro es " +square.perimeter());
            } else if (seleccionDeFigura == 2){
                System.out.println("Inserte el radio en centimetros\n");
                int radio = sc.nextInt();
                Circle circle = new Circle(radio);
                System.out.println("El perimetro es " +circle.perimeter());

            } else if (seleccionDeFigura == 3){
                System.out.println("Inserte la longitud de los lados en centimetros\n");
                int longitud = sc.nextInt();
                Triangle triangle = new Triangle(longitud);
                System.out.println("El perimetro es " + triangle.perimeter());

            } else {
                System.out.println("Error\n La opcion que seleccionó no es valida");
            }
        } else if (seleccionDeOperacion == 2){
            System.out.println("¿Que figura desea usar?\n1) Cuadrado\n2) Círculo\n3) Triángulo");
            int seleccionDeFigura = sc.nextInt();
            if (seleccionDeFigura == 1){
                System.out.println("Inserte la longitud de los lados en centimetros\n");
                int longitud = sc.nextInt();
                Square square = new Square(longitud);
                System.out.println(square.area());
            } else if (seleccionDeFigura == 2){
                System.out.println("Inserte el radio en centimetros\n");
                int radio = sc.nextInt();
                Circle circle = new Circle(radio);
                System.out.println(circle.area());
            } else if (seleccionDeFigura == 3){
                System.out.println("Inserte la longitud de los lados en centimetros\n");
                int longitud = sc.nextInt();
                Triangle triangle = new Triangle(longitud);
                System.out.println(triangle.area());
            } else {
                System.out.println("Error\n La opcion que seleccionó no es valida");
            }
        } else {
            System.out.println("Error\n La opcion que seleccionó no es valida");
        }


    }

}