package SecondDaysHomeWork;

public class Main {

	public static void main(String[] args) {
		
		EducationCourses educationCourse1 = new EducationCourses();
		educationCourse1.id = 1;
		educationCourse1.educationCoursesName = "Yaz�l�m Geli�tirici Kamp� (C# + ANGULAR)";
		educationCourse1.educatorName = "Engin Demiro�";
		
		EducationCourses educationCourse2 = new EducationCourses(2,
				"Yaz�l�m Geli�tirici Yeti�tirme Kamp� (JAVA + REACT)",
				"Engin Demiiro�");
		
		
		EducationCourses educationCourse3 = new EducationCourses(3,
				"Programlamaya Giri� ��in Temel Kurs",
				"Engin Demiiro�");
		
		EducationCourses[] educationCourses = {educationCourse1, educationCourse2, educationCourse3};
		
		for(EducationCourses educationCourse : educationCourses) {
			System.out.println("Kurs id : " + educationCourse.id);
			System.out.println("Kurs ad� : " + educationCourse.educationCoursesName);
			System.out.println("Kurs e�itmeni : " + educationCourse.educatorName);
		}
		
		EducationCoursesManager educationCourseManager = new EducationCoursesManager();
		
		
		educationCourseManager.addCourses(educationCourse1);
		educationCourseManager.addCourses(educationCourse2);
		
		educationCourseManager.addCourses(3,"Programlamaya Giri� ��in Temel Kurs","Engin Demiiro�");
		
	}

}
