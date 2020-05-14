package cacheFabricSpring;

import java.io.Serializable;

public class Singleton_6 implements ISingleton, Serializable{

	private static final long serialVersionUID = 1L;
	
	private static Singleton_6 inst = null;
	
	private Singleton_6() {
		//System.out.println("Вызван конструктор Singleton_1");
	}
	// возвращает имя объекта
	public String getName() {
		//System.out.println("Вызван Singleton_2.getName()");
		return "6";
	}
	// получение объекта синглтона
	public static Singleton_6 get() {
		//System.out.println("Вызван Singleton_1.get()");
		if (inst == null) inst = new Singleton_6();
		return inst;
	}

}
