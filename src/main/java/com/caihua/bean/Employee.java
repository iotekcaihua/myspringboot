package com.caihua.bean;

import org.apache.ibatis.type.Alias;
import org.springframework.stereotype.Component;

@Component
@Alias("Employee")
public class Employee {
    private int eid;
    private String ename;
    private int eage;
    private String egender;
    private Dept dept;
    private Position position;

    public Employee() {
    }

    public Employee(int eid, String ename, int eage, String egender, Dept dept, Position position) {
        this.eid = eid;
        this.ename = ename;
        this.eage = eage;
        this.egender = egender;
        this.dept = dept;
        this.position = position;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public int getEage() {
        return eage;
    }

    public void setEage(int eage) {
        this.eage = eage;
    }

    public String getEgender() {
        return egender;
    }

    public void setEgender(String egender) {
        this.egender = egender;
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eid=" + eid +
                ", ename='" + ename + '\'' +
                ", eage=" + eage +
                ", egender='" + egender + '\'' +
                ", dept=" + dept +
                ", position=" + position +
                '}';
    }
}
