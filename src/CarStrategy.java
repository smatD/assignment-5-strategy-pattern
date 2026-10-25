public class CarStrategy implements RouteStrategy {
    @Override
    public String buildRoute(String start, String destination, double distanceKm) {
        double minutes = distanceKm / 40 * 60;
        return String.format("Car: %s to %s, %.1f km, about %.0f minutes", start, destination, distanceKm, minutes);
    }
}
