package empleado;

import java.util.ArrayList;
import java.util.List;

//11. Crear una clase Empresa (Company) que contenga
//- addEmployee(employee)

//- size() (tamaño de la empresa: número de empleados)
//7:47
//- totalSalary() (salarios totales de la empresa)
//7:47
//- cambiar el número de empleado al entrar

//- raiseGlobal(percentage: int)
//- Employee search(String name)
public class Empresa {

    List<Empleado> listaEmpleados = new ArrayList<>();

    public void addEmployee(Empleado empleado){
        listaEmpleados.add(empleado);
        empleado.setId(listaEmpleados.size());
    }

    public int size(){
        return listaEmpleados.size();
    }

    public float totalSalary(){
        float salarySumary = 0;
        for(Empleado empleado: listaEmpleados){
            salarySumary += empleado.getSalary();
        }
        return salarySumary;
    }

    public String printAll(){
        String toReturn = "";
        for(Empleado empleado: listaEmpleados){
            toReturn += "Id: " + empleado.getId() + "\nNombre: " + empleado.getFirstName() + "\n" +
                    "Apellido: " + empleado.getLastName() + "\nSalario: " + empleado.getSalary() + "\n\n";
        }
        return toReturn;
    }

    public void raiseGlobal(int porcentaje){
        for(Empleado empleado: listaEmpleados){
            empleado.raiseSalary(porcentaje);
        }
    }

    public String employeeSearch(String name){
        for(Empleado empleado: listaEmpleados){
            if(empleado.getFirstName().equalsIgnoreCase(name)){
                return empleado.toString();
            }
        }
        return "Employee not found";
    }

}
