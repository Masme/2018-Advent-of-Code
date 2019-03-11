import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class day_1_Part_2 {

    public static void main(String[] args) throws FileNotFoundException {

        /*create an array list for frequency changes (input file converted to array list)
        create an array list for resultant frequencies (every sub total until the final total)
        create current frequency integer*/

        List<Integer> frequencychanges = new ArrayList<>();
        List<Integer> resultantFrequencies = new ArrayList<>();
        int frequency  = 0;

        File input = new File("Day_1_input.txt");
        Scanner scannedInput = new Scanner(input);

        while (scannedInput.hasNextLine()) {
            int line = Integer.parseInt(scannedInput.nextLine());
            frequencychanges.add(line);
        }

        scannedInput.close();

        boolean foundCalibratedFrequency = false;
        while (!foundCalibratedFrequency) {
            for (int line : frequencychanges) {
                if (resultantFrequencies.contains(frequency)) {
                    foundCalibratedFrequency = true;
                    break;
                }

                resultantFrequencies.add(frequency);
                frequency += line;
            }
        }
        System.out.println(frequency);
    }
}
