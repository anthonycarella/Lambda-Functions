package carellaprojects.anonymousfunctions;

/**
 * <p>
 * Defines and executes lambda expressions for basic arithmetic. The lambda expressions are defined
 * in the {@code executeFunctions} method,  although lambda expressions  can also be defined in the
 * class itself, outside of the class methods.  The {@code executeFunctions} method then calls  the
 * {@code runFunction}  method for each  of the anonymous functions and  passes each of  them as  a
 * parameter (one of the use cases for using lambda expressions). The interface being used is
 * {@code MyFunction}, with a single abstract method.
 * 
 * <code>
 * MyFunction nameOfVariable = (num1, num2) -> {
 *     return [some operation];
 * };
 * </code>
 * </p>
 * 
 * @author Anthony Carella
 *
 */
public class LambdaFunctions {
    /**
     * <p>
     * Executes all of  the lambda expressions.  The addition and multiplication functions keep the
     * order of  the parameters  the same,  assuming that the  first parameter is  larger than  the
     * second.  The commutative property  dictates that it does not  matter which order two numbers
     * are added or multiplied.  The subtraction function subtracts the  first parameter {@code a})
     * from the second ({@code b}).  The division function divides the  second parameter {@code b})
     * by the  first ({@code a}).  Each one  of these functions  are then passed into the  function
     * {@code runFunction} method.
     * </p>
     * 
     * @param num1 The first number to use in the equation.
     * @param num2 The second number to use in the equation.
     */
    void executeFunctions(int num1, int num2) {
        MyFunction add = (a, b) -> {
            return a + b;
        };
        
        MyFunction subtract = (a, b) -> {
            return b - a;
        };
        
        MyFunction multiply = (a, b) -> {
            return a * b;
        };
        
        MyFunction divide = (a, b) -> {
            return b / a;
        };

        runFunction(num1, num2, add);
        runFunction(num1, num2, subtract);
        runFunction(num1, num2, multiply);
        runFunction(num1, num2, divide);
    }

    /**
     * <p>
     * A method that is used to run each anonymous function. This is part of the use case for using
     * lambda  expressions;  they  can  be used  method parameters and  code can be  used as  data.
     * </p>
     * 
     * @param num1 The first number that will run through the function.
     * @param num2 The second number that will run through the function.
     * @param myFunction The interface that will be used to run the function.
     */
    void runFunction(int num1, int num2, MyFunction myFunction) {
        System.out.println(myFunction.calculate(num1, num2));
    }
}
