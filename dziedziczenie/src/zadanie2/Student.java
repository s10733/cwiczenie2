package zadanie2;

public class Student extends Person  {

	
	private String indexNR;
	public String setName;
	
	
	@Override
	protected String showDetails() {
	String detalis;
	detalis =" Numer indeksu:  " + this.indexNR;
	return detalis;
	
	}
	
		public void SetIndexNr(String index)
	{
		this.indexNR =index;
	}




		
	
	
}
