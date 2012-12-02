package il.ac.shenkar.ToDo;

public class ItemDetails {

	private String text ;
	
	public ItemDetails(String text)
	{
		super();
		this.text = text;
	}

	public void setName(String text) {
		
		this.text = text;
	}
	
	public String getName() {
		
		return text;
	}
	
}
