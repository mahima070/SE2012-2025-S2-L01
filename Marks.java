import java.util.Scanner;
public class Marks{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of n: ");
		int n = sc.nextInt();	sc.nextLine();
		int [][]mark = new int[n][3];
		while (true){
		System.out.println("1. Add Student Marks");
		System.out.println("2. Update Student Marks");
		System.out.println("3. Get the Average for a subject");
		System.out.println("4. Get the Average for a student");
		System.out.println("5. Get the total marks of a student");
		System.out.println("6. Show Grades");
		System.out.println("7. Exit");
		System.out.printf("\tChoose the option: ");
		int res = sc.nextInt(); sc.nextLine();
		if (res == 7)  break;
		switch(res) {
			case 1: {
				for (int i = 0; i < n; i++) {
					System.out.println("Student" + (i + 1));
					System.out.print("Enter the marks of Chemistry: ");
					mark[i][0] = sc.nextInt(); sc.nextLine();
					System.out.print("Enter the marks of Physics: ");
                                        mark[i][1] = sc.nextInt(); sc.nextLine();
					System.out.print("Enter the marks of Mathematics: ");
                                        mark[i][2] = sc.nextInt(); sc.nextLine();
				}
				System.out.println("Marks were added!");
				System.out.println("");
				break;
			}
			case 2:{
				int check;
				do {
					System.out.print("Enter the Student to update the marks: ");
					int studentID = sc.nextInt(); sc.nextLine();
					System.out.printf("\n\t1. Chemistry\n");
                                	System.out.printf("\t2. Physics\n");
                                	System.out.printf("\t3. Mathematic\n");
                                	System.out.print("Enter the Subject to update the marks: ");
                                	int subjectID = sc.nextInt(); sc.nextLine();
					System.out.print("Enter the new marks: ");
					mark[studentID - 1][subjectID - 1] = sc.nextInt(); sc.nextLine();
					System.out.printf("Marks Update!\n");
					System.out.print("Enter 1 to update another mark: ");
					check = sc.nextInt(); sc.nextLine();
				} while (check == 1); 
				break;
			}
			case 3: {
				int total = 0;
				System.out.println("Enter the subject ID ");
                                System.out.printf("\t1. Chemistry\n");
                                System.out.printf("\t2. Physics\n");
                                System.out.printf("\t3. Mathematic\n");
                                int subjectID = sc.nextInt(); sc.nextLine();
				for (int i = 0; i < n; i++) {
					total += mark[i][subjectID - 1];
				}
				float avg = (float)total / n;
				String subject = "";
				if (subjectID == 1) subject = "Chemistry";
				else if (subjectID == 2) subject = "Physics";
				else if (subjectID == 3) subject = "Mathematics";
                                System.out.println("Average of	" + subject + " is " + avg);
				break;
			}
			case 4: {
				System.out.print("Enter the ID of the student: ");
				int studentID = sc.nextInt(); sc.nextLine();
				int total = mark[studentID - 1][0] + mark[studentID - 1][1] + mark[studentID - 1][2];
				float avg = (float)total / 3;
				System.out.println("Average is " + avg);
				break;
			}
			case 5: {
				System.out.print("Enter the ID of the student: ");
                                int studentID = sc.nextInt(); sc.nextLine();
                                int total = mark[studentID - 1][0] + mark[studentID - 1][1] + mark[studentID - 1][2];
                                System.out.println("Total is " + total);
				break;
			}
			case 6: {
				for (int i = 0; i < n; i++) {
					System.out.println("Grade of Student " + (i + 1));
					for (int subject : mark[i]) {
						if (subject >= 90) {
							System.out.printf("\tGrade A\n");
						} else if(subject >= 80) {
							System.out.printf("\tGrade B\n");
						} else if(subject >= 70) {
							System.out.printf("\tGrade C\n");
						} else if(subject >= 60) {
							System.out.printf("\tGrade D\n");
						} else if(subject >= 0) {
							System.out.printf("\tFail\n");
						}
					}
				}
			}
			default:{
				break;
			}
		}
		}
	}
}
