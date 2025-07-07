package com.codegnan.lambdaExpressions;

public class LambdaExpression {

	/*
	 * 
	 *                                 Java Features :
	 * 
	 * Lambda expressions :
	 * 
	 * A method without name, modifier, return type. simply anonymous functions.
	 * 
	 * Lisp is the first programming language used Lambda expressions.
	 * 
	 * then c#, C++, Ruby, Python, .net, php and then finally java.
	 * 
	 * The main objective of lambda expressions is to bring functional programming
	 * into java.
	 * 
	 * What is lambda expressions ?
	 * 
	 * Lambda functions is anonymous functions that means the function which does
	 * not have return type, name, modifier.
	 * 
	 * Lambda expressions are also known as anonymous functions or closures.
	 * 
	 * Conclusion :
	 * 
	 * a lambda expressions can have zero or more number of parameters. usually we
	 * can specify we can specify type of parameter. If the compiler expects the
	 * type based on the context then new you can remove the type also
	 * 
	 * if 0 number of parameters are available so then we have to use empty
	 * parameter like ()
	 * 
	 * if only one parameter is available if the compiler expect the type then we
	 * can remove the type and parenthesis.
	 * 
	 * Similar to method body lambda expressions a body also can contain multiple
	 * statements if more than one statement is present then we have to enclosed
	 * with curly braces.
	 *** 
	 * once we write lambda expression we can call it like a normal method. for this
	 * functional interfaces is required.
	 * 
	 * 
	 * Functional Interfaces : Functional interfaces are if any interface can
	 * contain SAM(Single abstract method) is called functional interface
	 * 
	 * Examples : Runnable interface is a functional interface because it contains
	 * only abstract method run() Comparable interface -->compareTo
	 * 
	 * Annotation :@FunctionalInterface
	 * 
	 * Example :
	 * Interface interface{
	 * void method(); //only one abstract method is allowed.
	 * }
	 * 
	 * Inheritance with respective to functional interface : 
	 * 
	 * @Functional Interface
	 * Interface a {
	 * public abstract void method();
	 * }
	 * 
	 * An interface can extends another interface
	 * Interface b extends a{
	 * 
	 *  now b becomes functional interface by default
	 *  
	 *  public abstract void method(); //Is this valid statement or not? yes beacause same name as a interface
	 *  
	 *  
	 * }
	 * 
	 * Lambda Expressions vs Functional Interfaces : 
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) {
		
	}

}
