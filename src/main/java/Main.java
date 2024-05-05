public class Main {
    public static void main(String[] args) {

        // Demostración de funcionalidades

        // Creamos un administrador

        Administrador administrador1 = new Administrador("Nicolás Olivero", "Administrador");

        // A continuación el administrador creará y agregará 5 libros a la biblioteca

        administrador1.crearAgregarLibro("El Principito", "Antoine de Saint-Exupéry", "Infantil", 10);
        administrador1.crearAgregarLibro("Harry Potter", "J.K. Rowling", "Infantil", 10);
        administrador1.crearAgregarLibro("El Señor de los Anillos", "J.R.R. Tolkien", "Infantil", 10);
        administrador1.crearAgregarLibro("El Alquimista", "Paulo Coelho", "Infantil", 10);
        administrador1.crearAgregarLibro("El Código da Vinci", "Dan Brown", "Infantil", 10);

        // Crearemos un usuario tipo estudiante

        Usuario estudiante1 = new Usuario("David Ibáñez", "Estudiante");

        // A continuación el estudiante agregará una reserva y un préstamo

        estudiante1.agregarPrestamo(Biblioteca.getLibros().get(0));
        estudiante1.realizarReserva(Biblioteca.getLibros().get(1));

        // A continuación comprobaremos el historial de reservas y préstamos del estudiante

        System.out.println("Los libros reservados por el estudiante 1 son: " + estudiante1.getLibrosReservados());
        System.out.println("El historial de préstamos del estudiante 1 es: " + estudiante1.getHistorialPrestamos());

        // A continuación el estudiante agregará una calificación y un comentario sobre su préstamo

        estudiante1.agregarCalificacion(10, Biblioteca.getLibros().get(0));
        estudiante1.agregarComentario("Excelente libro", Biblioteca.getLibros().get(0));

        // A continuación visualizaremos la calificación y el comentario

        System.out.println("Calificaciones de El Principito: " + Biblioteca.getLibros().get(0).getCalificaciones());
        System.out.println("Comentarios sobre El Principito: " + Biblioteca.getLibros().get(0).getComentarios());
    }
}
