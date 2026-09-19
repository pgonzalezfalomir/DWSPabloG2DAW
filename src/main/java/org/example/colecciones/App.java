package org.example.colecciones;

import org.example.colecciones.entidades.Book;
import org.example.colecciones.entidades.BookCollection;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main( String[] args ) {
        List<Book> libros = new ArrayList<>();

        libros.add(new Book("9788422616337", "El Señor de los Anillos", "J.R.R. Tolkien", 800));
        libros.add(new Book("9788445077528", "El Hobbit", "J.R.R. Tolkien", 350));
        libros.add(new Book("9788466316781", "Cabo Trafalgar", "Arturo Pérez Reverte", 320));
        libros.add(new Book("9788493975074", "El corazón de la piedra", "José María García López", 560));
        libros.add(new Book("9788493291488", "Salmos de vísperas", "Esteban Hernández Castelló", 95));
        libros.add(new Book("9788420685625", "La música en las catedrales españolas del Siglo de Oro", "Robert Stevenson", 600));
        libros.add(new Book("9788423913077", "Luces de bohemia", "Ramón del Valle-Inclán", 296));
        libros.add(new Book("9788448031121", "Contando atardeceres", "La vecina rubia", 528));
        libros.add(new Book("9781529342079", "The Master: The Brilliant Career of Roger Federer", "Christopher Clarey", 456));
        libros.add(new Book("9788408264385", "La teoría de los archipiélagos", "Alice Kellen", 300));
        libros.add(new Book("9788423362479", "Esperando al diluvio", "Dolores Redondo", 576));
        libros.add(new Book("9788466367349", "El italiano", "Arturo Pérez Reverte", 400));
        libros.add(new Book("9788466359290", "Línea de fuego", "Arturo Pérez Reverte", 688));

        int ejercicio1 = BookCollection.obtenerMas500Paginas((ArrayList<Book>) libros);
        System.out.println("EJERCICIO 1:");
        System.out.println("Cantidad de libros con más de 500 páginas: " + ejercicio1 + '\n');

        System.out.println("EJERCICIO 2:");
        int ejercicio2 = BookCollection.obtenerMenos300Paginas((ArrayList<Book>) libros);
        System.out.println("Cantidad de libros con menos de 300 páginas: " + ejercicio2 + '\n');

        System.out.println("EJERCICIO 3:");
        String ejercicio3= BookCollection.listarTituloConMas500Paginas((ArrayList<Book>) libros);
        System.out.println("Título de libros con más de 500 páginas: " +  ejercicio3 + '\n');

        System.out.println("EJERCICIO 4:");
        String ejercicio4 = BookCollection.obtenerTitulo3ConMasPaginas((ArrayList<Book>) libros);
        System.out.println("Título de los 3 libros con más páginas: " + ejercicio4 + '\n');

        System.out.println("EJERCICIO 5:");
        int ejercicio5 = BookCollection.sumaTotalPaginas((ArrayList<Book>) libros);
        System.out.println("Cantidad total de páginas: " + ejercicio5 + '\n');

        System.out.println("EJERCICIO 6:");
        String ejercicio6 = BookCollection.titulosLibrosSuperanPromedioPaginas((ArrayList<Book>) libros);
        System.out.println("Título de los libros que superan el promedio de páginas: " + ejercicio6 + '\n');

        System.out.println("EJERCICIO 7:");
        String ejercicio7 = BookCollection.obtenerAutoresSinRepetir((ArrayList<Book>) libros);
        System.out.println("Autores sin repetir: " + ejercicio7 + '\n');

        System.out.println("EJERCICIO 8:");
        String ejercicio8 = BookCollection.nombreAutoresConMasDe1Libro((ArrayList<Book>) libros);
        System.out.println("Nombre autores con más de 1 libro: " + ejercicio8 + '\n');

        System.out.println("EJERCICIO 9:");
        String ejercicio9 = BookCollection.libroConMasPaginas((ArrayList<Book>) libros);
        System.out.println("Libro con más páginas: " + ejercicio9 + '\n');

        System.out.println("EJERCICIO 10:");
        ArrayList<String> ejercicio10 = BookCollection.obtenerTodosLosTitulos((ArrayList<Book>) libros);
        System.out.println("Colección con todos los títulos: " + ejercicio10 + '\n');
    }
}