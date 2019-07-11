package practice08;

public class Klass {
    private Integer number;
    private Student leader;

    public Klass(Integer number) {
        this.number = number;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getDisplayName(){
        return number == 0 ? "No Class":"Class "+number;
    }

    public Student getLeader() {
        return leader;
    }

    public void assignLeader(Student leader) {
        this.leader = leader;
    }
}
