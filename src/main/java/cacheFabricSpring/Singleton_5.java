package cacheFabricSpring;

import java.io.Serializable;

public class Singleton_5 implements ISingleton, Serializable{

	private static final long serialVersionUID = 1L;
	
	private static Singleton_5 inst = null;
	
	private Singleton_5() {
		//System.out.println("Вызван конструктор Singleton_1");
	}
	// возвращает имя объекта
	public String getName() {
		//System.out.println("Вызван Singleton_2.getName()");
		return "5";
	}
	// получение объекта синглтона
	public static Singleton_5 get() {
		//System.out.println("Вызван Singleton_1.get()");
		if (inst == null) inst = new Singleton_5();
		return inst;
	}

}
