public class CycleStrategy implements RouteStrategy {
    @Override
    public String buildRoute(String start, String destination, double distanceKm) {
        double minutes = distanceKm / 15 * 60;
        return String.format("Cycle: %s to %s, %.1f km, about %.0f minutes", start, destination, distanceKm, minutes);
    }
}
