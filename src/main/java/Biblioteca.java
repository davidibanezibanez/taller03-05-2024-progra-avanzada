import java.util.ArrayList;

public class Biblioteca {
    private static ArrayList<Libro> libros = new ArrayList<>();

    public static ArrayList<Libro> getLibros() {
        return libros;
    }

    public static void agregarLibro(Libro libro) {
        libros.add(libro);
    }

}
