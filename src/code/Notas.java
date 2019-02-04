package code;

public class Notas {

    private String texto;
    private String fecha;
    private String titulo;

    public Notas(String texto, String fecha, String titulo) {
        this.texto = texto;
        this.fecha = fecha;
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Nota{" + "texto=" + texto + ", fecha=" + fecha + ", titulo=" + titulo + '}';
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
}
