import java.util.Scanner;

public class uprakpbof_no2 {

    // Method to calculate the final score
    public static double calculateFinalScore(double kehadiran, double tugas, double uts, double uas) {
        return (kehadiran * 0.10) + (tugas * 0.20) + (uts * 0.30) + (uas * 0.40);
    }

    // Method to determine the grade
    public static String determineGrade(double finalScore) {
        if (finalScore >= 90) {
            return "A";
        } else if (finalScore >= 80) {
            return "B+";
        } else if (finalScore >= 70) {
            return "B";
        } else if (finalScore >= 50) {
            return "C";
        } else {
            return "D";
        }
    }

    // Method to determine the pass/fail status
    public static String determineStatus(double finalScore) {
        if (finalScore >= 70) {
            return "Lulus";
        } else {
            return "Tidak Lulus";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input data
        System.out.print("Masukkan Nama: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan Kelas: ");
        String kelas = scanner.nextLine();
        System.out.print("Masukkan NIM: ");
        String nim = scanner.nextLine();
        System.out.print("Matakuliah: ");
        String matakuliah = scanner.nextLine();
        System.out.print("Masukkan kehadiran: ");
        double kehadiran = scanner.nextDouble();
        System.out.print("Masukkan Nilai UTS: ");
        double uts = scanner.nextDouble();
        System.out.print("Masukkan Tugas: ");
        double tugas = scanner.nextDouble();
        System.out.print("Masukkan UAS: ");
        double uas = scanner.nextDouble();

        // Calculate final score
        double finalScore = calculateFinalScore(kehadiran, tugas, uts, uas);

        // Determine grade and status
        String grade = determineGrade(finalScore);
        String status = determineStatus(finalScore);

        // Output the results
        System.out.println("===============================");
        System.out.println("Nama    : " + nama);
        System.out.println("Kelas   : " + kelas);
        System.out.println("NIM     : " + nim);
        System.out.println("Matakuliah : " + matakuliah);
        System.out.println("Hasil   : " + finalScore);
        System.out.println("Predikat: " + grade);
        System.out.println(status);

        scanner.close();
    }
}
