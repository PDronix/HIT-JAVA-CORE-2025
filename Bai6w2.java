import java.util.Scanner;

class Student {
    String name;
    int age;
    double gpa;
}

public class Bai6w2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();

        Student[] students = new Student[n];
        for (int i = 0; i < n; i++) {
            students[i] = new Student();
            students[i].name = scanner.nextLine();
            students[i].age = scanner.nextInt();
            students[i].gpa = scanner.nextDouble();
            scanner.nextLine();
        }

        for (int i = 0; i < n; i++) {
            System.out.printf("Tên: %s, Tuổi: %d, GPA: %.2f\n", students[i].name, students[i].age, students[i].gpa);
        }

        double totalGpa = 0;
        for (Student s : students) {
            totalGpa += s.gpa;
        }
        System.out.printf("Điểm trung bình của lớp: %.2f\n", totalGpa / n);

        Student topStudent = students[0];
        for (Student s : students) {
            if (s.gpa > topStudent.gpa) {
                topStudent = s;
            }
        }
        System.out.printf("Sinh viên có điểm cao nhất: %s, GPA: %.2f\n", topStudent.name, topStudent.gpa);
        Student laststudent = students[0];
        for(Student s : students)
        {
            if(s.gpa < laststudent.gpa)
            {
                laststudent = s;
            }
        }
        System.out.printf("Sinh viên có điểm thấp nhất: %s, GPA: %.2f\n", laststudent.name, laststudent.gpa);
        scanner.close();
    }
}
