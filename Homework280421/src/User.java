
//All students and instructors are user
public class User {
	
	//fields
	private int id;
	private String name;
	private String surname;
	private String nationalIdentity;
	private int tuitionFee;
	private String tamAdSoyad;
	
	//constructor
	public User() {
		
	}
	
	public User(int id, String name, String surname, String nationalIdentity) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.nationalIdentity = nationalIdentity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname.toUpperCase();
	}

	
	public String getNationalIdentity() {
		return nationalIdentity;
	}

	public void setNationalIdentity(String nationalIdentity) {
		this.nationalIdentity = nationalIdentity;
	}


	

	public String getTamAdSoyad() {
		return this.name+" "+this.surname ;
	}

	
	
}
