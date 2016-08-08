package designpattern.lunch.factory;

import designpattern.lunch.builder.TonkotsuRamen;
import designpattern.lunch.director.LunchDirector;
import designpattern.lunch.director.RamenDirector;

public class TonkotsuRamenFactory extends LunchFactory {
	@Override
	public LunchDirector getDirector() {
		return new RamenDirector(new TonkotsuRamen());
	}
}
