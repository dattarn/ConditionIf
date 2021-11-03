package basic.dev;
import java.util.*;
public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner sc = new Scanner(System.in);
 
 //9.1 
 System.out.print("Nhap vao so nguyen: ");
 int x = sc.nextInt();
 if(x>0){
	 System.out.println("So vua nhap la so nguyen duong");
 }
 if(x<0){
	 System.out.println("So vua nhap la so nguyen am");
 }
 
 //9.2
 System.out.print("nhap vao so nguyen n: ");
 int n = sc.nextInt();
 if(n%3==0) {
	 System.out.println("so nguyen vua nhap chia het cho 3");
 }else {
	 System.out.println("so nguyen vua nhap khong chia het cho 3");
 }
 if(n%5==0) {
	 System.out.println("so nguyen vua nhap chia het cho 5");
 }else {
	 System.out.println("so nguyen vua nhap khong chia het cho 5");
 }
 
 //9.3
 System.out.print("nhap vao thang trong nam: ");
 int z = sc.nextInt();
 if(z==1||z==3||z==5||z==7||z==8||z==10||z==12) {
	 System.out.println("thang vua nhap co 31 ngay");
 }else if(n==4||n==6||n==9||n==11){
	 System.out.println("thang vua nhap co 30 ngay");
 }else if(n==2) {
	 System.out.println("thang vua nhap co 28 ngay");
 }
 
 //9.4
 System.out.print("nhap vao a= ");
 int a = sc.nextInt();
 System.out.print("nhap vao b= ");
 int b = sc.nextInt();
 System.out.print("nhap vao c= ");
 int c = sc.nextInt();
 float delta = sqrt(b)-4*a*c ;
  if(delta<0) {
	  System.out.println("phuong trinh vo nghiem");
  }
  if(delta==0) {
	   x = -(b/2*a);
	  System.out.println("phuong trinh co nghiem kep = " + x);
  }
  if(delta>0) {
	  System.out.println("phuong trinh co 2 nghiem phan biet");
  }
  
  
  //9.5
  System.out.print("nhap vao canh a= ");
  int ca = sc.nextInt();
  System.out.print("nhap vao canh b= ");
  int cb = sc.nextInt();
  System.out.print("nhap vao canh c= ");
  int cc = sc.nextInt();
  if((ca+cb)>cc&&(cb+cc)>ca&&(cc+ca)>cb){
	  System.out.print("3 canh vua nhap tao thanh tam giac");
  }else {
	  System.out.println("3 canh vua nhap khong tao thanh tam giac");
  }
 
	}

	private static int sqrt(int b) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	}

	
	

	


	




