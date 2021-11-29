package Domain;

import java.util.List;

public class User {
    private String username;
    private Integer passwd;
    private List<String> list;

    public User(String username,Integer passwd,List<String> list){
        super();
        this.username=username;
        this.passwd=passwd;
        this.list=list;
    }

    public User(){
        super();
    }

    public void setUsername(String username){
        this.username=username;
    }
    public void setPasswd(Integer passwd){
        this.passwd=passwd;
    }
    public void setList(List<String> list){
        this.list=list;
    }

    public String getUsername() {
        return username;
    }

    public Integer getPasswd() {
        return passwd;
    }

    public List<String> getList() {
        return list;
    }

    @Override
    public String toString(){
        return "User [username="+username+",passwd="+passwd+",list="+list+"]";
    }

}
