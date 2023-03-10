

class emp{
	 final int id;

	public emp(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		id = this.id;
	}
	
	
}
public class FinalTest {
public static void main(String[] args) {
	emp e = new emp(21);
	//e.id = 21;
}
}
