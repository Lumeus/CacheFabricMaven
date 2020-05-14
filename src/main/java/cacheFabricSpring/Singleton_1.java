package cacheFabricSpring;

import java.io.Serializable;

public class Singleton_1 implements ISingleton, Serializable{

	private static final long serialVersionUID = 1L;
	
	private static Singleton_1 inst = null;
	
	private Singleton_1() {
		//System.out.println("Вызван конструктор Singleton_1");
	}
	// возвращает имя объекта
	public String getName() {
		//System.out.println("Вызван Singleton_1.getName()");
		return "1";
	}
	// получение объекта синглтона
	public static Singleton_1 get() {
		//System.out.println("Вызван Singleton_1.get()");
		if (inst == null) inst = new Singleton_1();
		return inst;
	}

}
