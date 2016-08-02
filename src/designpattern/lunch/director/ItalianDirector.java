package designpattern.lunch.director;

import designpattern.lunch.builder.LunchBuilder;

public class ItalianDirector implements LunchDirector {
	
	private LunchBuilder builder;

	public ItalianDirector(LunchBuilder builder) {
		this.builder = builder;
	}
	
	@Override
	public void lunch() {
		builder.in();
		builder.sit();
		builder.order();
		builder.eat();
		builder.bill();
		builder.exit();
	}
}
