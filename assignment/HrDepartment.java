package assignment;

public class HrDepartment extends SuperDepartment{
	
	

	@Override
	public String departmentName()
	{
		
		String departmentName="Hr Department";
		
		return departmentName;
	} 
	
	@Override
	public String getTodaysWork()
	{
		
		String getTodaysWork="Fill today’s timesheet and mark your attendance";
		
		return getTodaysWork;
	} 
	
	@Override
	public String getWorkDeadline()
	{
		
		String getWorkDeadline="Complete by EOD";
		
		return getWorkDeadline;
	} 
	
	
	
	public String doActivity()
	{
		
		String doActivity="team Lunch";
		
		return doActivity;
	} 


}
