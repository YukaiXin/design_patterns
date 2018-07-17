package buildPattern;

public class StudentB {

    private int id;
    private String name;
    private String passwd;
    private String sex;
    private String address;

    public StudentB() {
    }

    public StudentB(String name, String passwd, String sex, String address) {
        super();
        this.name = name;
        this.passwd = passwd;
        this.sex = sex;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
