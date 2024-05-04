package CollegePack;

public class All_Departments extends Type_Of_Book_Libaray{

	int total_Staff;
	String depart_Name;

	public void IT_Depart() {
		depart_Name = "IT";
		total_Staff = 10;
		System.out.println("Name of Departments  " + depart_Name);
	}

	public void Mech_Depart() {
		depart_Name = "Mechanical";
		total_Staff = 20;
		System.out.println("Name of Departments " + depart_Name);
	}

	public void Ele_Depart() {
		depart_Name = "Electrical";
		total_Staff = 30;
		System.out.println("Name of Departments " + depart_Name);
	}
}
