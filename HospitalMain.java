package Hospital;

public class HospitalMain {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();

        Doctor doctor1 = new Doctor("Dr. Simith");
        Doctor doctor2 = new Doctor("Dr. Jhonson");

        Patient patient1 = new Patient("Carrie Shawn");
        Patient patient2 = new Patient("Ashley Daisly");

        Treatment treatment1 = new Treatment("Painkiller", 7, 500.0);
        Treatment treatment2 = new Treatment("Antibiotics", 10, 0.0);

        System.out.println("****** Doctors ******");
        hospital.showList(Doctor.getDoctorList());

        System.out.println("\n****** Treatment ******");
        hospital.assignPatientToDoctor(doctor1,patient1,treatment1);
        hospital.assignPatientToDoctor(doctor2,patient2,treatment2);

        System.out.println("\n****** Doctor after surgeries ******");
        hospital.showList(Doctor.getDoctorList());
    }
}