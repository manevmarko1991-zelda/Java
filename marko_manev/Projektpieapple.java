package marko_manev;

public class Projektpieapple {

	public static void main(String[] args) {
	/*	cat.dingdong();
		cat mycat = new cat();
		mycat.name = "fred";
		mycat.age = 5;
		mycat.meow(); 
		cat anothercat = new cat();
		anothercat.name ="strella";
		anothercat.age = 5 ;
		System.out.println(mycat.age);
		*/
		}
	
	
	private static String printName(String name,int number) {
		
		if (number != 5) {
			System.out.println("this guy is awesome");
		}
		else if (name.equals("john")) {
			System.out.println("this guy is ok i guess");
		}
		else {
			System.out.println("i dont know this guy");
		}
		return "my name is "+name;
	}

}
