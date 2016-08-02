package designpattern.lunch.factory;

import designpattern.lunch.builder.SammaTeisyoku;
import designpattern.lunch.builder.TonkotsuRamen;
import designpattern.lunch.director.LunchDirector;
import designpattern.lunch.director.RamenDirector;
import designpattern.lunch.director.TeisyokuDirector;
import designpattern.lunch.enums.LunchEnum;

public class ConcreteLunchFactory extends LunchFactory {

	@Override
	public void goLunch(LunchEnum lunchMenu) {
		// ディレクターを作る
		LunchDirector director = null;
		switch (lunchMenu) {
		case とんこつラーメン:
			director = new RamenDirector(new TonkotsuRamen());
			break;
		case 塩ラーメン:
			director = new RamenDirector(new TonkotsuRamen());
			break;
		case 焼き魚定食:
			director = new TeisyokuDirector(new SammaTeisyoku());
			break;
			// ・・・etc
		}
		// ランチ実施
		director.lunch();
	}
}
