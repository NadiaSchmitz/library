
public class Reader {
	
	int i;
	private String name;
	private String surname;
	private int card_number;
	private String course;
	private String birthday;
	private long phone_number;
	
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
		this.surname = surname;
	}
	
	public int getCardNumber() {
		return card_number;
	}
	
	public void setCardNumber(int card_number) {
		this.card_number = card_number;
	}
	
	public String getCourse() {
		return course;
	}
	
	public void setCourse(String course) {
		this.course = course;
	}
	
	public String getBirthday() {
		return birthday;
	}
	
	public void setBurthday(String birthday) {
		this.birthday = birthday;
	}
	
	public long getPhoneNumber() {
		return phone_number;
	}
	
	public void setPhoneNumber(long phone_number) {
		this.phone_number = phone_number;
	}
	
	public Reader() {
		
	}
	
	public Reader(String name, String surname, int card_number, String course, String birthday, long phone_number) {
		this.name = name;
		this.surname = surname;
		this.card_number = card_number;
		this.course = course;
		this.birthday = birthday;
		this.phone_number = phone_number;
	}
	
	public void takeBook(int card_number, int n) {
		System.out.println(this.name + " " + this.surname + " hat " + n + " Bücher bekommen.");
	}
	
	public void takeBook(int[] index, int card_number, int n, String[] books) {
		System.out.println();
		System.out.println(this.name + " " + this.surname + " hat folgende Bücher bekommen:");
		System.out.printf(" %-12s %-12s %-8s %-8s %-8s %-18s", "Name", "Nachname", "Karte", "Anzahl", "BuchN", "Buch");
		System.out.println();
		for (i = 0; i < n; i++) {
			System.out.printf(" %-12s %-12s %-8s %-8s %-8s %-18s", this.name, this.surname, card_number, n, index[i], books[index[i]]);
			System.out.println();
		}
	}
	
	public void returnBook() {
		
	}

}
