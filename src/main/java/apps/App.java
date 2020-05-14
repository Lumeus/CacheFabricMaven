package apps;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import cacheFabricSpring.ICache;
import cacheFabricSpring.ISingleton;
//import cacheFabricSpring.TopCache;
import cacheFabricSpring.BeanCacheConfig;

public class App {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanCacheConfig.class);
		ICache cache = (ICache)ctx.getBean("cache");

		ISingleton a = cache.get("0");
		ISingleton b = cache.get("1");
		ISingleton c = cache.get("2");
		a = cache.get("3");
		b = cache.get("4");
		c = cache.get("5");
		a = cache.get("6");
		b = cache.get("7");
		c = cache.get("8");
		a = cache.get("9");
		b = cache.get("1");
		c = cache.get("0");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		a = cache.get("1");
		b = cache.get("1");
		c = cache.get("0");
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		a = cache.get("1");
		b = cache.get("1");
		c = cache.get("0");
		
		
		ctx.close();
	}

}
