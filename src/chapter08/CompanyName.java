package chapter08;

public class CompanyName {

	public static void main(String[] args) {
		//heap(老馆利牢 按眉 积己)
		Company company1 = new Company();
		Company company2 = new Company();
		
		System.out.println(company1);		
		System.out.println(company2);
		
		System.out.println("---------singleton-------");
		//Data康开
		Company myCompany1 = Company.getInstance();
		Company myCompany2 = Company.getInstance();

		System.out.println(myCompany1);			
		System.out.println(myCompany2);	
		
		
	}
	
}
