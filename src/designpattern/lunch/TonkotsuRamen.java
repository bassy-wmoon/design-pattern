package designpattern.lunch;

public class TonkotsuRamen extends LunchFactory {
	@Override
	public void in() {
		System.out.println("とんこつラーメン屋に入ったで");
	}
	@Override
	public void bill() {
		System.out.println("券売機に700円入れたで");
	}
	@Override
	public void order() {
		System.out.println("券売機でとんこつラーメン押したで");
	}
	@Override
	public void eat() {
		System.out.println("ラーメン食べたで");
	}
	@Override
	public void sit() {
		System.out.println("テーブル席に座ったで");
	}
	@Override
	public void exit() {
		System.out.println("大将！ごちそうさん！");
	}
}
