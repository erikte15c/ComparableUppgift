
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
	public int compareTo(Person p) {
		if(this.lastName.compareTo(p.lastName) == 0){
			return this.firstName.compareTo(p.firstName);
		}
		else{
			return this.lastName.compareTo(p.lastName);
		}
	}
	
}
