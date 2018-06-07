package cn.lastlysly.pojo;

public class TestPermission {
    private Integer testPermissionId;

    private String testPermissionRolename;

    private String testPermissionPermission;

    public Integer getTestPermissionId() {
        return testPermissionId;
    }

    public void setTestPermissionId(Integer testPermissionId) {
        this.testPermissionId = testPermissionId;
    }

    public String getTestPermissionRolename() {
        return testPermissionRolename;
    }

    public void setTestPermissionRolename(String testPermissionRolename) {
        this.testPermissionRolename = testPermissionRolename == null ? null : testPermissionRolename.trim();
    }

    public String getTestPermissionPermission() {
        return testPermissionPermission;
    }

    public void setTestPermissionPermission(String testPermissionPermission) {
        this.testPermissionPermission = testPermissionPermission == null ? null : testPermissionPermission.trim();
    }
}