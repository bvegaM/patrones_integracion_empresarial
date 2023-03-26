package ec.edu.ups.msoft.model;

import org.apache.camel.dataformat.bindy.annotation.CsvRecord;
import org.apache.camel.dataformat.bindy.annotation.DataField;
import org.apache.camel.dataformat.bindy.annotation.Link;

@CsvRecord(separator = ",")
public class Client {

    @DataField(pos = 1)
    private Integer id;
    @DataField(pos = 2)
    private Integer limitBal;
    @DataField(pos = 3)
    private Integer sex;
    @DataField(pos = 4)
    private Integer education;
    @DataField(pos = 5)
    private Integer marriage;
    @DataField(pos = 6)
    private Integer age;

    @Link
    private Pay pay;

    @Link
    private Bill bill;

    @DataField(pos = 25)
    private Integer defaultPaymentNextMonth;

    @Override
    public String toString() {
        return "Client{" +
                "id='" + id + '\'' +
                ", limitBal=" + limitBal +
                ", sex=" + sex +
                ", education=" + education +
                ", marriage=" + marriage +
                ", age=" + age +
                ", pay=" + pay +
                ", bill=" + bill +
                ", defaultPaymentNextMonth=" + defaultPaymentNextMonth +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getLimitBal() {
        return limitBal;
    }

    public void setLimitBal(Integer limitBal) {
        this.limitBal = limitBal;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getEducation() {
        return education;
    }

    public void setEducation(Integer education) {
        this.education = education;
    }

    public Integer getMarriage() {
        return marriage;
    }

    public void setMarriage(Integer marriage) {
        this.marriage = marriage;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Pay getPay() {
        return pay;
    }

    public void setPay(Pay pay) {
        this.pay = pay;
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }

    public Integer getDefaultPaymentNextMonth() {
        return defaultPaymentNextMonth;
    }

    public void setDefaultPaymentNextMonth(Integer defaultPaymentNextMonth) {
        this.defaultPaymentNextMonth = defaultPaymentNextMonth;
    }
}
