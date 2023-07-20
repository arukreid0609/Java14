
public class Main {
	public static void main(String[] args) {
		Hero h = new Hero();
		h.name = "佐々木";
		Hero h2 = new Hero();
		h2.name = "佐々木";
		
		System.out.println(h.equals(h2));
		
		Object o = new Hero();
	}
}
