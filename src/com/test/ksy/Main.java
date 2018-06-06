package com.test.ksy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
// Main Class 
public class Main {
	static Permanent p = new Permanent();
	static Temporary t = new Temporary();
	static Scanner scan;
	public static void main(String[] args){
		scan = new Scanner(System.in);
		String Mmode,Smode = "";
		FileWriter out = null;
		try{
		while(true){
			System.out.print("종료[1], 쓰기[2] , 읽기[3], 초기화[4] : ");
			Mmode = scan.next();
			if(Mmode.equals("1")){
				System.out.println("종료합니다.");
				break;
			}else if(Mmode.equals("2")){
			 out = new FileWriter("manage.txt", true);
					System.out.print("고용형태 [p],[t] : ");
					Smode = scan.next();
					if(Smode.equals("p")){
						Permanent();
						while(true){
						System.out.print("저장하시겠습니까? [y],[n] :");
						if(scan.next().equals("y")){
							out.append("[정규직]" + "\n");
							out.append("이름 : " + p.getName() + "\n");
							out.append("급여 : " + p.getPay() + "\n");
							System.out.println("저장완료.");
							out.flush();
							out.close();
							break;
						}else if(scan.next().equals("n")){
							System.out.println("이용해주셔셔 감사합니다.");
							out.close();
							break;
						}else{
							System.out.println("[y] 또는 [n] 만 입력해주세요.");	
						}
						}
					}else if(Smode.equals("t")){
						Temporary();
						while(true){
							System.out.print("저장하시겠습니까? [y],[n] : ");
						if(scan.next().equals("y")){
							out.append("[임시직]" + "\n");
							out.append("이름 : " + t.getName() + "\n");
							out.append("급여 : " + t.getPay() + "\n");
							out.append("연락처 : " + t.getPhone() + "\n");
							System.out.println("저장완료.");
							out.flush();
							out.close();
							break;
						}else if(scan.next().equals("n")){
							System.out.println("이용해주셔서 감사합니다.");
							out.close();
							break;
						}else{
							System.out.println("[y] 또는 [n]만 입력해주세요.");
						}
						}
					}else{
						System.out.println("그런 고용형태는 존재하지 않습니다.");
					}
		}else if(Mmode.equals("3")){
				System.out.println("==================================");
				BufferedReader in = new BufferedReader(new FileReader("manage.txt"));
				String data = null;
				while((data = in.readLine()) != null) {
					System.out.println(data);
				}
				System.out.println("==================================");
				in.close();
		}else if(Mmode.equals("4")){
				out = new FileWriter("manage.txt");
				out.write("");
				out.close();
		}else{
			System.out.println("[1],[2],[3],[4] 항목 중 하나만 입력하여 주세요.");
		}
		}
		}catch(Exception e){
			e.printStackTrace();
		}
		}
			
	
	 static void Temporary(){
		 System.out.println("이름,근무시간,시급,연락처를 입력해주세.");
			System.out.print("이름 : ");
			t.setName(scan.next());
			System.out.print("근무시간 : ");
			t.setTime(scan.nextInt());
			System.out.print("시급 : ");
			t.setPay(scan.nextInt());
			System.out.print("연락처 : ");
			t.setPhone(scan.next());
			System.out.println("==================================");
			System.out.println("고용형태 : 임시직");
			System.out.println("이름 : " + t.getName());
			System.out.println("급여 : " + t.getPay());
	}
	 
	 static void Permanent(){
		 	System.out.println("이름 기본급 보너스,연락처를 입력해주세요.");
			System.out.print("이름 : ");
			p.setName(scan.next());
			System.out.print("기본급 : ");
			p.setSalary(scan.nextInt());
			System.out.print("보너스 : ");
			p.setBonus(scan.nextInt());
			System.out.print("연락처 : ");
			p.setPhone(scan.next());
			System.out.println("==================================");
			System.out.println("고용형태 : 정규직 ");
			System.out.println("이름 : " + p.getName());
			System.out.println("급여 : " + p.getPay());

	 }
	
}
