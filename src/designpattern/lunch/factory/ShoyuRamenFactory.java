package designpattern.lunch.factory;

import designpattern.lunch.builder.ShoyuRamen;
import designpattern.lunch.director.LunchDirector;
import designpattern.lunch.director.RamenAfterPayDirector;

public class ShoyuRamenFactory extends LunchFactory {
	LunchDirector director = null;
	
	public ShoyuRamenFactory() {
		director = new RamenAfterPayDirector(new ShoyuRamen());
	}
	
	@Override
	public void goLunch() {
		director.lunch();
	}
}
