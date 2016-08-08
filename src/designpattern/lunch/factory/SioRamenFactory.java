package designpattern.lunch.factory;

import designpattern.lunch.builder.SioRamen;
import designpattern.lunch.director.LunchDirector;
import designpattern.lunch.director.RamenDirector;

public class SioRamenFactory extends LunchFactory {
	LunchDirector director = null;
	
	public SioRamenFactory() {
		director = new RamenDirector(new SioRamen());
	}
	
	@Override
	public void goLunch() {
		director.lunch();
	}
}
