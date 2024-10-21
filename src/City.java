import java.util.ArrayList;
import java.util.List;

public class City {
    private String name;
    private List<City> destinations;
    private List<Integer> costs;

    String getName() {
        return this.name;
    }

    City(String name) {
        this.name = name;
        this.destinations = new ArrayList<>();
        this.costs = new ArrayList<>();
    }

    public void addRoute(City destination, int cost) {
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

