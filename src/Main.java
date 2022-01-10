import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Repository repo = new Repository();
        Service service = new Service();

        try {
            List<Offerte> offerteList;
            offerteList = repo.readFromFile("D:\\UBB\\3.2. MAP\\LABORATOR\\PROIECTE\\Grupa712-GeorgianaIepan-Problema1\\src\\offerten.txt", "$");

            System.out.println(service.sortListeOfferteByHoursSpent(offerteList));
            System.out.println(service.filterListeByStatus(offerteList, Status.Open, Status.InProgress));

            repo.writeToFile("D:\\UBB\\3.2. MAP\\LABORATOR\\PROIECTE\\Grupa712-GeorgianaIepan-Problema1\\src\\offertenResults.txt", offerteList, "$");


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

