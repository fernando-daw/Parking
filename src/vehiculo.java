import java.util.Random;

public class vehiculo {
    private int tamaño;
    private String matricula;
    private String tipo;

    //contructor parametrizado que recibe el tamano introducido por el usuario
    public vehiculo (int tamaño){
        this.tamaño=tamaño;
        if (tamaño==1){
            tipo="coche";
        }
        if (tamaño==2){
            tipo="camion";
        }
        genera_matricula();
    }

    public String toString() {
        return " el vehiculo introducido es " + tipo + "con matricula = " + matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    //funcion que crea las matrículas de forma aleatoria
    public  String  genera_matricula (){
        String[] letras = new String[]{"B", "C", "D", "F", "G", "H", "J", "K", "L", "M", "N", "P", "Q", "R", "S", "T", "V", "W", "X", "Y", "Z"};
        int numeros_matricula = (int) Math.floor(Math.random() * (9999 - 999 + 1) + 999);

        int letra = (int) Math.floor(Math.random() * ((letras.length - 1) - 0 + 1) + 0);
        int letra2 = (int) Math.floor(Math.random() * ((letras.length - 1) - 0 + 1) + 0);
        int letra3 = (int) Math.floor(Math.random() * ((letras.length - 1) - 0 + 1) + 0);
        String indiv = "";
        indiv = letras[letra];
        String indiv2 = "";
        indiv2 = letras[letra2];
        String indiv3 = "";
        indiv3 = letras[letra3];
        matricula = numeros_matricula + indiv + indiv2 + indiv3;
        return matricula;
     }



}
