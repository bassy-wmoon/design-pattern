package designpattern.fizzbuzz.factory;

import designpattern.fizzbuzz.strategy.Buzz;
import designpattern.fizzbuzz.strategy.Fizz;
import designpattern.fizzbuzz.strategy.FizzBuzz;
import designpattern.fizzbuzz.strategy.NotFizzBuzz;
import designpattern.fizzbuzz.strategy.Strategy;

public class StrategyFactory {
	public static Strategy getStrategy(int i) {
		Strategy st = null;
		if (i % 3 == 0 && i % 5 == 0) {
			st = new FizzBuzz();
		} else if (i % 5 == 0) {
			st = new Buzz();
		} else if (i % 3 == 0) {
			st = new Fizz();
		} else {
			st = new NotFizzBuzz(i);
		}
		return st;
	}
}
