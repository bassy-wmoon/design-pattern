package designpattern.lunch.builder;

public class SyougayakiTeisyoku implements LunchBuilder {
	@Override
	public void in() {
		System.out.println("定食屋に来ました");
	}
	@Override
	public void bill() {
		System.out.println("レジで750円支払いました");
	}
	@Override
	public void order() {
		System.out.println("生姜焼き定食注文しました");
	}
	@Override
	public void eat() {
		System.out.println("生姜焼き食べてビタミン補給");
	}
	@Override
	public void sit() {
		System.out.println("4人席で相席でした");
	}
	@Override
	public void exit() {
		System.out.println("ごちそうさま！お腹いっぱい！");
	}
}
