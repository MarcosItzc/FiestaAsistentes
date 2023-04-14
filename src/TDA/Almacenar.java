package TDA;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Almacenar {

    private ArrayList<Asistente> lista;

    public Almacenar() {
        lista = new <Asistente>ArrayList();
    }

    public void añadir(Asistente p) {
        lista.add(p);
    }

    public void eliminar(int pos) {
        lista.remove(pos);
    }
    
    public void borrarTodo(){
        lista.removeAll(lista);
    }

    public void mostrarAlum(int pos) {
        JOptionPane.showMessageDialog(null, lista.get(pos));
    }
    
    public int tamaño(){
        return lista.size();
    }

    public void mostrarTodo() {
        String cad = "";
        for (int i = 0; i <= lista.size() - 1; i++) {
            cad += "" + lista.get(i);
        }
        JOptionPane.showMessageDialog(null, cad);
    }

    public int totalAsi() {
        return lista.size();
    }

    public int tAsiMayores() {
        int contador = 0;
        for (int i = 0; i <= lista.size() - 1; i++) {
            if (lista.get(i).getEdad() >= 18) {
                contador++;
            }
        }
        return contador;
    }

    public int tAsiMenores() {
        int contador = 0;
        for (int i = 0; i <= lista.size() - 1; i++) {
            if (lista.get(i).getEdad() <= 17) {
                contador++;
            }
        }
        return contador;
    }

    public int tAsiHombres() {
        int contador = 0;
        for (int i = 0; i <= lista.size() - 1; i++) {
            if (lista.get(i).getSexo() == 'H') {
                contador++;
            }
        }
        return contador;
    }

    public int tAsiMujeres() {
        int contador = 0;
        for (int i = 0; i <= lista.size() - 1; i++) {
            if (lista.get(i).getSexo() == 'M') {
                contador++;
            }
        }
        return contador;
    }

    public int tAsiSolteros() {
        int contador = 0;
        for (int i = 0; i <= lista.size() - 1; i++) {
            if (lista.get(i).getEstadoC().equalsIgnoreCase("Soltero")) {
                contador++;
            }
        }
        return contador;
    }

    public int tAsiCasados() {
        int contador = 0;
        for (int i = 0; i <= lista.size() - 1; i++) {
            if (lista.get(i).getEstadoC().equalsIgnoreCase("Casado")) {
                contador++;
            }
        }
        return contador;
    }

    public int tAsiViudos() {
        int contador = 0;
        for (int i = 0; i <= lista.size() - 1; i++) {
            if (lista.get(i).getEstadoC().equalsIgnoreCase("Viudo")) {
                contador++;
            }
        }
        return contador;
    }

    public int tAsiDivorciados() {
        int contador = 0;
        for (int i = 0; i <= lista.size() - 1; i++) {
            if (lista.get(i).getEstadoC().equalsIgnoreCase("Divorciado")) {
                contador++;
            }
        }
        return contador;
    }

public float porH() {
        return ((tAsiHombres() / (float) totalAsi()) * 100);
    }

    public float porM() {
        return ((tAsiMujeres() / (float) totalAsi()) * 100);
    }
}