package practice09;

public class Teacher extends Person{
    private Klass klass;

    public Teacher(Integer id, String name, Integer age) {
        super(id, name, age);
        this.klass = new Klass(0);
    }

    public Teacher(Integer id, String name, Integer age,Klass klass) {
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
        return "My name is "+getName()+". I am "+getAge()+" years old. I am a Teacher. I teach "+klass.getDisplayName()+".";
    }

    public String introduceWith(Student student){
        return student.getKlass().getNumber() == klass.getNumber()?"My name is "+getName()+". I am "+getAge()+" years old. I am a Teacher. I teach "+student.getName()+"." : "My name is "+getName()+". I am "+getAge()+" years old. I am a Teacher. I don't teach "+student.getName()+".";
    }
}
