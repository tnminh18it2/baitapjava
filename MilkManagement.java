package Text;
import java.text.SimpleDateFormat;
import java.util.Enumeration;
import java.util.Scanner;
import java.util.Vector;
public class MilkManagement {
	Vector list = new Vector();
	public MilkManagement() {
		while(true) {
			System.out.println("Quan ly Sua");
			System.out.println("1. Nhap Sua");
			System.out.println("2. Xem Sua");
			int n;
			Scanner key = new Scanner(System.in);
			System.out.println("Moi ban chon chuc nang:");
			n = key.nextInt();
			switch(n) {
				case 1: NhapTT();
					break;
				case 2: InTT();
					break;
			}
		}
	}
	public void NhapTT() {
		Scanner key = new Scanner(System.in);
		int n;
		System.out.println("Nhap so luong sua=");
		n =Integer.parseInt(key.nextLine());
		for(int i=0;i<n;i++) {
			System.out.println("Nhap ma sua=");
			String masua=key.nextLine();
			System.out.println("Nhap ten sua");
			String tensua=key.nextLine();
			System.out.println("Nhap so luong");
			int sl=Integer.parseInt(key.nextLine());
			System.out.println("Nam san xuat");
			SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd");
			String namSX=key.nextLine();	
			Milks m = new Milks(masua,tensua,sl,namSX);
			list.add(m);
		}	
		
	}
	public void InTT() {
		Enumeration eMilk = list.elements();
		int i=1;
		while(eMilk.hasMoreElements()) {
			Milks milk = (Milks)eMilk.nextElement();
			System.out.println("Ma Sua ="+milk.getMasua()+" va ten sua la "+milk.getTensua());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MilkManagement obj = new MilkManagement();
		obj.NhapTT();
		obj.InTT();
	}


}




	