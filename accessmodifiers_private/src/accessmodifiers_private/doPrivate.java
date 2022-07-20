package accessmodifiers_private;
class doPrivate1{
	private int x=100;
}
public class doPrivate {
	public int x= 200;
	public static void main(String[] args) {
		doPrivate obj =new doPrivate();
		System.out.println("I CAN'T ACCESS PRIVATE INTEGER ");
		System.out.println("I CAN ACCESS ONLY PUBLIC INTEGER x = " +obj.x);

	}

}
