public class Employee {

    public String Nombre;
    public Integer Id;
    public String Puesto;
    public String Categoria;
    public Integer Salario;


    public Employee(String nombre, Integer id, String puesto, String categoria, Integer salario) {
        Nombre = nombre;
        Id = id;
        Puesto = puesto;
        Categoria = categoria;
        Salario = salario;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getPuesto() {
        return Puesto;
    }

    public void setPuesto(String puesto) {
        Puesto = puesto;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String categoria) {
        Categoria = categoria;
    }

    public Integer getSalario() {
        return Salario;
    }

    public void setSalario(Integer salario) {
        Salario = salario;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Nombre='" + Nombre + '\'' +
                ", Id=" + Id +
                ", Puesto='" + Puesto + '\'' +
                ", Categoria='" + Categoria + '\'' +
                ", Salario=" + Salario +
                '}';
    }
}
