package practice09;

public class Person {
    private Integer id;
    private String name;
    private Integer age;

    public Person(Integer id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String introduce(){
        return "My name is "+name+". I am "+age+" years old.";
    }

    @Override
    public boolean equals(Object person) {
        person = (Person)person;
        if(person == null){return false;}
        return (this.id == ((Person) person).getId());
    }
}
