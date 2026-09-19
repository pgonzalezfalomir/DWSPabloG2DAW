package org.example.colecciones.entidades;

public record Book(String isbn, String title, String author, int pages) implements Comparable<Book>{
    @Override
    public int compareTo(Book titulo2) {
        return this.title.compareToIgnoreCase(titulo2.title());
    }
}