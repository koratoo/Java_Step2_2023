package chapter17.arraylist_stack_queue;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class PersonManager {
	
	public void personMgr() {
		int select =0;
		
		Person p;
		
		ArrayList<Person> personArr = new ArrayList<Person>();
		
		while(select != 4) {
			System.out.println("1. 회원추가");
			System.out.println("2. 회원탈퇴");
			System.out.println("3. 회원정보보기");
			System.out.println("4. 종   료");
			System.out.println("항목 선택 : ");
			System.out.println("---------------");
			Scanner scan = new Scanner(System.in);
			select = scan.nextInt();
			
			//if switch
			p=new Person();
			
			
				switch (select) {
				case 1:
					System.out.println("-----[회원 정보를 입력해 주세요.]-----");
					System.out.print("나이 : ");
					p.setAge(scan.nextInt());
					System.out.print("이름 : ");
					p.setName(scan.next());
					System.out.print("전화 : ");
					p.setTel(scan.next());
					personArr.add(p);
					System.out.println("-------회원정보가 등록되었습니다.-------");
					break;
				case 2:
					System.out.println("탈퇴하실 분의 이름을 입력해 주세요.");
					String name = scan.next();
						personArr.remove(name.equals(p.getName()));
						System.out.println("탈퇴가 완료되었습니다.");
				case 3:
					System.out.println("-------[등록 회원 정보]-------");
						for(int i=0; i<personArr.size();i++) {
							System.out.println("나이 : " + personArr.get(i).getAge());
							System.out.println("이름 : " + personArr.get(i).getName());
							System.out.println("전화번호 : " + personArr.get(i).getTel());
							System.out.println("--------------");
						}
					
					break;
				case 4:
					System.out.println("종료됩니다.");
					break;
	
				default:
					break;
				}
			}
			}
		}
	


