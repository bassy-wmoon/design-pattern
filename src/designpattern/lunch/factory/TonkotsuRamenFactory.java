package designpattern.lunch.factory;

import designpattern.lunch.builder.TonkotsuRamen;
import designpattern.lunch.director.LunchDirector;
import designpattern.lunch.director.RamenDirector;

public class TonkotsuRamenFactory extends LunchFactory {
	LunchDirector director = null;
	
	public TonkotsuRamenFactory() {
		director = new RamenDirector(new TonkotsuRamen());
	}
	
	@Override
	public void goLunch() {
		director.lunch();
	}
}
