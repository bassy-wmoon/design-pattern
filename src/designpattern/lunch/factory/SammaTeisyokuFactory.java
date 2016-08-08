package designpattern.lunch.factory;

import designpattern.lunch.builder.SammaTeisyoku;
import designpattern.lunch.director.LunchDirector;
import designpattern.lunch.director.TeisyokuDirector;

public class SammaTeisyokuFactory extends LunchFactory {
	@Override
	public LunchDirector getDirector() {
		return new TeisyokuDirector(new SammaTeisyoku());
	}
}
