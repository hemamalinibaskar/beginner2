package youtube2;

class User
{
	int User_id;
	String Name;
	String Mail_id;
	String Password;
}

class Book
{
	int Book_no;
	String Book_name;
	String Author;
}

class Card
{
	int Card_no;
	String Department;
}

class ReminderMessage
{
	int Due_date;
	int Books_Taken;
	int Books_Returned;
	int Books_Remaining;
}
public class Library {
	public static void main(String args[]) {
		
		User lib = new User();
		lib.User_id = 10011;
		lib.Name="Kavi";
		lib.Mail_id="kavi123@mail.com";
		lib.Password="123456";
		
		Book lib1 = new Book();
		lib1.Book_no = 1967;
		lib1.Book_name = "Army";
		lib1.Author = "BTS";
		
		Card lib2 = new Card();
		lib2.Card_no = 2512;
		lib2.Department = "MBA";
		
		ReminderMessage lib3 = new ReminderMessage();
		lib3.Due_date = 01-02-2010;
		lib3.Books_Taken = 3;
		lib3.Books_Returned = 1;
		lib3.Books_Remaining = 2;
		
		System.out.println("Name: "+lib.Name);
		System.out.println("Mail id: "+lib.Mail_id);
		System.out.println("Book name:"+lib1.Book_name);
		System.out.println("Author name: "+lib1.Author);
		System.out.println("Department: "+lib2.Department);
		System.out.println("Books Taken: "+lib3.Books_Taken);
		System.out.println("Books to return: "+lib3.Books_Remaining);
		
		
	}

}
