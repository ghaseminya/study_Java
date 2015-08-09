
public class AnimalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal a1 = new Animal("비둘기",  18, true);
		
		System.out.println();
		System.out.println("==========================");
		Animal a2 = new Animal();
		a2.setName("사자");
		a2.setAge(20);
		a2.setFly(false);
		a2.getPrint();
	}
}
