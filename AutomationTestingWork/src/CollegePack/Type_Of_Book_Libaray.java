package CollegePack;

public class Type_Of_Book_Libaray {

	int total_Book;
	String book_Name;

	public void IT_Depart_Book() {
		book_Name = "IT,Java,Python,C++";
		total_Book = 80;
		System.out.println("List of books: "+book_Name+" and Total books = "+total_Book);
	}
	public void Mech_Depart_Book() {
		book_Name = "Mechanical, AC, Hydro, EPG";
		total_Book = 40;
		System.out.println("List of books: "+book_Name+" and  Total books = "+total_Book);
	}
	public void Ele_Depart_Book() {
		book_Name = "Electrical, Electrical Technology, Power System";
		total_Book = 30;
		System.out.println("List of books: "+book_Name+" and Total books = "+total_Book);
	}
}
