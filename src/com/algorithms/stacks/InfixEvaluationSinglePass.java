package com.algorithms.stacks;

import java.util.Stack;

public class InfixEvaluationSinglePass {
	
	

	private static int evalExpression(String expr) {
		int result = 0;
		
		Stack<Integer> numbers = new Stack<Integer>();
		Stack<Character> operators = new Stack<Character>();
		
		for (char c : expr.toCharArray()) {
			if (isOperator(c)) {
				if (operators.isEmpty()) {
					operators.push(c);
				}  else {
					while (!operators.isEmpty() && precedence(c) <= precedence(operators.peek())) {
						numbers.push(performOperation(numbers, operators));
					}
					operators.push(c);
				}

			} else if (c == '(') {
				operators.push(c);
			} else if (c == ')') {

				while (operators.peek() != '(') {
					numbers.push(performOperation(numbers, operators));
				}
				operators.pop();

			} else {
				numbers.push(Integer.parseInt(c + ""));
			}
		}
		
		while (!operators.isEmpty()) {
			numbers.push(performOperation(numbers, operators));
		}
		
		return numbers.pop();
	}

	private static int performOperation(Stack<Integer> numbers, Stack<Character> operations) {
        int a = numbers.pop();
        int b = numbers.pop();
        char operation = operations.pop();
        switch (operation) {
            case '+':
                return a + b;
            case '-':
                return b - a;
            case '*':
                return a * b;
            case '/':
                if (a == 0)
                    throw new
                            UnsupportedOperationException("Cannot divide by zero");
                return b / a;
        }
        return 0;
    }

	private static boolean isOperator(char c){
        return (c=='+'||c=='-'||c=='/'||c=='*'||c=='^');
		// return (c=='+'||c=='-'||c=='/'||c=='*'||c=='^'||c==')'||c=='(');
    }
    

    static int precedence(char c){
        switch (c){
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }
    
    
	public static void main(String[] args) {
		String expr = "(6/2)*6-(5*2)+4";
		System.out.println(evalExpression(expr));
		//System.out.println(evaluate(expr));
	}

}
