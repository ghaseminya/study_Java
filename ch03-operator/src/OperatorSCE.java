/*
SCE연산 수행으로 인한 주의 사항
&&, ||연산자의 오른쪽이 수행되지 않음을 주의

*/
class OperatorSCE
{
	public static void main(String[] args)
	{
		int num1=0, num2=0;
		boolean result;
		
		result = (num1+=10)<0 && (num2+=10)>0;
		//(num1+=10)<0 -> 10<0 -> false
		//(num2+=10)>0 -> 10>0 -> true
		// false && true
		//SCE연산이 수행됩으로써 오른쪽의(num2+=10)는 연산이 수행되어 지지 않습니다.
		System.out.println("result= "+result);
		System.out.println("num1= " + num1 + ", num2= " + num2);
		
		
		System.out.println("");
		result = (num1+=10)>0 || (num2+=10)>0;
		//(num1+=10)>0 -> 10>0 -> true
		//(num2+=10)>0 -> 10>0 -> true
		// false && true
		System.out.println("result= " + result);
		System.out.println("num1= " + num1 + ", num2= " + num2);
		//SCE연산이 수행됩으로써 오른쪽의 (num2+=10)는 연산이 수행되어 지지 않습니다.
	}
}