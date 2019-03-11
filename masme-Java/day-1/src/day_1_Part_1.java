import java.io.File;
import java.util.Scanner;

public class day_1_Part_1 {

    public static void main(String[] args) {
        System.out.println(determineFrequency());
    }

    public static int determineFrequency() {
            int Frequency = 0;
        try {
            File input = new File("Day_1_input.txt");
            Scanner scan = new Scanner(input);
            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                Frequency += Integer.parseInt(line);
        }
        }catch (Exception e) {
            e.printStackTrace();
        }

        return Frequency;
    }
}
