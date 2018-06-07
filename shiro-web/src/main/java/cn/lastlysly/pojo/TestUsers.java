package cn.lastlysly.pojo;

public class TestUsers {
    private Integer testUserId;

    private String testUsername;

    private String testPassword;

    public Integer getTestUserId() {
        return testUserId;
    }

    public void setTestUserId(Integer testUserId) {
        this.testUserId = testUserId;
    }

    public String getTestUsername() {
        return testUsername;
    }

    public void setTestUsername(String testUsername) {
        this.testUsername = testUsername == null ? null : testUsername.trim();
    }

    public String getTestPassword() {
        return testPassword;
    }

    public void setTestPassword(String testPassword) {
        this.testPassword = testPassword == null ? null : testPassword.trim();
    }
}