package empleado;
//Crear una clase Empleado que tenga:
//- Constructor (id: int, firstName, lastName, salary)
//- setters y getters
//- getAnnualSalary() (salary * 12)
//- raiseSalary(percent: int) (% sobre su salario)
//- toString() ["Employee[id=?,name=firstName, lastName....]"]
public class Empleado {

    private int id;
    private String firstName;
    private String lastName;
    private float salary;

    public Empleado(int id, String firstName, String lastName, float salary){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public float getAnnualSalary(){
        return salary*12;
    }

    public void raiseSalary(int percent){
        salary *= (percent/100f + 1);
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
}
