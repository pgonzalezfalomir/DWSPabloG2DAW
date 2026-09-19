package org.example.colecciones.entidades;
import java.util.ArrayList;
import java.util.List;

public class BookCollection {
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
    public static String obtenerTitulo3ConMasPaginas(ArrayList<Book> libros) {
        ArrayList<Book> copia = new ArrayList<>(libros);

        for (int i = 0; i < copia.size() - 1; i++) {
            for (int j = 0; j < copia.size() - 1 - i; j++) {
                if (copia.get(j).pages() < copia.get(j + 1).pages()) {
                    Book aux = copia.get(j);
                    copia.set(j, copia.get(j + 1));
                    copia.set(j + 1, aux);
                }
            }
        }

        ArrayList<String> titulos = new ArrayList<>();
        int limite = Math.min(3, copia.size());
        for (int i = 0; i < limite; i++) {
            titulos.add(copia.get(i).title());
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
    public static String obtenerAutoresSinRepetir(ArrayList<Book> libros) {
        ArrayList<String> autores = new ArrayList<>();
        for (int i = 0; i < libros.size(); i++) {
            String autor = libros.get(i).author();
            if (!autores.contains(autor)) {
                autores.add(autor);
            }
        }
        return autores.toString();
    }

    // 8. Obtener los autores que tengan más de 1 libro listado.
    public static String nombreAutoresConMasDe1Libro(ArrayList<Book> libros) {
        ArrayList<String> autoresRepetidos = new ArrayList<>();

        for (int i = 0; i < libros.size(); i++) {
            String autorActual = libros.get(i).author();
            int contador = 0;
            for (int j = 0; j < libros.size(); j++) {
                if (libros.get(j).author().equals(autorActual)) {
                    contador++;
                }
            }
            if (contador > 1 && !autoresRepetidos.contains(autorActual)) {
                autoresRepetidos.add(autorActual);
            }
        }
        return autoresRepetidos.toString();
    }

    // 9. Obtener el libro con mayor número de páginas.
    public static String libroConMasPaginas(ArrayList<Book> libros) {
        if (libros.isEmpty()) {
            return "";
        }

        Book libroMayor = libros.get(0);
        for (int i = 1; i < libros.size(); i++) {
            if (libros.get(i).pages() > libroMayor.pages()) {
                libroMayor = libros.get(i);
            }
        }
        return libroMayor.title();
    }

    // 10. Obtener una colección con todos los títulos de los libros.
    public static ArrayList<String> obtenerTodosLosTitulos(ArrayList<Book> libros) {
        ArrayList<String> titulos = new ArrayList<>();
        for (int i = 0; i < libros.size(); i++) {
            titulos.add(libros.get(i).title());
        }
        return titulos;
    }
}