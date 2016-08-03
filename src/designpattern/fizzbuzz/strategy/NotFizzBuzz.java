package designpattern.fizzbuzz.strategy;

public class NotFizzBuzz implements Strategy {
	int i;
	public NotFizzBuzz(int i) {
		this.i = i;
	}
	@Override
	public void call() {
		System.out.println(i);
	}
}
