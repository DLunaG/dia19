package empleado;
//Crear una clase Empleado que tenga:
//- Constructor (id: int, firstName, lastName, salary)
//- setters y getters
//- getAnnualSalary() (salary * 12)
//- raiseSalary(percent: int) (% sobre su salario)
//- toString() ["Employee[id=?,name=firstName, lastName....]"]
public class Main {

    public static void main(String[] args) {


        Empleado pepe = new Empleado(1234, "Pepe","Fernández", 1400);
        System.out.println(pepe.toString());
        pepe.raiseSalary(10);
        System.out.println("Salary: " + pepe.getSalary() + "\n" +
                "Annual salary: " + pepe.getAnnualSalary());
        System.out.println(pepe.toString());

        Empleado paquita = new Empleado(1234, "Francisca", "Peñarroya", 1000);
        Empresa comp = new Empresa();
        comp.addEmployee(pepe);
        comp.addEmployee(paquita);
        System.out.println("Tamaño de empresa: " + comp.size());
        System.out.println("Salario total de todos los empleados: " + comp.totalSalary());
        System.out.println(comp.printAll());

        comp.raiseGlobal(10);
        System.out.println(comp.employeeSearch("Francisca"));
    }
}
