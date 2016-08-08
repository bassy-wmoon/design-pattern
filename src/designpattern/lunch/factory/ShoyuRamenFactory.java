package designpattern.lunch.factory;

import designpattern.lunch.builder.ShoyuRamen;
import designpattern.lunch.director.LunchDirector;
import designpattern.lunch.director.RamenAfterPayDirector;

public class ShoyuRamenFactory extends LunchFactory {
	@Override
	public LunchDirector getDirector() {
		return new RamenAfterPayDirector(new ShoyuRamen());
	}
}
