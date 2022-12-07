public class vehiculo {
    private int tamaño;
    private String matricula="";
    private String tipo;

     //funcion que crea las letras de las matrículas de forma aleatoria
    public  String  letrasMatricula (){
        String arrayletras ="bcdfghjklmnpqrstvwxyz";
        String matricula1="";
        for (int i=0; i<3;i++){
            int letra = (int) Math.random() *23;
             matricula1 = matricula + arrayletras.charAt(letra);
        }
        return matricula1;
     }
     public String numerosMatricula(){
        String arraynumeros = "1234567890";
         String matricula2="";
        for (int i=0;i<4;i++){
            int num = (int) Math.random() *23;
             matricula2 = matricula + arraynumeros.charAt(num);
        }
        return matricula2;
     }
     public void juntarMatricula (){
        String matriculafinal="";
        matriculafinal=letrasMatricula() + numerosMatricula();

     }


}
