package cacheFabricSpring;

import org.springframework.cache.annotation.Cacheable;

public class Fabric implements ICache {
	
	public Fabric() {
		System.out.println("Создан Fabric");
	}
	
	@Cacheable("thirdCache")
	public ISingleton get(String name) {
		System.out.println("Вызван Fabric.get()");
		ISingleton res = null;
		// обращаемся к нужному классу
		switch (name) {
		case("0"):
			res = Singleton_0.get();
			break;
		case("1"):
			res = Singleton_1.get();
			break;
		case("2"):
			res = Singleton_2.get();
			break;
		case("3"):
			res = Singleton_3.get();
			break;
		case("4"):
			res = Singleton_4.get();
			break;
		case("5"):
			res = Singleton_5.get();
			break;
		case("6"):
			res = Singleton_6.get();
			break;
		case("7"):
			res = Singleton_7.get();
			break;
		case("8"):
			res = Singleton_8.get();
			break;
		case("9"):
			res = Singleton_9.get();
			break;
		}
		return res;
	}

}
