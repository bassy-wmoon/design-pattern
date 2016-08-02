package designpattern.lunch.director;

import designpattern.lunch.builder.LunchBuilder;

public class RamenDirector implements LunchDirector {
	
	private LunchBuilder builder;

	public RamenDirector(LunchBuilder builder) {
		this.builder = builder;
	}
	
	@Override
	public void lunch() {
		builder.in();
		builder.bill(); // 券売機にお金を入れる
		builder.order(); // ラーメンを選ぶ
		builder.sit();
		builder.eat();
		builder.exit();
	}
}
