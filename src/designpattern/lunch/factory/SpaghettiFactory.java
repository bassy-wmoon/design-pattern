package designpattern.lunch.factory;

import designpattern.lunch.builder.Spaghetti;
import designpattern.lunch.director.ItalianDirector;
import designpattern.lunch.director.LunchDirector;

public class SpaghettiFactory extends LunchFactory {
	LunchDirector director = null;
	
	public SpaghettiFactory() {
		director = new ItalianDirector(new Spaghetti());
	}
	
	@Override
	public void goLunch() {
		director.lunch();
	}
}
