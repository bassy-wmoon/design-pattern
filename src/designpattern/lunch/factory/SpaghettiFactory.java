package designpattern.lunch.factory;

import designpattern.lunch.builder.Spaghetti;
import designpattern.lunch.director.ItalianDirector;
import designpattern.lunch.director.LunchDirector;

public class SpaghettiFactory extends LunchFactory {
	@Override
	public LunchDirector getDirector() {
		return new ItalianDirector(new Spaghetti());
	}
}
