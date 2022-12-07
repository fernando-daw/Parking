public class Parking {
    private vehiculo[] lista_vehiculo;
    private int tamaño;

    Parking (int tamaño){
        this.tamaño=tamaño;
        this.lista_vehiculo = new vehiculo[this.tamaño];
    }

    public vehiculo[]getLista_vehiculo(){
        return lista_vehiculo;
    }

    public void setLista_vehiculo(int tamaño) {
        this.lista_vehiculo = lista_vehiculo;
    }
}
