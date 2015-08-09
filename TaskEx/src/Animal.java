
public class Animal {
	
	private String name;
	private int age;
	private boolean fly;
	
	public Animal(){}
	
	public Animal(String name, int age, boolean fly){
		this.name = name;
		this.age = age;
		this.fly = fly;
		
		getPrint();	
	}
	
	
	
	public void setName(String name){
		this.name = name;		
	}
	
	public void setAge(int age){
		this.age = age;
	}
	
	public boolean isFly(){
		return fly;
	}
	
	public void setFly(boolean fly){
		this.fly = fly;
	}
	
	public void getPrint()
	{
		System.out.println("이름" + "\t:" + this.name);
		System.out.println("나이" + "\t:" + this.age);
		System.out.println("비행여부" + "\t:" + (isFly() ? "새다": "닭이다"));
		
		/*if(this.fly != false){
			System.out.println("비행여부" + "\t:" + "새다");			
		}
		else{
			System.out.println("비행여부" + "\t:" + "닭이다");
		}*/
	}	

}
