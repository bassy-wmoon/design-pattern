package designpattern.lunch.factory;

import designpattern.lunch.builder.SammaTeisyoku;
import designpattern.lunch.director.LunchDirector;
import designpattern.lunch.director.TeisyokuDirector;

public class SammaTeisyokuFactory extends LunchFactory {
	LunchDirector director = null;
	
	public SammaTeisyokuFactory() {
		director = new TeisyokuDirector(new SammaTeisyoku());
	}
	
	@Override
	public void goLunch() {
		director.lunch();
	}
}
