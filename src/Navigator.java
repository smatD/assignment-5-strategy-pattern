import java.util.Objects;

public class Navigator {
    private RouteStrategy strategy;

    public Navigator(RouteStrategy strategy) {
        setStrategy(strategy);
    }

    public void setStrategy(RouteStrategy strategy) {
        this.strategy = Objects.requireNonNull(strategy);
    }

    public String planRoute(String start, String destination, double distanceKm) {
        return strategy.buildRoute(start, destination, distanceKm);
    }
}
