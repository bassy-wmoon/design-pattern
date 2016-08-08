package designpattern.lunch.factory;

import designpattern.lunch.enums.LunchEnum;

public abstract class LunchFactory {

	public static LunchFactory getFactory(LunchEnum lunchMenu) {
		return createFactory(lunchMenu);
	}
	
	abstract public void goLunch();
	
	private static LunchFactory createFactory(LunchEnum lunchMenu) {
		LunchFactory lunch = null;
		
		switch (lunchMenu) {
		case とんこつラーメン:
			lunch = new TonkotsuRamenFactory();
			break;
		case 塩ラーメン:
			lunch = new SioRamenFactory();
			break;
		case しょうゆラーメン:
			lunch = new ShoyuRamenFactory();
			break;
		case 焼き魚定食:
			lunch = new SammaTeisyokuFactory();
			break;
		case 生姜焼き定食:
			lunch = new SyougayakiTeisyokuFactory();
			break;
		case スパゲッティ:
			lunch = new SpaghettiFactory();
			break;
		}
		return lunch;
	}
}