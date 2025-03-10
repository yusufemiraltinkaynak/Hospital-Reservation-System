package Hospital;

import java.util.LinkedList;

public class Patient implements IMedicalPersonel{
    private String name;
    private LinkedList<Treatment> treatments;

    public Patient(String name) {
        super();
         this.name = name;
       this.treatments = new LinkedList<>();
    }



    public LinkedList<Treatment> getTreatments() {
        return treatments;
    }

    public void addTreatment(Treatment treatment) {
        treatments.add(treatment);
    }

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", treatments=" + treatments +
                '}';
    }

    @Override
    public String getName() {
        return name;
    }
}
