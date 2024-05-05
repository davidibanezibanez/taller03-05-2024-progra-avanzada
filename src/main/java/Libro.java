import java.util.ArrayList;
import java.util.List;

public class Libro {
    private String titulo;
    private String autor;
    private String categoria;
    private int ejemplaresDisponibles;
    private List<Integer> calificaciones;
    private List<String> comentarios;

    public Libro(String titulo, String autor, String categoria, int ejemplaresDisponibles) {
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
        this.ejemplaresDisponibles = ejemplaresDisponibles;
        this.calificaciones = new ArrayList<>();
        this.comentarios = new ArrayList<>();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public void setCategoria(String categoria){
        this.categoria = categoria;
    }

    public void setejemplaresDisponibles(int ejemplaresDisponibles){
        this.ejemplaresDisponibles = ejemplaresDisponibles;
    }

    public void setCalificaciones(List<Integer> calificaciones){
        this.calificaciones = calificaciones;
    }

    public void setComentarios(List<String> comentarios){
        this.comentarios = comentarios;
    }

    public void agregarCalificacion(int calificacion) {
        calificaciones.add(calificacion);
    }

    public void agregarComentario(String comentario) {
        comentarios.add(comentario);
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", categoria='" + categoria + '\'' +
                ", ejemplaresDisponibles=" + ejemplaresDisponibles +
                ", calificaciones=" + calificaciones +
                ", comentarios=" + comentarios +
                '}';
    }
}
