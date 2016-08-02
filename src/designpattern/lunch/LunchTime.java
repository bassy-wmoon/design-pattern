package designpattern.lunch;

import java.util.Calendar;

public class LunchTime {
	public void goLunch(LunchEnum lunchMenu) {
		LunchFactory lunch = null;
		switch (lunchMenu) {
		case とんこつラーメン:
			lunch = new TonkotsuRamen();
			break;
		case 塩ラーメン:
			lunch = new SioRamen();
			break;
		case 焼き魚定食:
			lunch = new SammaTeisyoku();
			break;
			// ・・・・etc
		}
		lunch.in();
		lunch.sit();
		lunch.order();
		lunch.eat();
		lunch.bill();
		lunch.exit();
		
		Calendar today = Calendar.getInstance();
		if (Calendar.WEDNESDAY == today.get(Calendar.DAY_OF_WEEK)) {
			// マガジン発売日の場合コンビニに立ち寄る
			// マガジンを読む
		}
	}
}
