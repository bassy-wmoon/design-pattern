package designpattern.lunch;

import java.util.Calendar;

public class LunchTime {
	public void goLunch(LunchEnum lunch) {
		switch (lunch) {
		case とんこつラーメン:
			// ラーメン屋に入る
			// 食券を買う
			// 席に座る
			// 食べる
			// 店を出る
			break;
		case 塩ラーメン:
			// ラーメン屋に入る
			// 食券を買う
			// 席に座る
			// 食べる
			// 支払いをする
			// 店を出る
			break;
		case 焼き魚定食:
			// 定食屋に入る
			// 食券を買う
			// 席に座る
			// 食べる
			// 店を出る
			break;
			// ・・・・etc
		}
		
		Calendar today = Calendar.getInstance();
		if (Calendar.WEDNESDAY == today.get(Calendar.DAY_OF_WEEK)) {
			// マガジン発売日の場合コンビニに立ち寄る
			// マガジンを読む
		}
	}
}
