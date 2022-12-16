import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cubrir = new Scanner(System.in);

        System.out.println("¿De cuantas plazas dispones tu parking?");
        int plazas = cubrir.nextInt();
        Parking parking = new Parking(plazas);
        System.out.println("¿Como quieres que sea la entrada de vehiculos? \n1 Manual \n2 Aleatoria ");
        int respuesta = cubrir.nextInt();
        vehiculo[] coches = parking.rellenarparking(respuesta);
        boolean salida= false;
        do {
            System.out.println("¿Que deseas hacer? \n1 Mostrar todos los registros del parking. \n2 Buscar vehiculos por plazas. \n3 Buscar vehiculos por matricula. \n4 Retirar un vehiculo del parking. \n5 Salir del programa. ");
            int menu = cubrir.nextInt();

            switch (menu) {

                case 1:
                    parking.verparking(coches);
                    break;
                case 2:
                    parking.encontrarcocheindice(coches);
                    break;
                case 3:
                    parking.encontrarcoche(coches);
                    break;
                case 4:
                    parking.quitar_vehiculo(coches);
                    break;
                case 5:
                    System.out.println("Fin del programa");
                    return;
            }

        } while (salida = true);





    }
}