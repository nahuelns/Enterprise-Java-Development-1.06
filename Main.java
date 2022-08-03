import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Employee Empleado1 = new Employee( "Carlos", 120,  "Director comercial", "Sr",  80000);
        Employee Empleado2 = new Employee("Jose", 121,  "Ejecutivo de cuentas", "Ssr",  55000);
        Pasante Empleado3 = new Pasante("Alberto", 122,  "Cadete", "Pasante",  40000);
        Employee Empleado4 = new Employee( "Mariana", 123,  "Ejecutivo de cuentas", "Sr",  35000);
        Pasante Empleado5 = new Pasante( "Julia", 124,  "Secretaria", "Pasante",  60000);
        Employee Empleado6 = new Employee( "Marcos", 125,  "Director de operaciones", "Sr",  70000);
        Pasante Empleado7 = new Pasante( "Alejandro", 126,  "Ejecutivo de cuentas", "Pasante",  18000);
        Employee Empleado8 = new Employee( "Paula", 127,  "Directora Financiera", "Sr",  45000);
        Employee Empleado9 = new Employee( "Ivan", 128,  "Director Comercial", "Sr",  60000);
        Employee Empleado10 = new Employee( "Maria", 129,  "Director Operativo", "Sr",  60000);


        Employee[] Employees = {Empleado1, Empleado2,Empleado3,Empleado4,Empleado5,Empleado6,Empleado7,Empleado8,Empleado8,Empleado10};

        FileWriter writer = new FileWriter("employees.txt", true);

        for (int i=0 ; i < Employees.length; i++) {

            writer.write(Employees[i].toString() + "\n");

        }

            writer.close();

        }



    }





