package designpattern.lunch;

public class SioRamen extends LunchFactory {
	@Override
	public void in() {
		System.out.println("塩ラーメン屋に入ったった");
	}
	@Override
	public void bill() {
		System.out.println("券売機に800円入れたった");
	}
	@Override
	public void order() {
		System.out.println("券売機で塩ラーメン押したった");
	}
	@Override
	public void eat() {
		System.out.println("塩ラーメン食べたった");
	}
	@Override
	public void sit() {
		System.out.println("カウンター席に座ったがな");
	}
	@Override
	public void exit() {
		System.out.println("ごちそうさんでした");
	}
}
