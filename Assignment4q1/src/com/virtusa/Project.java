package  com.virtusa;

public class Project implements Comparable  {
	private int pid;
	private String name;
	private String startDate;
	private String endDate;
	private double budget;
	private Manager manager;
	
	public Project(int pid, String name, String startDate, String endDate, double budget, Manager manager) {
		super();
		this.pid = pid;
		this.name = name;
		this.startDate = startDate;
		this.endDate = endDate;
		this.budget = budget;
		this.manager = manager;
	}
	
	public String toString() {
		return "project id=" + pid + "   project name=" + name + "   Start Date=" + startDate + "   End Date=" + endDate+ "  budget: "+budget +" Manager Details:" +manager;
	}

	@Override
	public int compareTo(Object o) {
		if (o instanceof Project) {
			Project p = (Project)o;
			return this.pid - p.pid;
		}
		return 0;
		
		
	}
}

