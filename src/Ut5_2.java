import java.util.*;

public class Ut5_2 {
    public static void main(String[] args) {
        List<String> l = new ArrayList<>();
        TreeSet<String> lista = new TreeSet<>();
        boolean bucle = true;

        Scanner scanner = new Scanner(System.in);
        String nombre;
        int numero;
        do {
            nombre = scanner.next();
            if (nombre.equalsIgnoreCase("fin")){
                bucle = false;
            } else {
                l.add(nombre);
            }


        } while (bucle);


        for (int i = 0; i < l.size(); i++){
            if (!lista.contains(l.get(i))){
                lista.add(l.get(i));
            }
        }

        bucle = true;
        int r = lista.size();
            do {

                int repetido = 0;
                for (int i = 0 ; i< l.size(); i++){
                    if (lista.getFirst().equals(l.get(i))){
                        repetido++;
                    }
                }
                System.out.println(lista.getFirst() + " -> " + repetido);
                lista.remove(lista.getFirst());
                --r;

                if (r == 0){
                    bucle = false;
                }
            }while (bucle);






    }
}
