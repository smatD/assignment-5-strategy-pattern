public class WalkStrategy implements RouteStrategy {
    @Override
    public String buildRoute(String start, String destination, double distanceKm) {
        double minutes = distanceKm / 5 * 60;
        return String.format("Walk: %s to %s, %.1f km, about %.0f minutes", start, destination, distanceKm, minutes);
    }
}
