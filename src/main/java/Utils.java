
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Utils {

    public int getCube(int number) {

        return number * number * number;

    }

    public static boolean getPrime(int x) {

        for (int i = 2; i < x; i++) {
            if (x % i == 0) {

                return false;

            }
        }
        return true;
    }

    int getFile(String Filename) throws FileNotFoundException {

        int number;

        Scanner sc = new Scanner(new File(Filename));
        number = sc.nextInt();
        return number;

    }
}
