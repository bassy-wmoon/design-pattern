package designpattern.lunch;

public abstract class LunchFactory {
	/** 店に入る */
	abstract public void in();
	/** 支払いをする */
	abstract public void bill();
	/** 注文をする */
	abstract public void order();
	/** 食べる */
	abstract public void eat();
	/** 席に座る */
	abstract public void sit();
	/** 店を出る */
	abstract public void exit();
}