public class nada {
    public Vehiculo[] introducir_coches(int manu_o_aleat) {

        if (manu_o_aleat == 1) {

            System.out.println("Has selecionado entrada de vehiculos manual.");

            for (int i = 0; i < parking.length; i++) {

                System.out.println("Introduce el vehiculo que ocupa la plaza " + (i + 1) + " del parking. \n1 Coche \n2 Camion ");
                int valor_vehiculo = cubrir.nextInt();
                Vehiculo vehic = new Vehiculo(valor_vehiculo);

                if (valor_vehiculo == 1) {
                    parking[i] = vehic;
                }
                if (valor_vehiculo == 2) {

                    if (i < (parking.length - 1)) {
                        parking[i] = vehic;
                        parking[i + 1] = vehic;
                        i++;
                    } else {
                        System.out.println("No hay sitio suficiente para introducir un camion en el parking. La ultima seleccion quedará anulada.\n ¿Quieres introducir un coche en su lugar? \n1 Si \n2 No");
                        int coche_por_camion = cubrir.nextInt();
                        if (coche_por_camion == 1) {
                            vehic.setTipo("coche (ocupa 1 plaza) ");
                            Vehiculo vehiculo = new Vehiculo(1);
                            parking[parking.length-1] = vehic;
                        }
                    }
                }
            }
            System.out.println("La seleccion del parking esta completa.");
        }

        if (manu_o_aleat == 2) {
            System.out.println("Has selecionado entrada de vehiculos aleatoria.");
            for (int i = 0; i < parking.length; i++) {

                int valor_vehiculo = (int) Math.floor(Math.random() * (2 - 1 + 1) + 1);
                Vehiculo vehic = new Vehiculo(valor_vehiculo);

                if (valor_vehiculo == 1) {
                    parking[i] = vehic;
                }
                if (valor_vehiculo == 2) {
                    if (i < (parking.length - 1)) {
                        parking[i] = vehic;
                        parking[i + 1] = vehic;
                        i++;
                    } else {
                        System.out.println("No hay sitio suficiente para introducir un camion en el parking. La ultima seleccion quedará anulada.\n ¿Quieres introducir un coche en su lugar? \n1 Si \n2 No");
                        int coche_por_camion = cubrir.nextInt();
                        if (coche_por_camion == 1) {
                            vehic.setTipo("coche (ocupa 1 plaza) ");
                            parking[parking.length - 1] = vehic;
                            System.out.println("-Se ha seleccionado introducir" + vehic);
                        }
                    }
                }
            }
            System.out.println("La seleccion del parking esta completa.");
        }
        return parking;
    }
}
