package Domain;

import java.io.Serializable;

public class Customer implements Serializable {
    private Integer Id;
    private String UserName;
    private String Passwd;
    private String Jobs;
    private String Phone;

    public Integer getId() {
        return Id;
    }

    public String getUserName() {
        return UserName;
    }

    public String getJobs() {
        return Jobs;
    }

    public String getPasswd() {
        return Passwd;
    }

    public String getPhone() {
        return Phone;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public void setJobs(String jobs) {
        Jobs = jobs;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public void setPasswd(String passwd) {
        Passwd = passwd;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }
    @Override
    public String toString(){
        return "Customer[Id="+Id+",Name="+UserName+",Passwd="+Passwd+",Jobs="+Jobs+",Phone="+Phone+"]";
    }

}
