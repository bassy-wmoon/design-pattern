package designpattern.lunch.factory;

import designpattern.lunch.builder.SioRamen;
import designpattern.lunch.director.LunchDirector;
import designpattern.lunch.director.RamenDirector;

public class SioRamenFactory extends LunchFactory {
	@Override
	public LunchDirector getDirector() {
		return new RamenDirector(new SioRamen());
	}
}
