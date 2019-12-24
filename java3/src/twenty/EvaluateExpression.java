/*
package twenty;
import java.util.Stack;
public class EvaluateExpression {
    public static void main(String[] args) {
//        chenk number
        if (args.length != 1){
            System.out.println("error pleas try again!");
            System.exit(1);
        }

        try {
            System.out.println(evaluateExpression(args[0]));
        }
        catch (Exception ex){
            System.out.println("Wrong express: " + args[0]);
        }
    }

    public static int evaluateExpression(String expression){
//        create operandStack Stack
        Stack<Integer> operandStack = new Stack<>();
//        create opratorStack Stack
        Stack<Character> operatotStack = new Stack<>();
        expression = insertBlanks(expression);

        String[] tokens = expression.split(" ");
//        Scan tokens
        for (String token:tokens){
            if (token.length() == 0)
                continue;
            else if (token.charAt(0) == '+' ||
                     token.charAt(0) == '-' ||
                     token.charAt(0) == '*' ||
                     token.charAt(0) == '/')
                processAnOperator(operandStack,operatotStack);
            operatotStack.push(token.charAt(0));
        }

    }
}
*/
