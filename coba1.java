public class coba1{
	int a; double b;

	//constuctor default
	public coba1(){
	a = 100;
	b = 3.14;
	}

	//constructor parameter
	public coba1(int x){
	a = x;
	}

public static void main(String[] args){
	coba1 Coba1 = new coba1();
	coba1 Coba2 = new coba1(50);

	System.out.println(Coba1.a);
	System.out.println(Coba1.b);
	System.out.println(Coba2.a);
	}
}