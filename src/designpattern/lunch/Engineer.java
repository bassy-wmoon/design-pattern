package designpattern.lunch;

import designpattern.lunch.enums.LunchEnum;

public class Engineer {
	public void goLunch(LunchEnum lunch) {
		LunchTime lunchTime = new LunchTime();
		lunchTime.goLunch(lunch);
	}
}
