package com.codingdojo.calculatorpt1;

public class TestCalculator {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		calc.setOperandOne(55);
		calc.setOperandTwo(65);
		calc.setOperation('-');
		calc.performOperation();
		System.out.println(calc.getResult());
	}

}
