import java.util.*;

public class Ut5_1 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int repeticiones = 10, numeros_elejidos, coinciden = 0;
        List<Integer> lista = new ArrayList<>();
        List<Integer> lista_random = new ArrayList<>();

            do {
                System.out.println("Quedan " + repeticiones + ": ");
                numeros_elejidos = scanner.nextInt();


                if (lista.contains(numeros_elejidos)) {
                    System.out.println("REPETIDO, INTRODUCE OTRO");
                } else if (numeros_elejidos >= 1 && numeros_elejidos <= 100) {
                    --repeticiones;
                    lista.add(numeros_elejidos);
                }else {
                    System.out.println("NO VALIDO, INTRODUCE OTRO");
                }

            }while (repeticiones != 0);

            do {
                int numeros_aleatorios = random.nextInt(1, 101);
                if (lista_random.contains(numeros_aleatorios)){

                } else {
                    lista_random.add(numeros_aleatorios);
                    repeticiones++;
                }
            }while (repeticiones != 20);

            for (int h = 0; h < lista_random.size(); h++){
                System.out.print(lista_random.get(h) + " ");
            }
            System.out.println("");

            for (int i = 0; i < 10; i++){
                for (int j = 0; j < 20; j++){
                    if (lista_random.get(j) == lista.get(i)){
                        coinciden++;
                        break;
                    }

                }
            }
            System.out.println("Han coincidido "+ coinciden + " numeros");





    }
}
