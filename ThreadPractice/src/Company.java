
public class Company {

	public int companid;
	public String company_name;
	public String company_branch;
	public Company() {
	}
	public int getCompanid() {
		return companid;
	}
	public void setCompanid(int companid) {
		this.companid = companid;
	}
	public String getCompany_name() {
		return company_name;
	}
	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}
	public String getCompany_branch() {
		return company_branch;
	}
	public void setCompany_branch(String company_branch) {
		this.company_branch = company_branch;
	}
	@Override
	public String toString() {
		return "Company [companid=" + companid + ", company_name=" + company_name + ", company_branch=" + company_branch
				+ "]";
	}
	
	
	
	 class Company2 implements Runnable{
		 public Company compnay2;
		 
		public Company2(Company compnay2) {
			this.compnay2 = compnay2;
		}

		@Override
		public void run() {
			compnay2.getClass();
		}
		 
	 }
	
}
