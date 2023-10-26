package utilities;

public class MiColeccion<T> {
    private static final int CAP_INIC=10;

    private T datos[] = null;
    private int len = 0;

    @SuppressWarnings("unchecked")
    public MiColeccion() {
        datos = (T[]) new Object[CAP_INIC];
    }

    public T obtener(int i) {
        return datos[i];
    }

    public int cantidad() {
        return len;
    }

    @SuppressWarnings("unchecked")
    public void verificarYAgrandar() {
        if (len==datos.length) {
            T nuevo[] = (T[]) new Object[datos.length*2];

            for (int i = 0; i < datos.length; i++) {
                nuevo[i]=datos[i];
            }

            datos = nuevo;
            nuevo = null;
        }
    }

    public void insertar(T elm, int i) {
        verificarYAgrandar();
        for (int j = len-1; j >= i; j--) {
            datos[j+1] = datos[j];
        }

        datos[i] = elm;
        len++;
    }

    public int buscar(T elm) {
        int i=0;

        while (i<len && !datos[i].equals(elm)) {
            i++;
        }

        return i<len ? i : -1;
    }

    public void agregar(T elm) {
        insertar(elm, len);
    }

    public T eliminar(int i) {
        T aux = datos[i];
        for (int j = i; j < len-1; j++) {
            datos[j] = datos[j+1];
        }
        len--;
        return aux;
    }
}
