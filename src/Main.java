import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner espacio = new Scanner(System.in);
        System.out.println("Indica el tamaño del parking");
        int tamaño = espacio.nextInt();

        Parking nuevo = new Parking(tamaño);


        Scanner aparcamiento = new Scanner(System.in);
        System.out.println("Seleccione el tipo de aparcamiento:\n  Manual \n Automático");
        String respuesta2 = aparcamiento.nextLine();




    }
}