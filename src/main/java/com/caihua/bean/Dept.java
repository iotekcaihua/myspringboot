package com.caihua.bean;

import org.apache.ibatis.type.Alias;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Alias("Dept")
public class Dept {
    private int did;
    private String dname;
    private String addr;
    private int brachCode;
    private List<Employee> emps=new ArrayList<>();

    public Dept() {
    }

    public Dept(int did, String dname, String addr, int brachCode, List<Employee> emps) {
        this.did = did;
        this.dname = dname;
        this.addr = addr;
        this.brachCode = brachCode;
        this.emps = emps;
    }

    public List<Employee> getEmps() {
        return emps;
    }

    public int getDid() {
        return did;
    }

    public void setDid(int did) {
        this.did = did;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public int getBrachCode() {
        return brachCode;
    }

    public void setBrachCode(int brachCode) {
        this.brachCode = brachCode;
    }
}
