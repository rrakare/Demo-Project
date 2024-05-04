package CollegePack;

public class Akare_College_Of_Engg extends All_Departments implements College {

	// All_Departments itDepart = new All_Departments();

	@Override
	public void departments(String dept) {

		if (dept == "IT") {
			// itDepart.IT_Depart();
			super.IT_Depart();

		} else if (dept == "Mechanical") {
			// itDepart.Mech_Depart();
			super.Mech_Depart();
		} else if (dept == "Electrical") {
			// itDepart.Ele_Depart();
			super.Ele_Depart();
		}
	}

	@Override
	public void libaray(String deptLib) {

		// Type_Of_Book_Libaray typeBooklibaray = new Type_Of_Book_Libaray();

		if (deptLib == "IT") {
			// typeBooklibaray.IT_Depart_Book();
			super.IT_Depart_Book();
		} else if (deptLib == "Mechanical") {
			// typeBooklibaray.Mech_Depart_Book();
			super.Mech_Depart_Book();
		} else if (deptLib == "Electrical") {
			// typeBooklibaray.Ele_Depart_Book();
			super.Ele_Depart_Book();
		}

	}

	@Override
	public void account_Office() {
		System.out.println("Student account section information");

	}

	@Override
	public void departments_Wise_Staff_Count(String dept) {

		if (dept == "IT") {
			System.out.println("Total IT staff  " + super.total_Staff);
			libaray(dept);
		} else if (dept == "Mechanical") {
			System.out.println("Total mechanical staff  " + super.total_Staff);
			libaray(dept);
		} else if (dept == "Electrical") {
			System.out.println("Total electrical staff " + super.total_Staff);
			libaray(dept);

		}
	}

	@Override
	public void other_Facilities() {
		System.out.println("Select the other activities: Sport, Medical, Canteen");

	}

}
