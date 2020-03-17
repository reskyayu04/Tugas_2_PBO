public class tugas2{
	String nama, stambuk, jurusan, fakultas;

	public tugas2(){
		nama = "RESKY AYU DEWI TALASARI";
		stambuk = "13020180128";
		jurusan = "Teknik Informatika";
		fakultas = "Ilmu Komputer";
	}

	public static void main(String[] args){
		tugas2 biodata = new tugas2();

		System.out.println("Nama	= " +(biodata.nama));
		System.out.println("Stambuk	= " +(biodata.stambuk));
		System.out.println("Jurusan	= " +(biodata.jurusan));
		System.out.println("Fakultas	= " +(biodata.fakultas));
	}

}