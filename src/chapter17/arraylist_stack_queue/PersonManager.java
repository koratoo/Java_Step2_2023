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
			System.out.println("1. ȸ���߰�");
			System.out.println("2. ȸ��Ż��");
			System.out.println("3. ȸ����������");
			System.out.println("4. ��   ��");
			System.out.println("�׸� ���� : ");
			System.out.println("---------------");
			Scanner scan = new Scanner(System.in);
			select = scan.nextInt();
			
			//if switch
			p=new Person();
			
			
				switch (select) {
				case 1:
					System.out.println("-----[ȸ�� ������ �Է��� �ּ���.]-----");
					System.out.print("���� : ");
					p.setAge(scan.nextInt());
					System.out.print("�̸� : ");
					p.setName(scan.next());
					System.out.print("��ȭ : ");
					p.setTel(scan.next());
					personArr.add(p);
					System.out.println("-------ȸ�������� ��ϵǾ����ϴ�.-------");
					break;
				case 2:
					System.out.println("Ż���Ͻ� ���� �̸��� �Է��� �ּ���.");
					String name = scan.next();
						personArr.remove(name.equals(p.getName()));
						System.out.println("Ż�� �Ϸ�Ǿ����ϴ�.");
				case 3:
					System.out.println("-------[��� ȸ�� ����]-------");
						for(int i=0; i<personArr.size();i++) {
							System.out.println("���� : " + personArr.get(i).getAge());
							System.out.println("�̸� : " + personArr.get(i).getName());
							System.out.println("��ȭ��ȣ : " + personArr.get(i).getTel());
							System.out.println("--------------");
						}
					
					break;
				case 4:
					System.out.println("����˴ϴ�.");
					break;
	
				default:
					break;
				}
			}
			}
		}
	


