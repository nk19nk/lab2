import java.util.ArrayList;
import java.util.List;

public class CityTask1 {
    private String name;
    private List<CityTask1> destinations;
    private List<Integer> costs;

    String setName(){
        this.name=name;
        return this.name;
    }
    String getName() {
        return this.name;
    }

    List<CityTask1> setDestinations(){
        this.destinations=destinations;
        return this.destinations;
    }
    List<CityTask1> getDestinations(){
        return this.destinations;
    }

    List<Integer> setCosts(){
        this.costs=costs;
        return this.costs;
    }
    List<Integer> getCosts(){
        return this.costs;
    }

    CityTask1(String name) {
        this.name = name;
        this.destinations = new ArrayList<>();
        this.costs = new ArrayList<>();
    }

    public void addRoute(CityTask1 destination, int cost) {
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

