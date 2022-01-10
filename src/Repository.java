import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Repository {

    public List<Offerte> readFromFile(String fileName, String character) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
        String line = bufferedReader.readLine();
        String[] attributes;
        Offerte offerte;
        List<Offerte> offerteList = new ArrayList<>();
        while (line != null) {
            attributes = line.split(character);
            offerte = new Offerte( Integer.parseInt(attributes[0]), attributes[1],  Integer.parseInt(attributes[2]),  Integer.parseInt(attributes[3]), Status.valueOf(attributes[4]));
            offerteList.add(offerte);

            line = bufferedReader.readLine();
        }

        return offerteList;
    }

    public void writeToFile(String fileName, List<Offerte> liste, String character) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName));
        for (Offerte offerte : liste) {
            String line = offerte.getId() + character + offerte.getTaskName() + character +
                    offerte.getHoursSpent() + character + offerte.getHourBudget() + character + offerte.getStatus();
            bufferedWriter.write(line);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();
    }
}

