public class clsSoftware implements ISoftwareLifeCycle
{

	public void Estimation() 
	{
		// TODO Auto-generated method stub
		System.out.println(" Start Estimation ");
	}

	public void Execution() 
	{
		// TODO Auto-generated method stub
		System.out.println(" Start Execution ");
	}

	public void PackagingAndDeployment() 
	{
		// TODO Auto-generated method stub
		System.out.println(" Start Packaging ");
	}

	public void prepareTechnicalSpecifications() {
		// TODO Auto-generated method stub
		System.out.println(" Start Technical Specifications ");
	}

	public void requirementGathering() {
		// TODO Auto-generated method stub
		System.out.println(" Start Requirement Gathering ");
	}

	public void Testing() 
	{
		// TODO Auto-generated method stub
		System.out.println(" Start Testing ");
	}
	
	public void startProject()
	{
		requirementGathering();
		Estimation();
		prepareTechnicalSpecifications();
		Execution();
		Testing();
		PackagingAndDeployment();
	}
	
}
