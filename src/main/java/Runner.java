public class Runner {
    public static void main(String[] args) {
        Planet planetMars = new Planet("Mars", 908973);
        System.out.println(planetMars.getName() + " is " + planetMars.getSize());
        System.out.println(planetMars.explodePlanet());
    }

}
