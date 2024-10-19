package kalkulator;

public class Calculator {
	private double state = 0;

	public double getState() {
		return state;
	}

	public void setState(double state) {
		this.state = state;
	}

	public void add(double value){
		state += value;
	}

	public void substract(double value){
		state -= value;
	}

	public void mult(double value){
		state *= value;
	}

	public void divide(double value){
		if (value != 0) {
			state /= value;
		}
		else {
			System.out.println("You cannot divide by 0");
		}

	}

}
