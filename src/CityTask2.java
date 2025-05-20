import java.util.ArrayList;
import java.util.List;

public class City2{
    private String name;
    private List<City2> destinations;
    private List<Integer> costs;

    String setName(){
        this.name=name;
        return this.name;
    }
    String getName() {
        return this.name;
    }

    List<City2> setDestinations(){
        this.destinations=destinations;
        return this.destinations;
    }
    List<City2> getDestinations(){
        return this.destinations;
    }

    List<Integer> setCosts(){
        this.costs=costs;
        return this.costs;
    }
    List<Integer> getCosts(){
        return this.costs;
    }

    City2(String name) {
        this.name = name;
        this.destinations = new ArrayList<>();
        this.costs = new ArrayList<>();
    }

    City2(String name, List<City2> destinations, List<Integer> costs) {
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

    public void addRoute(City2 destination, int cost) {
        destinations.add(destination);
        costs.add(cost);
    }

    public String toString() {
        StringBuilder rez = new StringBuilder("Из города " + name + " можно попасть в города:" + "\n");
        for (int i = 0; i < destinations.size(); i++) {
            rez.append(destinations.get(i).getName()).append(" : ").append(costs.get(i)).append("\n");
        }
        return rez.toString();
    }
}

