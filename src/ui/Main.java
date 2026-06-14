package ui;

import data.GestorDatos;
import model.Tour;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        GestorDatos gestor = new GestorDatos();

        ArrayList<Tour> tours = gestor.cargarTours("resources/tours.txt");

        System.out.println("LISTADO COMPLETO DE TOURS");
        System.out.println("--------------------------");

        for (Tour tour : tours) {
            System.out.println(tour);
        }

        System.out.println();
        System.out.println("TOURS FILTRADOS POR TIPO GASTRONÓMICO");
        System.out.println("-------------------------------------");

        for (Tour tour : tours) {
            if (tour.getTipo().equalsIgnoreCase("gastronómico")) {
                System.out.println(tour);
            }
        }

        System.out.println();
        System.out.println("TOURS CON PRECIO MAYOR A $30.000");
        System.out.println("--------------------------------");

        for (Tour tour : tours) {
            if (tour.getPrecio() > 30000) {
                System.out.println(tour);
            }
        }
    }
}