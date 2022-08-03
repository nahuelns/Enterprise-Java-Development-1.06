public class Pasante extends Employee{

    private final Integer MAX_SALARIO = 20000;

    public Pasante(String nombre, Integer id, String puesto, String categoria, Integer salario) {
        super(nombre, id, puesto, categoria, salario);
        this.setSalario(salario);
    }

    @Override
    public void setSalario(Integer salario) {
        if(salario > MAX_SALARIO){
            super.setSalario(MAX_SALARIO);

        } else {
            super.setSalario(salario);
        }

    }
}
