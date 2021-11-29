package Domain;

public class Idcard {
    private Integer Id;
    private String Code;
    private String Name;
    private String Addr;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getCode() {
        return Code;
    }

    public void setCode(String code) {
        Code = code;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAddr() {
        return Addr;
    }

    public void setAddr(String addr) {
        Addr = addr;
    }

    @Override
    public String toString() {
        return "Person{" +
                "Id=" + Id +
                ", Code=" + Code +
                ", Name=" + Name +
                ", Addr=" + Addr +
                '}';
    }
}
