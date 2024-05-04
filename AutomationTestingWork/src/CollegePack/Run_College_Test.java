package CollegePack;

public class Run_College_Test {

	Akare_College_Of_Engg akareCollEngg = new Akare_College_Of_Engg();

	public static void main(String[] args) {
		Run_College_Test runColl = new Run_College_Test();
		runColl.electrical_Depart("Electrical");

	}

	public void electrical_Depart(String dept) {
		
		if (dept == "Mechanical" || dept == "IT" || dept == "Electrical") {
			
			akareCollEngg.departments(dept);
			akareCollEngg.departments_Wise_Staff_Count(dept);
			akareCollEngg.account_Office();
			akareCollEngg.other_Facilities();
			// akareCollEngg.libaray(dept);
		} else {
			System.out.println("Department Name is wrong, please enter correct name......");
		}
	}
}
