import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nombre;
    private String correo;
    private String tipo; // Estudiante, Profesor, Personal de la Biblioteca
    private List<Libro> historialPrestamos;
    private List<Libro> librosReservados;

    public Usuario(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.historialPrestamos = new ArrayList<>();
        this.librosReservados = new ArrayList<>();
    }

    public void agregarPrestamo(Libro libro) {
        historialPrestamos.add(libro);
        System.out.println("Préstamo agregado correctamente");
    }

    public void realizarReserva(Libro libro) {
        librosReservados.add(libro);
        System.out.println("Reserva agregada correctamente");
    }

    public void agregarCalificacion(int calificacion, Libro libro) {
        libro.agregarCalificacion(calificacion);
    }

    public void agregarComentario(String comentario, Libro libro) {
        libro.agregarComentario(comentario);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", correo='" + correo + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }

    public List<Libro> getHistorialPrestamos() {
        return historialPrestamos;
    }

    public List<Libro> getLibrosReservados() {
        return librosReservados;
    }
}
