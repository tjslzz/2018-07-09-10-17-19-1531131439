package practice07;

public class Student extends Person{
    private Klass klass;
    public Student(String name, Integer age,Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    public String introduce(){
        return "My name is "+getName()+". I am "+getAge()+" years old. I am a Student. I am at "+klass.getDisplayName()+".";
    }
}
