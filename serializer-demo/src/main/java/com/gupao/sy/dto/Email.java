package com.gupao.sy.dto;

import java.io.Serializable;

/**
 *@ClassName Email
 *@Description TODO
 *@Author yong.shi.nj
 *@Date 2019/1/4 18:01
 *@Version 1.0
 **/
public class Email implements Serializable {
    private static final long serialVersionUID = 6237733676240430282L;
    private String account;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "Email{" +
                "account='" + account + '\'' +
                '}';
    }
}
