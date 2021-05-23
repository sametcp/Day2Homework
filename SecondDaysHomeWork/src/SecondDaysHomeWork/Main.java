package SecondDaysHomeWork;

public class Main {

	public static void main(String[] args) {
		
		EducationCourses educationCourse1 = new EducationCourses();
		educationCourse1.id = 1;
		educationCourse1.educationCoursesName = "Yazýlým Geliþtirici Kampý (C# + ANGULAR)";
		educationCourse1.educatorName = "Engin Demiroð";
		
		EducationCourses educationCourse2 = new EducationCourses(2,
				"Yazýlým Geliþtirici Yetiþtirme Kampý (JAVA + REACT)",
				"Engin Demiiroð");
		
		
		EducationCourses educationCourse3 = new EducationCourses(3,
				"Programlamaya Giriþ Ýçin Temel Kurs",
				"Engin Demiiroð");
		
		EducationCourses[] educationCourses = {educationCourse1, educationCourse2, educationCourse3};
		
		for(EducationCourses educationCourse : educationCourses) {
			System.out.println("Kurs id : " + educationCourse.id);
			System.out.println("Kurs adý : " + educationCourse.educationCoursesName);
			System.out.println("Kurs eðitmeni : " + educationCourse.educatorName);
		}
		
		EducationCoursesManager educationCourseManager = new EducationCoursesManager();
		
		
		educationCourseManager.addCourses(educationCourse1);
		educationCourseManager.addCourses(educationCourse2);
		
		educationCourseManager.addCourses(3,"Programlamaya Giriþ Ýçin Temel Kurs","Engin Demiiroð");
		
	}

}
