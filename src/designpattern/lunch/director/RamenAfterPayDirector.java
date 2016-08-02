package designpattern.lunch.director;

import designpattern.lunch.builder.LunchBuilder;

public class RamenAfterPayDirector implements LunchDirector {
	
	private LunchBuilder builder;

	public RamenAfterPayDirector(LunchBuilder builder) {
		this.builder = builder;
	}
	
	@Override
	public void lunch() {
		builder.in();
		builder.sit(); // 席に通される
		builder.order();
		builder.eat();
		builder.bill(); // レジでお会計する
		builder.exit();
	}
}
