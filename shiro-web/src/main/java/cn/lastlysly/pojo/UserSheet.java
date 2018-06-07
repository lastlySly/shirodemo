package cn.lastlysly.pojo;

/**
 * @author lastlySly
 * @GitHub https://github.com/lastlySly
 * @create 2018-06-03 13:34
 **/
public class UserSheet {
    private String username;
    private String password;

    public UserSheet() {
    }

    public UserSheet(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
