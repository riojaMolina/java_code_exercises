package local.mmolina.vuelos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class EjemploVuelos {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat f = new SimpleDateFormat("EEE MMM dd HH:mm:ss yyyy");

        List<Vuelo> vuelos = new ArrayList<>();
        vuelos.add(new Vuelo("AAL 993", "New York", "Santiago", f.parse("Mon Aug 29 05:39:00 2021"), 62));
        vuelos.add(new Vuelo("LAT 755", "Sao Paulo", "Santiago", f.parse("Mon Aug 31 04:45:00 2021"), 47));
        vuelos.add(new Vuelo("SKU 621", "Rio De Janeiro", "Santiago", f.parse("Mon Aug 30 16:00:00 2021"), 52));
        vuelos.add(new Vuelo("DAL 147", "Atlanta", "Santiago", f.parse("Mon Aug 29 13:22:00 2021"), 59));
        vuelos.add(new Vuelo("AVA 241", "Bogota", "Santiago", f.parse("Mon Aug 31 14:05:00 2021"), 25));
        vuelos.add(new Vuelo("AMX 10", "Mexico City", "Santiago", f.parse("Mon Aug 31 05:20:00 2021"), 29));
        vuelos.add(new Vuelo("IBE 6833", "Londres", "Santiago", f.parse("Mon Aug 30 08:45:00 2021"), 55));
        vuelos.add(new Vuelo("LAT 2479", "Frankfurt", "Santiago", f.parse("Mon Aug 29 07:41:00 2021"), 51));
        vuelos.add(new Vuelo("SKU 803", "Lima", "Santiago", f.parse("Mon Aug 30 10:35:00 2021"), 48));
        vuelos.add(new Vuelo("LAT 533", "Los Angeles", "Santiago", f.parse("Mon Aug 29 09:14:00 2021"), 59));
        vuelos.add(new Vuelo("LAT 1447", "Guayaquil", "Santiago", f.parse("Mon Aug 31 08:33:00 2021"), 31));
        vuelos.add(new Vuelo("CMP 111", "Panama City", "Santiago", f.parse("Mon Aug 31 15:15:00 2021"), 29));
        vuelos.add(new Vuelo("LAT 705", "Madrid", "Santiago", f.parse("Mon Aug 30 08:14:00 2021"), 47));
        vuelos.add(new Vuelo("AAL 957", "Miami", "Santiago", f.parse("Mon Aug 29 22:53:00 2021"), 60));
        vuelos.add(new Vuelo("ARG 5091", "Buenos Aires", "Santiago", f.parse("Mon Aug 31 09:57:00 2021"), 32));
        vuelos.add(new Vuelo("LAT 1283", "Cancun", "Santiago", f.parse("Mon Aug 31 04:00:00 2021"), 35));
        vuelos.add(new Vuelo("LAT 579", "Barcelona", "Santiago", f.parse("Mon Aug 29 07:45:00 2021"), 61));
        vuelos.add(new Vuelo("AAL 945", "Dallas-Fort Worth", "Santiago", f.parse("Mon Aug 30 07:12:00 2021"), 58));
        vuelos.add(new Vuelo("LAT 501", "Paris", "Santiago", f.parse("Mon Aug 29 18:29:00 2021"), 49));
        vuelos.add(new Vuelo("LAT 405", "Montevideo", "Santiago", f.parse("Mon Aug 30 15:45:00 2021"), 39));

        //ordena los vuelos en forma ascendente de acuerdo a la fecha
        vuelos.sort(Comparator.comparing(Vuelo::getFecha));
        //prints todos los vuelos
        vuelos.forEach(System.out::println);
        System.out.println("============================================================================================================");
        //obtengo el ultimo vuelo
        Vuelo ultimoVuelo = vuelos.get(vuelos.size() - 1);
        System.out.println("El ultimo vuelo en llegar es " + ultimoVuelo.getNombre() + ": " + ultimoVuelo.getOrigen() + ", aterriza el " + ultimoVuelo.getFecha());
        System.out.println("============================================================================================================");
        //ordena por cantidad de pasajeros
        vuelos.sort(Comparator.comparing(Vuelo::getCantPasajeros));
        System.out.println("El vuelo con menor numero de pasajeros es " + vuelos.get(0).getNombre() + ": " + vuelos.get(0).getOrigen() + ", con " + vuelos.get(0).getCantPasajeros() + " pasajeros");


    }
}
