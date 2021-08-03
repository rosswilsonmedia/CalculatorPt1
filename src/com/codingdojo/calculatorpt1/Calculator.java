package com.codingdojo.calculatorpt1;

public class Calculator {
	private double operandOne;
	private double operandTwo;
	private char operation;
	private double result;
	public Calculator() {
		setOperandOne(0);
		setOperandTwo(0);
		setOperation('0');
	}
	public double getOperandOne() {
		return operandOne;
	}
	public void setOperandOne(double operandOne) {
		this.operandOne = operandOne;
	}
	public double getOperandTwo() {
		return operandTwo;
	}
	public void setOperandTwo(double operandTwo) {
		this.operandTwo = operandTwo;
	}
	public char getOperation() {
		return operation;
	}
	public void setOperation(char operation) {
		this.operation = operation;
	}
	public double getResult() {
		return result;
	}
	public void setResult(double result) {
		this.result = result;
	}
	
	public void performOperation() {
		if(operation == '+') {
			setResult(operandOne + operandTwo);
		} else if (operation == '-') {
			setResult(operandOne - operandTwo);
		}
	}
}
