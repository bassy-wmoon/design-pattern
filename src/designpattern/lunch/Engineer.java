package designpattern.lunch;

public class Engineer {
	public void goLunch(LunchEnum lunch) {
		LunchTime lunchTime = new LunchTime();
		lunchTime.goLunch(lunch);
	}
}
