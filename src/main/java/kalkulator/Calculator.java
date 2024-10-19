package kalkulator;

public class Calculator {
	private double state = 0;
	private double Mem_state = 0;

	public double getState() {
		return state;
	}

	public void setState(double state) {
		this.state = state;
	}

	public void add(double value){
		this.state += value;
	}

	public void substract(double value){
		this.state -= value;
	}

	public void mult(double value){
		this.state *= value;
	}

	public void divide(double value){
		if (value != 0) {
			this.state /= value;
		}
		else {
			System.out.println("You cannot divide by 0");
		}
	}
	public void memorise(double value){
		this.Mem_state = getState();
	}
	public double getMemory(){
		return Mem_state;
	}
	public void setStatefromMemory(){
		this.state = getMemory();
	}
}
