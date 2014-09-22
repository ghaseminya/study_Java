/* Static 변수
 * 
 * StaticCount.java
 * StaticEx01.java
 * 
 */


public class StaticEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StaticCount sc1= new StaticCount();
		System.out.println("c = " + sc1.c + "\t count = " + StaticCount.count);
		System.out.println("sc1 = " + sc1.count);
		System.out.println();
		
		System.out.println("=================================");
		StaticCount sc2= new StaticCount();
		System.out.println("c = " + sc2.c + "\t count = " + StaticCount.count);
		System.out.println("sc2 = " + sc2.count);
		System.out.println();
		
		System.out.println("=================================");
		StaticCount sc3= new StaticCount();
		System.out.println("c = " + sc3.c + "\t count = " + StaticCount.count);
		System.out.println("sc3 = " + sc3.count);

	}

}
