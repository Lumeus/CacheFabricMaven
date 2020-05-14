package cacheFabricSpring;

import org.springframework.cache.annotation.Cacheable;

public class Cache implements ICache {

	private ICache down;// Ссылка на уровень ниже
	
	public Cache() { 
		System.out.println("Вызван конструктор TopCache");
		// создаём кэши нижнего уровня
		down = new Fabric();
		System.out.println("Создан Cache");
	}
	
	@Cacheable("secondCache")
	public ISingleton get(String name) {
		System.out.println("Вызван Cache.get()");
		return down.get(name);
	}
		
}
