package designpattern.lunch;

import java.util.Calendar;

import designpattern.lunch.enums.LunchEnum;
import designpattern.lunch.factory.LunchFactory;

public class LunchTime {
	public void goLunch(LunchEnum lunchMenu) {
		
		LunchFactory factory = LunchFactory.getFactory();
		factory.goLunch(lunchMenu);
		
		Calendar today = Calendar.getInstance();
		if (Calendar.WEDNESDAY == today.get(Calendar.DAY_OF_WEEK)) {
			// マガジン発売日の場合コンビニに立ち寄る
			// マガジンを読む
		}
	}
}
