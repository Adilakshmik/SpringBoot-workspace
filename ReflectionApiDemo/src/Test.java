import java.lang.reflect.Field;

public class Test {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchFieldException, SecurityException {
		Class<?> clz=	Class.forName("User");
		Object object=clz.newInstance();
		Field agefield=clz.getDeclaredField("age");
		agefield.setAccessible(true);
		agefield.set(object, 40);
		User u=(User)object;
		int age=u.getage();
		System.out.println("User age:"+age);
		
		
	}

}
