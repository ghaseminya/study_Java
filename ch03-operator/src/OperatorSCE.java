//SCE연산 수행으로 인한 주의 사항
//&&, ||연산자의 오른쪽이 수행되지 않음을 주의

//선조건		&&	후조건	Result
//true		&&	true	true
//true		&&	false	false
//false		&&			false	(후조건 실행안됨)

//선조건		||	후조건	Result
//true		||			true	(후조건 실행안됨)
//false		||	true	true
//false		||	false	false

class OperatorSCE
{
	public static void main(String[] args)
	{
		int num1=0, num2=0;
		boolean result;
		
		// &&연산자
		result = (num1+=10)<0 && (num2+=10)>0;
		//(num1+=10)<0 -> 0+=10<0  -> 10<0 -> false
		//(num2+=10)>0 -> 0+=10>10 -> 10>0 -> true (연산 수행 안됨)
		//false && true
		//SCE연산이 수행됩으로써 오른쪽의(num2+=10)는 연산이 수행되어 지지 않습니다.
		System.out.println("result= "+result);	//result= false
		System.out.println("num1= " + num1 + ", num2= " + num2);	//num1= 10, num2= 0
		
		// ||연산자
		System.out.println("");
		result = (num1+=10)>0 || (num2+=10)>0;
		//(num1+=10)>0 -> (10+=10)>0 -> 20>0 -> true
		//(num2+=10)>0 -> (0+=10)>0  -> 10>0 -> true (연산 수행 안됨)
		// true && true
		System.out.println("result= " + result);	//result= true
		System.out.println("num1= " + num1 + ", num2= " + num2);	//num1= 20, num2= 0
		//SCE연산이 수행됩으로써 오른쪽의 (num2+=10)는 연산이 수행되어 지지 않습니다.
	}
}