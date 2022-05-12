package sql;

import java.sql.Date;

public class Personel {
    protected int id;
    protected String name;
    protected String surname;
    protected String passqord;
    protected String mail;
    protected int salary;
    protected String tel;
    protected boolean gender;
    protected Date startingOfWork;
    protected String tc;
    protected short experiencYear;
    protected String educaitonStatus;
    protected String about;

    public Personel() {
    }

    
    
    public Personel(int id, String name, String surname, String passqord, 
    String mail, int salary, String tel, boolean gender, Date startingOfWork, 
    String tc, short experiencYear, String educaitonStatus, String about) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.passqord = passqord;
        this.mail = mail;
        this.salary = salary;
        this.tel = tel;
        this.gender = gender;
        this.startingOfWork = startingOfWork;
        this.tc = tc;
        this.experiencYear = experiencYear;
        this.educaitonStatus = educaitonStatus;
        this.about = about;
    }


    

}
