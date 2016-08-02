package designpattern.lunch.director;

import designpattern.lunch.builder.LunchBuilder;

public class TeisyokuDirector implements LunchDirector {

	private LunchBuilder builder;
	
	public TeisyokuDirector(LunchBuilder builder) {
		this.builder = builder;
	}
	
	@Override
	public void lunch() {
		builder.in();
		builder.sit();
		builder.order(); // 注文する
		builder.eat();
		builder.bill(); // レジで支払いをする
		builder.exit();
	}
}
