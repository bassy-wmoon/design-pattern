package designpattern.lunch.factory;

import designpattern.lunch.enums.LunchEnum;

public abstract class LunchFactory {

	public static LunchFactory getFactory() {
		return new ConcreteLunchFactory();
	}
	abstract public void goLunch(LunchEnum lunchMenu);
}