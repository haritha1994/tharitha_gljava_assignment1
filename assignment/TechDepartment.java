package assignment;

public class TechDepartment extends SuperDepartment{
	
	
	@Override
	public String departmentName()
	{
		
		String departmentName="Tech Department";
		
		return departmentName;
	} 
	
	@Override
	public String getTodaysWork()
	{
		
		String getTodaysWork="Complete coding of module 1";
		
		return getTodaysWork;
	} 
	
	@Override
	public String getWorkDeadline()
	{
		
		String getWorkDeadline="Complete by EOD";
		
		return getWorkDeadline;
	} 
	
	public String getTechStackInformation()
	{
		
		String getTechStackInformation="core Java";
		
		return getTechStackInformation;
	} 
	

}
