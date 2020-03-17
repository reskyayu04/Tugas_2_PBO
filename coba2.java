public class coba2{
	int totaldetik, detiksekarang, totalmenit, menitsekarang, totaljam, jamsekarang;

	public coba2(){
		totaldetik = 1203183086;
		detiksekarang = totaldetik%60;
		totalmenit = totaldetik/60;
		menitsekarang = totalmenit%60;
		totaljam = totalmenit/60;
		jamsekarang = totaljam%24;
	}

	public static void main(String[] args){
	coba2 cb1 = new coba2();

	System.out.println((cb1.jamsekarang)+" : "+(cb1.menitsekarang)+" : "+(cb1.detiksekarang));
	}

}