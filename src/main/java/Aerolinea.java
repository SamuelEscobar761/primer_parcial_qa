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

            return "El día " + diaSemana + " " + dia + " de " + mesStr + " " + gestion + " existen " + cantidadRequerida + " pasajes para " + destino;
        } else {
            return "No existen suficientes pasajes para " + destino;
        }
    }

    private boolean existePasajes(String destino, int cantidadRequerida) {
        return disponibles.containsKey(destino) && disponibles.get(destino) >= cantidadRequerida;
    }

    private String getDay(int dia, int mes, int gestion){
        return "Lunes";
    }

    private String getMonthString(int mes){
        if(mes == 1){
            return "Enero";
        }else if(mes == 2){
            return "Febrero";
        }else if(mes == 3){
            return "Marzo";
        }else if(mes == 4){
            return "Abril";
        }else if(mes == 5){
            return "Mayo";
        }else if(mes == 6){
            return "Junio";
        }else if(mes == 7){
            return "Julio";
        }else if(mes == 8){
            return "Agosto";
        }else if(mes == 9){
            return "Septiembre";
        }else if(mes == 10){
            return "Octubre";
        }else if(mes == 11){
            return "Noviembre";
        }else if(mes == 12){
            return "Diciembre";
        }
    }
}