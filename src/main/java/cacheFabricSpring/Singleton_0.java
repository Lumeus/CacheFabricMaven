package cacheFabricSpring;

import java.io.Serializable;

public class Singleton_0 implements ISingleton, Serializable{

	private static final long serialVersionUID = 1L;
	
	private static Singleton_0 inst = null;
	
	private Singleton_0() {
		//System.out.println("Вызван конструктор Singleton_0");
	}
	// возвращает имя объекта
	public String getName() {
		//System.out.println("Вызван Singleton_0.getName()");
		return "0";
	}
	// получение объекта синглтона
	public static Singleton_0 get() {
		//System.out.println("Вызван Singleton_0.get()");
		if (inst == null) inst = new Singleton_0();
		return inst;
	}

}
