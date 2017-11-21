
public class Person implements Comparable<Person>{

	private String firstName;
	private String lastName;
	
	
	
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public Person(String s){
		
		int point = s.indexOf(' ');
		
		this.lastName = s.substring(0,point);
		this.firstName = s.substring(point+1);
		
	}

	@Override
	public int compareTo(Person arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
