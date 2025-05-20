import java.util.ArrayList;
import java.util.List;

public class CityTask2 {
    private String name;
    private List<CityTask2> destinations;
    private List<Integer> costs;

    String setName(){
        this.name=name;
        return this.name;
    }
    String getName() {
        return this.name;
    }

    List<CityTask2> setDestinations(){
        this.destinations=destinations;
        return this.destinations;
    }
    List<CityTask2> getDestinations(){
        return this.destinations;
    }

    List<Integer> setCosts(){
        this.costs=costs;
        return this.costs;
    }
    List<Integer> getCosts(){
        return this.costs;
    }

    CityTask2(String name) {
        this.name = name;
        this.destinations = new ArrayList<>();
        this.costs = new ArrayList<>();
    }

    CityTask2(String name, List<CityTask2> destinations, List<Integer> costs) {
        this.name = name;
        this.destinations = new ArrayList<>();
        this.costs = new ArrayList<>();
        if (destinations.size() == costs.size()) {
            this.destinations.addAll(destinations);
            this.costs.addAll(costs);
        } else {
            throw new IllegalArgumentException("Количество городов и стоимостей должно совпадать.");
        }
    }

    public void addRoute(CityTask2 destination, int cost) {
        destinations.add(destination);
        costs.add(cost);
    }

    public String convertToString() {
        StringBuilder rez = new StringBuilder(
                "Из города " + name + " можно попасть в города:\n"
        );
        for (int i = 0; i < destinations.size(); i++) {
            String destinationName = destinations.get(i).getName();
            int cost = costs.get(i);
            rez.append(destinationName)
                    .append(" : ")
                    .append(cost)
                    .append("\n");
        }
        return rez.toString();
    }
}

