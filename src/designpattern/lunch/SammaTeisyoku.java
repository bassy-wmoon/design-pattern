package designpattern.lunch;

public class SammaTeisyoku extends LunchFactory {
	@Override
	public void in() {
		System.out.println("魚定食屋に来ました");
	}
	@Override
	public void bill() {
		System.out.println("レジで850円支払いました");
	}
	@Override
	public void order() {
		System.out.println("さんまの焼き魚定食注文しました");
	}
	@Override
	public void eat() {
		System.out.println("さんま食べました");
	}
	@Override
	public void sit() {
		System.out.println("二人席に通されました");
	}
	@Override
	public void exit() {
		System.out.println("よいお味でした");
	}
}
