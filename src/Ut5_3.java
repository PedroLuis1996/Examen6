import java.util.Scanner;

public class Ut5_3 {
    public static void main(String[] args) {
        String nombre;
        Scanner scanner = new Scanner(System.in);
        while (true){
            nombre = scanner.next();
            if (nombre.equalsIgnoreCase("fin")){
                break;
            } else {
                int letraI = 0;
              char[] letras = nombre.toCharArray();
               for (int i = 0; i < letras.length; i++){
                   if (letras[0] == '1' || letras[0] == '2' || letras[0] == '3' || letras[0] == '4' || letras[0] == '5'
                           || letras[0] == '6' || letras[0] == '7' || letras[0] == '8' || letras[0] == '9' || letras[0] == '0'){
                       System.out.print("DIGITO ");
                   }
                   if (letras[i] == 'A' || letras[i] == 'E' || letras[i] == 'I' || letras[i] == 'O' || letras[i] == 'U'){
                       System.out.print("VOCAL ");
                   }

                   if (letras[i] == 'I'){
                       letraI++;
                   }


               }
               if (letraI == 2 || letraI == 3){
                   System.out.print("ROMANO ");
               }

            }
        }
    }
}
