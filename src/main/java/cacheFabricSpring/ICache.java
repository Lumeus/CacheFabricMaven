package cacheFabricSpring;

public interface ICache {

	ISingleton get(String name); // получение объекта по имени
	
}
