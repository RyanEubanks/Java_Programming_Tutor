package SpringFramework;

public class SpringTroubleShooting {
    public static void displayTroubleShootingGuide() {
        System.out.println(" if application fails to start:");
        System.out.println("Make sure you checked for typos and errors in your files, and check that all dependencies are up to date\n");

        System.out.println("Beans are being created:");
        System.out.println("Check for missing or incorrect annotions like: @Components, @Service, or @Repository");

        System.out.println("URL gives a 404 error");
        System.out.println("Make sure that your controller mappings(@RequestMapping, @GetMapping) are correct");
    }
}
