package cacheFabricSpring;

import java.io.Serializable;

public class Singleton_7 implements ISingleton, Serializable{

	private static final long serialVersionUID = 1L;
	
	private static Singleton_7 inst = null;
	
	private Singleton_7() {
		//System.out.println("Вызван конструктор Singleton_1");
	}
	// возвращает имя объекта
	public String getName() {
		//System.out.println("Вызван Singleton_2.getName()");
		return "7";
	}
	// получение объекта синглтона
	public static Singleton_7 get() {
		//System.out.println("Вызван Singleton_1.get()");
		if (inst == null) inst = new Singleton_7();
		return inst;
	}

}
