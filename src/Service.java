import java.util.List;
import java.util.stream.Collectors;

public class Service {

    public List<Offerte> sortListeOfferteByHoursSpent(List<Offerte> liste) {
        return liste.stream()
                .sorted((offerte, otherOfferte) -> otherOfferte.getHoursSpent().compareTo(offerte.getHoursSpent()))
                .collect(Collectors.toList());
    }

    public List<Offerte> filterListeByStatus(List<Offerte> liste, Status status, Integer hoursSpend) {
        return liste.stream()
                .filter(tier -> {

                    return tier.getStatus() == s1 ;
                })
                .collect(Collectors.toList());
    }
}


