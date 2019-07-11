package practice06;

public class Teacher extends Person{
    private Integer klass;
    public Teacher(String name, Integer age) {
        super(name, age);
        this.klass = 0;
    }

    public Teacher(String name, Integer age, Integer klass) {
        super(name, age);
        this.klass = klass;
    }

    public Integer getKlass() {
        return klass;
    }

    public void setKlass(Integer klass) {
        this.klass = klass;
    }

    public String introduce(){
        return klass == 0 ? "My name is "+getName()+". I am "+getAge()+" years old. I am a Teacher. I teach No Class.":"My name is "+getName()+". I am "+getAge()+" years old. I am a Teacher. I teach Class "+klass+".";
    }
}
