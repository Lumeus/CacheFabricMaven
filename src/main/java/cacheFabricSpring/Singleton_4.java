package cacheFabricSpring;

import java.io.Serializable;

public class Singleton_4 implements ISingleton, Serializable{

	private static final long serialVersionUID = 1L;
	
	private static Singleton_4 inst = null;
	
	private Singleton_4() {
		//System.out.println("Вызван конструктор Singleton_1");
	}
	// возвращает имя объекта
	public String getName() {
		//System.out.println("Вызван Singleton_2.getName()");
		return "4";
	}
	// получение объекта синглтона
	public static Singleton_4 get() {
		//System.out.println("Вызван Singleton_1.get()");
		if (inst == null) inst = new Singleton_4();
		return inst;
	}

}
