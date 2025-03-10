package Hospital;

import java.util.ArrayList;
import java.util.List;

public class Doctor implements IMedicalPersonel,ISurgeon{
    private static ArrayList<Doctor> doctorList = new ArrayList<>();;
    private String name;
    private double experience;
    private int surgeries;

    public Doctor(String name) {
        this.name = name;
        doctorList.add(this);
    }

    public List<Doctor> getDoctorList() {
        return doctorList;
    }


    public int getSurgeries() {
        return surgeries;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "doctorList=" + doctorList +
                ", name='" + name + '\'' +
                ", experience=" + experience +
                ", surgeries=" + surgeries +
                '}';
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void performSurgery() throws SurgeryUnsuccessfulException {
    for(int i = 0 ; i < surgeries ; i++) {
        boolean surgerySuccess = 0.8 < Math.random();
        if(surgerySuccess) {
            experience+= 2.5;
        }
        else {
            experience=0;
            throw new SurgeryUnsuccessfulException("Surgery by" + name + " unsuccessful");
        }
    }
    }
}
