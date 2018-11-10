package carellaprojects.anonymousfunctions;

/**
 * <p>
 * A functional interface. This only has one abstract method and can be used for lambda expressions
 * in different classes.
 * </p>
 * @author Anthony Carella
 *
 */
public interface MyFunction {
    /**
     * <p>
     * An abstract method that can be used to make lambda functions. In the application, the method
     * is being used for basic arithmetic operations.
     * </p>
     * 
     * @param a The first number that will be used for a calculation.
     * @param b The second number that will be used for a calculation.
     * @return The number that is produced after the calulation.
     */
    int calculate(int a, int b);
}
