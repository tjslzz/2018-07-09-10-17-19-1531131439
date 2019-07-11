package practice08;

public class Student extends Person{
    private Klass klass;
    public Student(Integer id, String name, Integer age,Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    public String introduce(){
        return klass.getLeader() == this?"My name is "+getName()+". I am "+getAge()+" years old. I am a Student. I am Leader of "+klass.getDisplayName()+".":"My name is "+getName()+". I am "+getAge()+" years old. I am a Student. I am at "+klass.getDisplayName()+".";
    }
}
