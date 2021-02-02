package homework5;

public class Employe {

    public String name;
    public String secondName;
    public String surname;
    public String post;
    public String email;
    public String phoneNumber;
    public int salary;
    public int age;

    Employe (String name, String secondName, String surname, String post, String email, String phoneNumber, int salary, int age) {
        this.name = name;
        this.secondName = secondName;
        this.surname = surname;
        this.post = post;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;

    }

    public String toString(){
        return String.format("Имя: %s \tДолжность: %s \nEmail: %s \t Номер телефона: %s \n Зарплата: %d \t Возраст: %d \n",
                name, post, email, phoneNumber, salary, age);}

    public void print(){
        System.out.println(this);
    }

}
