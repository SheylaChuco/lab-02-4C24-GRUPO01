public class StudentModel {    private String name;    private int age;

    public StudentModel(String name, int age) {
        this.name = name;        this.age = age;
    }
    public void showInfo() {
        System.out.println("Nombre: " + name + ", Edad: " + age);
    }

    // Nueva función: Verifica si el estudiante es mayor de edad
    public boolean esMayorDeEdad() {
        return age >= 18;
    }
}
