package designpattern.lunch;

public class Spaghetti extends LunchFactory {
	@Override
	public void in() {
		System.out.println("話題のイタリアンに来ました！");
	}
	@Override
	public void bill() {
		System.out.println("1000円ポッキリお支払い！");
	}
	@Override
	public void order() {
		System.out.println("スパゲッティお願いします！");
	}
	@Override
	public void eat() {
		System.out.println("アルデンテで美味しい！");
	}
	@Override
	public void sit() {
		System.out.println("4人がけのテーブル席ですねえ！");
	}
	@Override
	public void exit() {
		System.out.println("ごちそうさまでした！");
	}
}
