package assignment;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AdminDepartment ad=new AdminDepartment();
		SuperDepartment sd=new SuperDepartment();
         HrDepartment hr=new HrDepartment();
		TechDepartment td=new TechDepartment();
		
		System.out.println(ad.departmentName());
		System.out.println(ad.getTodaysWork());
		System.out.println(ad.getWorkDeadline());
		System.out.println(sd.isTodayAHoliday());
	System.out.println("Welcome to HR Department");
		System.out.println(hr.doActivity());
		System.out.println(hr.getTodaysWork());
		System.out.println(hr.getWorkDeadline());
		System.out.println(sd.isTodayAHoliday());
System.out.println("Welcome to Tech Department");
		System.out.println(td.getTodaysWork());
		System.out.println(td.getWorkDeadline());
		System.out.println(td.getTechStackInformation());
		System.out.println(sd.isTodayAHoliday());
		
		
		 
	   ;
	}
}
