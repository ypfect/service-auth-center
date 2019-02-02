package com.explore.serviceauthcenter.constant;

/**
 * @Description
 * @Author stanley.yu
 * @Date 2019/2/2 14:24
 */
public enum  EnumSecurity {

    LOGIN_PATH("/login")
    ;


    private String desc;

    EnumSecurity(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
