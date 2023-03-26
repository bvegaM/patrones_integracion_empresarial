package ec.edu.ups.msoft.model;

import org.apache.camel.dataformat.bindy.annotation.DataField;

public class Pay {

    @DataField(pos = 7)
    private Integer pay1;
    @DataField(pos = 8)
    private Integer pay2;
    @DataField(pos = 9)
    private Integer pay3;
    @DataField(pos = 10)
    private Integer pay4;
    @DataField(pos = 11)
    private Integer pay5;
    @DataField(pos = 12)
    private Integer pay6;
    @DataField(pos = 19)
    private Integer pay7;
    @DataField(pos = 20)
    private Integer pay8;
    @DataField(pos = 21)
    private Integer pay9;
    @DataField(pos = 22)
    private Integer pay10;
    @DataField(pos = 23)
    private Integer pay11;
    @DataField(pos = 24)
    private Integer pay12;

    @Override
    public String toString() {
        return "Pay{" +
                "pay1=" + pay1 +
                ", pay2=" + pay2 +
                ", pay3=" + pay3 +
                ", pay4=" + pay4 +
                ", pay5=" + pay5 +
                ", pay6=" + pay6 +
                ", pay7=" + pay7 +
                ", pay8=" + pay8 +
                ", pay9=" + pay9 +
                ", pay10=" + pay10 +
                ", pay11=" + pay11 +
                ", pay12=" + pay12 +
                '}';
    }

    public Integer sumPayOne(){
        return this.pay1+this.pay2+this.pay3+this.pay4+
                this.pay5+this.pay6;
    }

    public Integer sumPayTwo(){
        return this.pay7+this.pay8+this.pay9+this.pay10+
                this.pay11+this.pay12;
    }

    public Integer getPay1() {
        return pay1;
    }

    public void setPay1(Integer pay1) {
        this.pay1 = pay1;
    }

    public Integer getPay2() {
        return pay2;
    }

    public void setPay2(Integer pay2) {
        this.pay2 = pay2;
    }

    public Integer getPay3() {
        return pay3;
    }

    public void setPay3(Integer pay3) {
        this.pay3 = pay3;
    }

    public Integer getPay4() {
        return pay4;
    }

    public void setPay4(Integer pay4) {
        this.pay4 = pay4;
    }

    public Integer getPay5() {
        return pay5;
    }

    public void setPay5(Integer pay5) {
        this.pay5 = pay5;
    }

    public Integer getPay6() {
        return pay6;
    }

    public void setPay6(Integer pay6) {
        this.pay6 = pay6;
    }

    public Integer getPay7() {
        return pay7;
    }

    public void setPay7(Integer pay7) {
        this.pay7 = pay7;
    }

    public Integer getPay8() {
        return pay8;
    }

    public void setPay8(Integer pay8) {
        this.pay8 = pay8;
    }

    public Integer getPay9() {
        return pay9;
    }

    public void setPay9(Integer pay9) {
        this.pay9 = pay9;
    }

    public Integer getPay10() {
        return pay10;
    }

    public void setPay10(Integer pay10) {
        this.pay10 = pay10;
    }

    public Integer getPay11() {
        return pay11;
    }

    public void setPay11(Integer pay11) {
        this.pay11 = pay11;
    }

    public Integer getPay12() {
        return pay12;
    }

    public void setPay12(Integer pay12) {
        this.pay12 = pay12;
    }
}
