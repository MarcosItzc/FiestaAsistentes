package TDA;

public class Asistente{

    private byte edad;
    private char sexo;
    private String nombre, estCiv;
    
    public Asistente(String nombre, char sexo, byte edad, String estCiv){
        this.edad = edad;
        this.sexo = sexo;
        this.estCiv = estCiv;
        this.nombre = nombre;
    }
    
    public Asistente(){
        
    }
    
    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstadoC() {
        return estCiv;
    }

    public void setEstadoC(String estCiv) {
        this.estCiv = estCiv;
    }
    
    @Override
    public String toString() {
        return "Nombre: " + nombre + "\nSexo: " + sexo + "\nEdad: " + edad + "\nEstado Civil: " + estCiv;
    }
}
