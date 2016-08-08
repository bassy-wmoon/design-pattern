package designpattern.lunch.factory;

import designpattern.lunch.builder.SyougayakiTeisyoku;
import designpattern.lunch.director.LunchDirector;
import designpattern.lunch.director.TeisyokuDirector;

public class SyougayakiTeisyokuFactory extends LunchFactory {
	LunchDirector director = null;
	
	public SyougayakiTeisyokuFactory() {
		director = new TeisyokuDirector(new SyougayakiTeisyoku());
	}
	
	@Override
	public void goLunch() {
		director.lunch();
	}
}
