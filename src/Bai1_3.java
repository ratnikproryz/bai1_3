import java.util.Scanner;

import javax.xml.transform.Templates;

public class Bai1_3 {
	private int[] arr= {22, 4, 61, 3, 7, 9, 2};
	private int index=0; //luu so phan tu cua mang phu (cau 3)
	
	public Bai1_3() {
		
	}
	public void xuat() {
		System.out.println("Cac phan tu cua mang:");
		for (int i = 0; i <arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println("");
	}
	
	public int tongChan() {
		int tong=0;
		for (int i = 0; i < arr.length; i+=2) {
			tong+= arr[i];
		}
		return tong;
	}
	
	public int viTriThu2(int x) {
		int index=-1;
		int check=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == x && check==1) {
				return i;
			}else if(arr[i] == x) {
				check = 1;
			}
		}
		return index;
	}
	
	public int[] boiCua2() {
		int[] temp = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] %2 ==0) {
				temp[index] = arr[i];
				index++;
			}
		}
		return temp;
		
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Bai1_3 bai1_3 = new Bai1_3();
		bai1_3.xuat();
		System.out.println("Tong cac phan tu o vi tri chan: "+ bai1_3.tongChan());
		System.out.println("Nhap vao 1 so bat ki");
		int x= sc.nextInt();
		if(bai1_3.viTriThu2(x)!=-1) {
			System.out.println("Vi tri xuat hien thu 2 cua "+x+" la: "+bai1_3.viTriThu2(x));
		}else {
			System.out.println("khong tim thay vi tri xuat hien thu 2 cua " + x);
		}
		int[] temp= new int[bai1_3.arr.length];
		temp=  bai1_3.boiCua2();
		System.out.println("Cac phan tu la boi cua 2:");
		for (int i = 0; i < bai1_3.index; i++) {
			System.out.print(temp[i]+" ");
		}
	}
}
