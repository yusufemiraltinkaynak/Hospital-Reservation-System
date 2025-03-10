package Hospital;

import java.util.ArrayList;
import java.util.List;

public class Hospital {
    private ArrayList<Doctor> medicalPersonnelList;

    public Hospital() {
        medicalPersonnelList = new ArrayList<>();
    }

    public void addMedicalPersonel(Doctor personnel){
        medicalPersonnelList.add(personnel);
    }

    public void assignPatientToDoctor(Doctor doctor,Patient patient,Treatment treatment) {
    double daliyFee = 100;
    double totalFee;
    try {

    } catch () {

    }
    }

    public void showList(List<Doctor> doctor) {
    for (IMedicalPersonel medicalPersonel : doctor) {
        System.out.println(doctor);
    }
    }

}
