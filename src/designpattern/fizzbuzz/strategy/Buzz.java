package designpattern.fizzbuzz.strategy;

public class Buzz implements Strategy {
	@Override
	public void call() {
		System.out.println("Buzz");
	}
}
