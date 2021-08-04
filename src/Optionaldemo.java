import java.util.Optional;

public class Optionaldemo {
	public static void main(String[] args) {
		
		Integer[] a= {1,2,3,4,5};
		
		Optional check = Optional.ofNullable(a[4]);
		if(check.isPresent()) {
			Integer num = a[4];
			System.out.println(num);
			
		}else
			System.out.println("number not present");
		
	}
	

}
