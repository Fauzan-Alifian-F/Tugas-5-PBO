import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input untuk Student
        System.out.print("Masukkan nama mahasiswa: ");
        String studentName = sc.nextLine();
        System.out.print("Masukkan alamat mahasiswa: ");
        String studentAddress = sc.nextLine();
        Student student = new Student(studentName, studentAddress);

        System.out.print("Berapa mata kuliah yang diambil? ");
        int jumlahMK = sc.nextInt();
        sc.nextLine(); // buang newline

        for (int i = 0; i < jumlahMK; i++) {
            System.out.print("Nama matkul ke-" + (i + 1) + ": ");
            String course = sc.nextLine();
            System.out.print("Nilai matkul " + course + ": ");
            int grade = sc.nextInt();
            sc.nextLine(); // buang newline
            student.addCourseGrade(course, grade);
        }

        System.out.println("\n" + student);
        student.printGrades();
        System.out.println("Rata-rata nilai: " + student.getAverageGrade());

        // Input untuk Teacher
        System.out.print("\nMasukkan nama dosen: ");
        String teacherName = sc.nextLine();
        System.out.print("Masukkan alamat dosen: ");
        String teacherAddress = sc.nextLine();
        Teacher teacher = new Teacher(teacherName, teacherAddress);

        System.out.print("Berapa mata kuliah yang diajarkan? ");
        int jumlahAjar = sc.nextInt();
        sc.nextLine(); // buang newline

        for (int i = 0; i < jumlahAjar; i++) {
            System.out.print("Nama matkul yang diajarkan ke-" + (i + 1) + ": ");
            String course = sc.nextLine();
            if (teacher.addCourse(course)) {
                System.out.println("Berhasil ditambahkan.");
            } else {
                System.out.println("Gagal! Sudah ada.");
            }
        }

        System.out.println("\n" + teacher);
    }
}
