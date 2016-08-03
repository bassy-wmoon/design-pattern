package designpattern.fizzbuzz.strategy;

public class Fizz implements Strategy {
	@Override
	public void call() {
		System.out.println("Fizz");
	}
}
