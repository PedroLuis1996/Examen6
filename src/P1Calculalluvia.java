import java.io.*;

public class P1Calculalluvia {
    public static void main(String[] args) {
        try (ObjectInputStream bis = new ObjectInputStream(new FileInputStream("lluvia.txt"));
             ObjectOutputStream bos = new  ObjectOutputStream(new FileOutputStream("salida.txt"))){






        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


}
