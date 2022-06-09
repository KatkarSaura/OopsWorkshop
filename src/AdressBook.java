import java.util.Scanner;
public class AdressBook {
	
	Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		class Entry{
		
		private String firstname;
		private String lastname;
		private String address;
		private String City;
		private String email;
		private int id;
		Entry(String first, String last, String address, String email, String City, int id){
			this.firstname = firstname;
			this.lastname = lastname;
			this.address = address;
			this.City = City;
			this.email = email;
			this.id = id;
		}
		Entry(){
			firstname = " ";
			lastname = " ";
			address = " ";
			City = " ";
			email = " ";
			
			}
		public void readEntry() {
			System.out.println("firstname:"+firstname);
			System.out.println("firstname:"+lastname);
			System.out.println("firstname:"+address);
			System.out.println("firstname:"+email);
			

			
		}
		
		
		
			
			
		}

	}


