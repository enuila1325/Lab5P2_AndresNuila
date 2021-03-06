package lab5p2_andrésnuila;

import java.util.ArrayList;

public class Escuadron {

    private String nombre, base, tipo;
    private ArrayList<Personaje> miembros = new ArrayList();
    private Personaje lider;

    public Escuadron() {
    }

    public Escuadron(String nombre, String base, String tipo) {
        this.nombre = nombre;
        this.base = base;
        this.tipo = tipo;
    }

    public Escuadron(String nombre, String base, Personaje lider, String tipo) {
        this.nombre = nombre;
        this.base = base;
        this.lider = lider;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public Personaje getLider() {
        return lider;
    }

    public void setLider(Personaje lider) {
        this.lider = lider;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public ArrayList<Personaje> getMiembros() {
        return miembros;
    }

    public void setMiembros(ArrayList<Personaje> miembros) {
        this.miembros = miembros;
    }

    @Override
    public String toString() {
        return "nombre=" + nombre + ", base=" + base;
    }

}
