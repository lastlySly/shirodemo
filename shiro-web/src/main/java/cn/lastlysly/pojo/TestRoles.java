package cn.lastlysly.pojo;

public class TestRoles {
    private Integer testRoleId;

    private String testRoleUsername;

    private String testRoleName;

    public Integer getTestRoleId() {
        return testRoleId;
    }

    public void setTestRoleId(Integer testRoleId) {
        this.testRoleId = testRoleId;
    }

    public String getTestRoleUsername() {
        return testRoleUsername;
    }

    public void setTestRoleUsername(String testRoleUsername) {
        this.testRoleUsername = testRoleUsername == null ? null : testRoleUsername.trim();
    }

    public String getTestRoleName() {
        return testRoleName;
    }

    public void setTestRoleName(String testRoleName) {
        this.testRoleName = testRoleName == null ? null : testRoleName.trim();
    }
}