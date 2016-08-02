package designpattern.lunch.builder;

public interface LunchBuilder {
	/** 店に入る */
	public void in();
	/** 支払いをする */
	public void bill();
	/** 注文をする */
	public void order();
	/** 食べる */
	public void eat();
	/** 席に座る */
	public void sit();
	/** 店を出る */
	public void exit();
}
