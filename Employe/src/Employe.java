import java.util.Objects;

public class Employe  {
    private int id;
    private String nom;
    private String prenom;
    private String department;
    private int grade;

    public Employe() {
    }

    public Employe(int id, String nom, String prenom, String department, int grade) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.department = department;
        this.grade = grade;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setPrenom(String firstName) {
        this.prenom = firstName;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setLastName(String prenom) {
        this.prenom = prenom;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employe)) return false;
        Employe employes = (Employe) o;
        return Objects.equals(id, employes.getId()) && Objects.equals(nom, employes.getNom()) ;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + nom + '\'' +
                ", lastName='" + prenom + '\'' +
                ", departmentName='" + department + '\'' +
                ", grade=" + grade +
                '}';
    }

}
