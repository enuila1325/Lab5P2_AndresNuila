package lab5p2_andrésnuila;

public class Personaje {

    private String nombre, poder, debilidad, escuadron;
    private int fuerza, agiFisica, agiMental;

    public Personaje() {
    }

    public Personaje(String nombre, String poder, String debilidad, String escuadron, int fuerza, int agiFisica, int agiMental) {
        this.nombre = nombre;
        this.poder = poder;
        this.debilidad = debilidad;
        this.escuadron = escuadron;
        this.fuerza = fuerza;
        this.agiFisica = agiFisica;
        this.agiMental = agiMental;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPoder() {
        return poder;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }

    public String getDebilidad() {
        return debilidad;
    }

    public void setDebilidad(String debilidad) {
        this.debilidad = debilidad;
    }

    public String getEscuadron() {
        return escuadron;
    }

    public void setEscuadron(String escuadron) {
        this.escuadron = escuadron;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getAgiFisica() {
        return agiFisica;
    }

    public void setAgiFisica(int agiFisica) {
        this.agiFisica = agiFisica;
    }

    public int getAgiMental() {
        return agiMental;
    }

    public void setAgiMental(int agiMental) {
        this.agiMental = agiMental;
    }

    @Override
    public String toString() {
        return "nombre=" + nombre + ", poder=" + poder;
    }

}
