
public class Object {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Object obj = new Object();
		System.out.println(obj);
		
		Object obj2 = (Object) obj.clone();
		System.out.println(obj2);
		
	}

}
