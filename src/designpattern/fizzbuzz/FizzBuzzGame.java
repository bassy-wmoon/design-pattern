package designpattern.fizzbuzz;

import designpattern.fizzbuzz.factory.StrategyFactory;
import designpattern.fizzbuzz.strategy.Strategy;

public class FizzBuzzGame {
	public void playFizzBuzz() {
		for (int i = 1; i < 40; i++) {
			Strategy st = StrategyFactory.getStrategy(i);
			st.call();
		}
	}
}
