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
        letrasMatricula();
    }

     //funcion que crea las matrículas de forma aleatoria
    public  String  letrasMatricula (){
        Random ale2 = new Random();
        int aleatorio2= ale2.nextInt(9999)+1000;
        String [] arrayletras ={"b","c","d","f","g","h","j","k","l","m","n","p","q","r","s","t","v","w","x","y","z"};
        for (int i=0; i<3;i++){
            Random ale = new Random();
            int aleatorio = ale.nextInt(arrayletras.length);
            matricula = aleatorio2 + arrayletras[aleatorio];
        }
        return matricula ;
     }



}
