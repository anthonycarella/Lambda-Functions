package carellaprojects.anonymousfunctions;

/**
 * <p>
 * The class that has the main method that launches the application. The numbers that are passed to
 * the LambdaFunctions can either be hard-coded, or possibly be part of the {@code args} parameters
 * when the app is started up.
 * </p>
 * 
 * @author Anthony Carella
 *
 */
public class App {
    /**
     * <p>
     * The main method that launches the application.
     * </p>
     * 
     * @param args
     */
    public static void main(String[] args) {
        LambdaFunctions lambdaFunctions = new LambdaFunctions();
        lambdaFunctions.executeFunctions(20, 40);
    }
}
