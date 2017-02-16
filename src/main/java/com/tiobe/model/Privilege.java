package com.tiobe.model;

public class Privilege {
    private Integer privilegeId;

    private String privilegeName;

    private String privilegeNameCn;

    private String privilegeValue;

    private Integer privilegeCategoryId;

    public Integer getPrivilegeId() {
        return privilegeId;
    }

    public void setPrivilegeId(Integer privilegeId) {
        this.privilegeId = privilegeId;
    }

    public String getPrivilegeName() {
        return privilegeName;
    }

    public void setPrivilegeName(String privilegeName) {
        this.privilegeName = privilegeName == null ? null : privilegeName.trim();
    }

    public String getPrivilegeNameCn() {
        return privilegeNameCn;
    }

    public void setPrivilegeNameCn(String privilegeNameCn) {
        this.privilegeNameCn = privilegeNameCn == null ? null : privilegeNameCn.trim();
    }

    public String getPrivilegeValue() {
        return privilegeValue;
    }

    public void setPrivilegeValue(String privilegeValue) {
        this.privilegeValue = privilegeValue == null ? null : privilegeValue.trim();
    }

    public Integer getPrivilegeCategoryId() {
        return privilegeCategoryId;
    }

    public void setPrivilegeCategoryId(Integer privilegeCategoryId) {
        this.privilegeCategoryId = privilegeCategoryId;
    }
}