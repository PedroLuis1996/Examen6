import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.RandomAccess;
import java.util.Scanner;

public class P2AlmacenaDatos {
    public static void main(String[] args) {
        int n_dias;
        int dia;
        Double marca;
        int lunes = 0, martes = 0, miercoles = 0 , jueves = 0, viernes = 0;

        Scanner scanner = new Scanner(System.in);
        n_dias = scanner.nextInt();
        while (true){
            dia = scanner.nextInt();
            marca = scanner.nextDouble();
            if (dia >= 1 && dia <= n_dias ){
                if (dia == 0){
                    break;
                }
                switch (n_dias){
                    case 1:
                        lunes++;
                        break;
                    case 2:
                        martes++;
                        break;
                    case 3:
                        miercoles++;
                        break;
                    case 4:
                        jueves++;
                        break;
                    case 5:
                        viernes++;
                        break;

                }
            }else {
                System.out.println("Dia incorrecto");
            }








        }

        try (RandomAccessFile raf = new RandomAccessFile("marcas.dat", "rw")){

            // 4 + 8 + 8

            raf.writeInt(lunes);

            raf.writeInt(martes);

            raf.writeInt(miercoles);

            raf.writeInt(jueves);

            raf.writeInt(viernes);









        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
