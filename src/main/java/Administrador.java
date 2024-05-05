import java.util.ArrayList;
import java.util.List;

public class Administrador extends Usuario{

    public Administrador(String nombre, String tipo) {
        super(nombre, tipo);
    }

    public void crearAgregarLibro(String titulo, String autor, String categoria, int ejemplaresDisponibles){
        Libro nuevoLibro = new Libro(titulo, autor, categoria, ejemplaresDisponibles);
        Biblioteca.agregarLibro(nuevoLibro);
        System.out.println("Libro agregado exitosamente");
    }
    
    public void eliminarLibro(String titulo) {
        ArrayList<Libro> libros = Biblioteca.getLibros();
        for (int i = 0; i < libros.size(); i++) {
            if (libros.get(i).getTitulo().equals(titulo)) {
                libros.remove(i);
                return; 
            }
        }
        System.out.println("El libro '" + titulo + "' no fue encontrado en la biblioteca.");
    }
    
    public void modificarLibro(String titulo, String nuevoTitulo, String nuevoAutor, String nuevoCategoria, int nuevoejemplaresDisponibles, List<Integer> nuevocalificaciones, List<String> nuevocomentarios) {
        ArrayList<Libro> libros = Biblioteca.getLibros();
        for (Libro libro : libros) {
            if (libro.getTitulo().equals(titulo)) {
                libro.setTitulo(nuevoTitulo);
                libro.setAutor(nuevoAutor);
                libro.setCategoria(nuevoCategoria);
                libro.setejemplaresDisponibles(nuevoejemplaresDisponibles);
                libro.setCalificaciones(nuevocalificaciones);
                libro.setComentarios(nuevocomentarios);
                System.out.println("El libro '" + titulo + "' ha sido modificado.");
                return;
            }
        }
        System.out.println("El libro '" + titulo + "' no fue encontrado en la biblioteca.");
    }
    public void modificarNombreUsuario(Usuario usuario, String nombreNuevo){
        usuario.setNombre(nombreNuevo);
        System.out.println("Nombre de usuario modificado de manera exitosa");
    }
    public void modificarCorreoUsuario(Usuario usuario, String correoNuevo){
        usuario.setCorreo(correoNuevo);
        System.out.println("Correo de usuario modificado de manera exitosa");
    }
}
