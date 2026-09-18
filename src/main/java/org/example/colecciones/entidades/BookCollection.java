package org.example.colecciones.entidades;
import java.util.ArrayList;
import java.util.List;

public class BookCollection {
    // ¿Qué tipo de colección es la más adecuada para almacenar los libros?

    // Crea los métodos solicitados en el enunciado del ejercicio

    // 1. Obtener la cantidad de libros con más de 500 páginas.
    public static int obtenerMas500Paginas (ArrayList<Book> libros) {
        int contador = 0;
        for (int i = 0; i < libros.size(); i++) {
            if (libros.get(i).pages() > 500) {
                contador++;
            }
        }
        return contador;
    }

    // 2. Obtener la cantidad de libros con menos de 300 páginas.
    public static int obtenerMenos300Paginas (ArrayList<Book> libros) {
        int contador = 0;
        for (int i = 0; i < libros.size(); i++) {
            if (libros.get(i).pages() < 300) {
                contador++;
            }
        }
        return contador;
    }

    // 3. Listar el título de todos aquellos libros con más de 500 páginas.
    public static String listarTituloConMas500Paginas (ArrayList<Book> libros) {
        ArrayList<String> titulos = new ArrayList<>();
        for (int i = 0; i < libros.size(); i++) {
            if (libros.get(i).pages() > 500) {
                titulos.add(libros.get(i).title());
            }
        }
        return titulos.toString();
    }

    // 4. Obtener el título de los 3 libros con mayor número de páginas.
    public static String obtenerTitulo3ConMasPaginas (ArrayList<Book> libros) {
        ArrayList<String> titulos = new ArrayList<>();
        int contador = 0;
        for (int i = 0; i < libros.size(); i++) {
            if (libros.get(i).pages() > libros.get(i+1).pages()) {
                titulos.add(libros.get(i).title());
            }
        }
        return titulos.toString();
    }

    // 5. Obtener la suma total de las páginas de todos los libros.
    public static int sumaTotalPaginas (ArrayList<Book> libros) {
        int total = 0;
        for (int i = 0; i < libros.size(); i++) {
            total = total + libros.get(i).pages();
        }
        return total;
    }

    // 6. Obtener todos aquellos libros que superen el promedio en cuanto a número de páginas se refiere.
    public static String titulosLibrosSuperanPromedioPaginas (ArrayList<Book> libros) {
        ArrayList<String> titulos = new ArrayList<>();
        int promedioPaginas = sumaTotalPaginas(libros) / libros.size();
        for (int i = 0; i < libros.size(); i++) {
            if (libros.get(i).pages() > promedioPaginas) {
                titulos.add(libros.get(i).title());
            }
        }
        return titulos.toString();
    }

    // 7. Obtener los autores de todos los libros, sin repetir nombres de autores.
    //public static

    // 8. Obtener los autores que tengan más de 1 libro listado.
    public static String nombreAutoresConMasDe1Libro (ArrayList<Book> libros) {
        ArrayList<String> nombres = new ArrayList<>();
        int contador = 0;
        for (int i = 0; i < libros.size(); i++) {

        }
        return nombres.toString();
    }

    // 9. Obtener el libro con mayor número de páginas.
    public static String libroConMasPaginas (ArrayList<Book> libros) {
        String titulo = "";
        for (int i = 0; i < libros.size(); i++) {

        }
        return titulo;
    }

    // 10. Obtener una colección con todos los títulos de los libros.
}