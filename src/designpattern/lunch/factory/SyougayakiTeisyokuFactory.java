package designpattern.lunch.factory;

import designpattern.lunch.builder.SyougayakiTeisyoku;
import designpattern.lunch.director.LunchDirector;
import designpattern.lunch.director.TeisyokuDirector;

public class SyougayakiTeisyokuFactory extends LunchFactory {
	@Override
	public LunchDirector getDirector() {
		return new TeisyokuDirector(new SyougayakiTeisyoku());
	}
}
