package designpattern.fizzbuzz.strategy;

public class FizzBuzz implements Strategy {
	@Override
	public void call() {
		System.out.println("FizzBuzz");
	}
}
