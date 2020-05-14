package cacheFabricSpring;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

@Component("cache")
public class TopCache implements ICache {

	private ICache down;// Ссылка на уровень ниже
	
	public TopCache() { 
		System.out.println("Вызван конструктор TopCache");
		// создаём кэши нижнего уровня
		down = new Cache();
		System.out.println("Создан TopCache");
	}
	
	@Cacheable("firstCache")
	public ISingleton get(String name) {
		System.out.println("Вызван TopCache.get()");
		return down.get(name);
	}
		
}