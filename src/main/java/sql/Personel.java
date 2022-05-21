package sql;

import java.util.ArrayList;

public class Personel {
    private int id;
    private String name;
    private String surname;
    private String password;
    private String mail;
    private int salary;
    private String tel;
    private String gender;
    private String startingOfWork;
    private String tc;
    private int experiencYear;
    private String educaitonStatus;
    private String about;
    private String catories;

    public ArrayList perLi = new ArrayList<>();

    public Personel() {

    }

    /*
     * //? id li ekleme constactırı
     * public Personel(int id, String name, String surname, String password,
     * String mail, int salary, String tel, String gender, String startingOfWork,
     * String tc, int experiencYear, String educaitonStatus, String about) {
     * this.id = id;
     * this.name = name;
     * this.surname = surname;
     * this.password = password;
     * this.mail = mail;
     * this.salary = salary;
     * this.tel = tel;
     * this.gender = gender;
     * this.startingOfWork = startingOfWork;
     * this.tc = tc;
     * this.experiencYear = experiencYear;
     * this.educaitonStatus = educaitonStatus;
     * this.about = about;
     * 
     * 
     * 
     * }
     */
    // ? id siz güncelleme için
    public Personel(String name, String surname, String password,
            String mail, int salary, String tel, String gender, String startingOfWork,
            String tc, int experiencYear, String educaitonStatus, String about) {
        this.name = name;
        this.surname = surname;
        this.password = password;
        this.mail = mail;
        this.salary = salary;
        this.tel = tel;
        this.gender = gender;
        this.tc = tc;
        this.experiencYear = experiencYear;
        this.startingOfWork = startingOfWork;
        this.educaitonStatus = educaitonStatus;
        this.about = about;
        this.catories = " (id, name, surname, password, mail, salary, tel, gender, starting_of_work, tc, experience_year, education_status, about) ";
        perLi.clear();
        perLi.add(id);
        perLi.add(name);
        perLi.add(surname);
        perLi.add(password);
        perLi.add(mail);
        perLi.add(salary);
        perLi.add(tel);
        perLi.add(gender);
        perLi.add(startingOfWork);
        perLi.add(tc);
        perLi.add(experiencYear);
        perLi.add(educaitonStatus);
        perLi.add(about);
    }

    // ? kayıt için
    public Personel(String name, String surname, String password,
            String mail, String tel, String gender,
            String tc, int experiencYear, String educaitonStatus, String about) {
        this.name = name;
        this.surname = surname;
        this.password = password;
        this.mail = mail;
        this.tel = tel;
        this.gender = gender;
        this.tc = tc;
        this.experiencYear = experiencYear;
        this.educaitonStatus = educaitonStatus;
        this.about = about;
        this.catories = " (id,name,surname,password,mail,tel,gender,tc,education_status,experience_year,about) ";
        perLi.clear();
        perLi.add(catories);
        perLi.add(name);
        perLi.add(surname);
        perLi.add(password);
        perLi.add(mail);
        perLi.add(tel);
        perLi.add(gender);
        perLi.add(tc);
        perLi.add(educaitonStatus);
        perLi.add(experiencYear);
        perLi.add(about);
    }

    /**
     * @return int return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return String return the surname
     */
    public String getSurname() {
        return surname;
    }

    /**
     * @param surname the surname to set
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }

    /**
     * @return String return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return String return the mail
     */
    public String getMail() {
        return mail;
    }

    /**
     * @param mail the mail to set
     */
    public void setMail(String mail) {
        this.mail = mail;
    }

    /**
     * @return int return the salary
     */
    public int getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }

    /**
     * @return String return the tel
     */
    public String getTel() {
        return tel;
    }

    /**
     * @param tel the tel to set
     */
    public void setTel(String tel) {
        this.tel = tel;
    }

    /**
     * @return String return the gender
     */
    public String getGender() {

        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return String return the startingOfWork
     */
    public String getStartingOfWork() {
        return startingOfWork;
    }

    /**
     * @param startingOfWork the startingOfWork to set
     */
    public void setStartingOfWork(String startingOfWork) {
        this.startingOfWork = startingOfWork;
    }

    /**
     * @return String return the tc
     */
    public String getTc() {
        return tc;
    }

    /**
     * @param tc the tc to set
     */
    public void setTc(String tc) {
        this.tc = tc;
    }

    /**
     * @return int return the experiencYear
     */
    public int getExperiencYear() {
        return experiencYear;
    }

    /**
     * @param experiencYear the experiencYear to set
     */
    public void setExperiencYear(int experiencYear) {
        this.experiencYear = experiencYear;
    }

    /**
     * @return String return the educaitonStatus
     */
    public String getEducationStatus() {
        return educaitonStatus;
    }

    /**
     * @param educaitonStatus the educaitonStatus to set
     */
    public void setEducaitonStatus(String educaitonStatus) {
        this.educaitonStatus = educaitonStatus;
    }

    /**
     * @return String return the about
     */
    public String getAbout() {
        return about;
    }

    /**
     * @param about the about to set
     */
    public void setAbout(String about) {
        this.about = about;
    }

    /**
     * @return the catories
     */
    public String getCatories() {
        return catories;
    }

    /**
     * @param catories the catories to set
     */
    public void setCatories(String catories) {
        this.catories = catories;
    }

}
