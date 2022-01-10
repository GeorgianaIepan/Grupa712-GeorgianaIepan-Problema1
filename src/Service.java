import java.util.List;
import java.util.stream.Collectors;

public class Service {

    public List<Offerte> sortListeOfferteByHoursSpent(List<Offerte> liste) {
        return liste.stream()
                .sorted((offerte, otherOfferte) -> otherOfferte.getHoursSpent().compareTo(offerte.getHoursSpent()))
                .collect(Collectors.toList());
    }

    public List<Offerte> filterListeByStatus(List<Offerte> liste, Status status, Integer hoursSpend, Integer hourBuget) {
        return liste.stream()
                .filter(offerte -> hourBuget>hoursSpend && status != Status.Done)
                .collect(Collectors.toList());
    }
}


