package ec.edu.ups.msoft.model;

import org.apache.camel.dataformat.bindy.annotation.DataField;

public class Bill {

    @DataField(pos = 13)
    private Integer bill1;
    @DataField(pos = 14)
    private Integer bill2;
    @DataField(pos = 15)
    private Integer bill3;
    @DataField(pos = 16)
    private Integer bill4;
    @DataField(pos = 17)
    private Integer bill5;
    @DataField(pos = 18)
    private Integer bill6;


    public Integer sum(){
        return this.bill1+this.bill2+this.bill3+this.bill4
                +this.bill5+this.bill6;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "bill1=" + bill1 +
                ", bill2=" + bill2 +
                ", bill3=" + bill3 +
                ", bill4=" + bill4 +
                ", bill5=" + bill5 +
                ", bill6=" + bill6 +
                '}';
    }

    public Integer getBill1() {
        return bill1;
    }

    public void setBill1(Integer bill1) {
        this.bill1 = bill1;
    }

    public Integer getBill2() {
        return bill2;
    }

    public void setBill2(Integer bill2) {
        this.bill2 = bill2;
    }

    public Integer getBill3() {
        return bill3;
    }

    public void setBill3(Integer bill3) {
        this.bill3 = bill3;
    }

    public Integer getBill4() {
        return bill4;
    }

    public void setBill4(Integer bill4) {
        this.bill4 = bill4;
    }

    public Integer getBill5() {
        return bill5;
    }

    public void setBill5(Integer bill5) {
        this.bill5 = bill5;
    }

    public Integer getBill6() {
        return bill6;
    }

    public void setBill6(Integer bill6) {
        this.bill6 = bill6;
    }
}
