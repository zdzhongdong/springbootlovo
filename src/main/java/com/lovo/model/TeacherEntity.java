package com.lovo.model;

import java.util.Date;

public class TeacherEntity {
    private String teacherid;

    private String teachername;

    private String classname;

    private Date teacherbirthday;

    private String teachesex;

    public String getTeacherid() {
        return teacherid;
    }

    public void setTeacherid(String teacherid) {
        this.teacherid = teacherid == null ? null : teacherid.trim();
    }

    public String getTeachername() {
        return teachername;
    }

    public void setTeachername(String teachername) {
        this.teachername = teachername == null ? null : teachername.trim();
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname == null ? null : classname.trim();
    }

    public Date getTeacherbirthday() {
        return teacherbirthday;
    }

    public void setTeacherbirthday(Date teacherbirthday) {
        this.teacherbirthday = teacherbirthday;
    }

    public String getTeachesex() {
        return teachesex;
    }

    public void setTeachesex(String teachesex) {
        this.teachesex = teachesex == null ? null : teachesex.trim();
    }
}