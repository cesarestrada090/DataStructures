package predicates;
import java.util.*;

public class PredicateTest {
    public static void main(String[] args) {



        Map<String,String> map = new HashMap<>();

        /*HashMap;
        si permite nulos como clave

        Clave valor, Mas eficiente que linkedHashMap

        LinkedHashMap;

        si permite nulos como clave

        Clave valor, (se basa en listas enlazadas para mantener el orden)

        SortedMap;

        // Los ordena por orden natural

        HashTable;

        Es mas lento, pero es sincronizado*/


        map.put("ss","1"); // 23282%16  5
        map.put("ss2","2");// 32123%16  3
        map.put("ss3","3");// 31223%16  6

        map.put("ss16","16"); // 33983%16 = 7

        map.put("ss12222","16"); // 33983%16 = 3


        // "sdads" -> Hash() ->  33983
        // "sdads" -> Hash() ->  33983
        // "sdxs" -> Hash() ->  3222


        map.get("ss16"); // 22323


        //Map Colision



    }

}
