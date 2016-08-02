package designpattern.lunch.builder;

public class ShoyuRamen implements LunchBuilder {
	@Override
	public void in() {
		System.out.println("しょうゆラーメン屋に来ましたよ");
	}
	@Override
	public void bill() {
		System.out.println("レジで1000円支払いましたよ");
	}
	@Override
	public void order() {
		System.out.println("しょうゆラーメン注文しましたよ");
	}
	@Override
	public void eat() {
		System.out.println("しょうゆラーメン食べましたよ");
	}
	@Override
	public void sit() {
		System.out.println("相席でした");
	}
	@Override
	public void exit() {
		System.out.println("食べ終わったので帰ります");
	}
}
