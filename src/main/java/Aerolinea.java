import java.util.HashMap;

public class Aerolinea {
    private HashMap<String, Integer> disponibles;

    public Aerolinea(){
        disponibles = new HashMap<>();
        disponibles.put("La Paz", 10);
        disponibles.put("Cochabamba", 5);
        disponibles.put("Santa Cruz", 8);
        disponibles.put("Sucre", 15);
    }

    public String reservaVuelo(String destino, int dia, int mes, int gestion) {
        int cantidadRequerida = 2;

        if(existePasajes(destino, cantidadRequerida)) {
            String diaSemana = getDay(dia, mes, gestion);
            String mesStr = getMonthString(mes);

            disponibles.put(destino, disponibles.get(destino) - cantidadRequerida);

            return "El día " + diaSemana + " " + mesStr + " " + gestion + " existen " + cantidadRequerida + " pasajes para " + destino;
        } else {
            return "No existen suficientes pasajes para " + destino;
        }
    }
}