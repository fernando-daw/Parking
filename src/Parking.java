import java.sql.SQLOutput;
import java.util.Scanner;

public class Parking {
    private int parking_tamaño;

    private vehiculo[] lista_vehiculos;

Scanner pedir = new Scanner(System.in);
Scanner rellenar = new Scanner(System.in);

    //Constructor que recibe el tamaño del array y genera el nuevo array con dicho tamaño
    public Parking (int parking_tamaño){
        this.parking_tamaño=parking_tamaño;
        lista_vehiculos = new vehiculo[parking_tamaño];
    }


    public  vehiculo[] rellenarparking (int respuesta2) {
        if (respuesta2 == 1) {
            System.out.println("Vas a meter manualmente los vehiculos");
            for (int i = 1; i < lista_vehiculos.length; i++) {
                System.out.println("Introduce el nuevo vehiculo que vas a estacionar; " + (i + 1) + "en el parking. \n1 Coche \n2 Camion ");
                int valor_coche = pedir.nextInt();
                vehiculo coche = new vehiculo(valor_coche);

                if (valor_coche == 1) {
                    lista_vehiculos[i] = coche;
                }
                if (valor_coche == 2) {
                    if (i < (lista_vehiculos.length - 1)) {
                        lista_vehiculos[i] = coche;
                        lista_vehiculos[i + 1] = coche;
                        i++;
                    }
                }
            }
            System.out.println("Parking completo");
        }


        if (respuesta2==2){
            System.out.println("Has escogido la entrada aleatoria de vehiculos al parking");
            for (int i=1; i< lista_vehiculos.length;i++){
                int valor_coche = (int) Math.floor(Math.random()*(2-1+1)+1);
                vehiculo coche = new vehiculo(valor_coche);

                if (respuesta2==1){
                    lista_vehiculos[i]=coche;
                }
                if (i < (lista_vehiculos.length - 1)) {
                    lista_vehiculos[i] = coche;
                    lista_vehiculos[i + 1] = coche;
                    i++;
            } else {
                    System.out.println("No se puede introducir plazas para camion. Quieres introducir un coche?");
                    int si_coche_no_camion = pedir.nextInt();
                    if (si_coche_no_camion==1){
                        coche.setTipo("coche para 1 plaza");
                        vehiculo coche2 = new vehiculo(1);
                        lista_vehiculos[lista_vehiculos.length-1]=coche;
                    }
                }
            }
            System.out.println("Parking al completo");
        }
        return lista_vehiculos;
    }


    public String encontrarcoche(vehiculo[]array){
        Scanner preguntar = new Scanner(System.in);
        System.out.println("Introduce la matricula del coche que quieres encontrar");
        String consulta = preguntar.nextLine();
        for (int i=1;i< array.length;i++){
            if (array[i].getMatricula().equals(consulta)){
                System.out.println("La matricula del coche es: " + consulta);
                i++;
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
        for (int i=1;i< lista_vehiculos.length;i++){
            if (consulta2==i){
                System.out.println("Coche encontrado en la plaza"  + consulta2+ " con matricula " + matricula);
            }
            else{
                System.out.println("Tu coche no se ha encontrado en el parking");
            }
        }
        return consulta2;
    }

    public void verparking(vehiculo[]array){
        for (int i=1;i< array.length;i++){
            if ((array[i] != null) && (array[i].getTipo() == "plaza ocupada por coche ")) {
                System.out.println("La " + (i + 1) + "º plaza del parking la ocupa" + array[i]);
            }
            if ((array[i] != null) && (array[i].getTipo() == "plaza ocupada por camion ")) {
                System.out.println("La " + (i + 1) + "º y " + (i + 2) + "º plazas del parking las ocupa" + array[i]);
                i++;
            }
            if ((array[i] == null)) {
                System.out.println("Queda la " + (array.length) + "º plaza libre, ya que solo entraba un coche y se solicitó introducir un camion");
            }
        }
    }
    public void quitar_vehiculo (vehiculo[]array){
        System.out.println("Como quieres retirar el vehiculo? \n1 Por matricula \n2 De manera aleatoria");
        int tipo_retirada= pedir.nextInt();
        switch (tipo_retirada){
            case 1:
                System.out.println("Introduce la matricula del coche que quieres retirar");
            String borrar_matricula= rellenar.nextLine();
            for (int i=0; i< array.length;i++){
                if (array[i].getMatricula().equals(borrar_matricula)){
                    if (i< (array.length -1)){
                        if (array[i].getMatricula().equals(array[i+1].getMatricula())){
                            System.out.println("Se ha retirado el vehiculo con matricula " + array[i].getMatricula());
                            array[i].setTipo("vehiculo retirado.");
                            array[i].setMatricula("");
                            i++;
                        }else {
                            System.out.println("Se ha retirado un vehiculo con matricula: " + array[i].getMatricula());
                            array[i].setTipo("retirado, ");
                            array[i].setMatricula("-");
                        }
                        else{
                            System.out.println("Se ha retirado un vehiculo con matricula: " + array[i].getMatricula());
                            array[i].setTipo("retirado, ");
                            array[i].setMatricula("-");
                        }
                    }
                }
                break;
                case 2:

            }
        }





    }


}
