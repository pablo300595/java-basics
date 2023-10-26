package student;

public class Alumno implements Comparable<Alumno>{
    private String nombre;
    private int edad;
    private double notaPromedio;

    public Alumno(String nombre, int edad, double notaPromedio) {
        setNombre(nombre);
        setEdad(edad);
        setNotaPromedio(notaPromedio);
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getNotaPromedio() {
        return notaPromedio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNotaPromedio(double notaPromedio) {
        this.notaPromedio = notaPromedio;
    }

    @Override
    public int compareTo(Alumno otroAlumno) {
        return getEdad() - otroAlumno.getEdad();
    }

    @Override
    public String toString() {
        return getNombre() + ", " + getEdad() +  ", " + getNotaPromedio();
    }
}
