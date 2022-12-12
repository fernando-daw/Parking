import java.util.Scanner;

public class Parking {
    private String matricula;
    private int tamaño;

    private vehiculo[] lista_vehiculo;



    //Constructor que recibe el tamaño del array y genera el nuevo array con dicho tamaño
    public Parking (int tamaño){
        this.tamaño=tamaño;
        lista_vehiculo = new vehiculo[tamaño];
    }


    public  vehiculo[] rellenarparking (int respuesta2){
        return null;
    }

    public String encontrarcoche(){
        Scanner preguntar = new Scanner(System.in);
        System.out.println("Introduce la matricula del coche que quieres encontrar");
        String consulta = preguntar.nextLine();
        for (int i=0;i< lista_vehiculo.length;i++){
            if (consulta==matricula){
                System.out.println("Tu vehiculo esta en la plaza " + i);
            }
        else {
                System.out.println("Tu coche no se encuentra en el parking");
            }
        }
        return consulta;
    }
    public int encontrarcocheindice(){
        Scanner preguntar2 = new Scanner(System.in);
        System.out.println("Indica la posicion de tu vehiculo");
        int consulta2=preguntar2.nextInt();
        for (int i=0;i< lista_vehiculo.length;i++){
            if (consulta2==i){
                System.out.println("Coche encontrado en la plaza"  + consulta2+ " con matricula " + matricula);
            }
            else{
                System.out.println("Tu coche no se ha encontrado en el parking");
            }
        }
        return consulta2;
    }

    public String verparking(vehiculo[]lista_vehiculo){
        String vermatricula;

        return vermatricula;
    }


    public vehiculo[]getLista_vehiculo(){
        return lista_vehiculo;
    }

    public void setLista_vehiculo(int tamaño) {
        this.lista_vehiculo = lista_vehiculo;
    }



}
