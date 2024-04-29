import java.util.ArrayList;
import java.util.List;
public class SocieteArrayList implements IGestion<Employe>{
    private List<Employe> employes;

    public SocieteArrayList() {
        this.employes = new ArrayList<>();
    }


    @Override
    public void ajouterEmploye(Employe employe) {

    }

    @Override
    public boolean rechercherEmploye(String nom) {
        return false;
    }

    @Override
    public boolean rechercherEmploye(Employe employe) {
        return false;
    }

    @Override
    public void supprimerEmploye(Employe employe) {

    }

    @Override
    public void afficherEmploye() {

    }

    @Override
    public void trierEmployeParId() {

    }

    @Override
    public void trierEmployeParDepartementEtGrade() {

    }
}
