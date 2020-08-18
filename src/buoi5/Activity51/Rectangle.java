package buoi5.Activity51;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Rectangle {
    private int dai;
    private int rong;

    public Rectangle() {
    }

    public Rectangle(int dai, int rong) {
        this.dai = dai;
        this.rong = rong;
    }

    public int getDai() {
        return dai;
    }

    public void setDai(int dai) {
        this.dai = dai;
    }

    public int getRong() {
        return rong;
    }

    public void setRong(int rong) {
        this.rong = rong;
    }

    public int chuvi(){
        int chuvi;
        chuvi=(dai+rong)*2;
        return chuvi;
    }

    public int dientich(){
        int dientich;
        dientich=dai*rong;

        return dientich;
    }

    @Override
    public String toString() {
        return "Activity61{" +
                "dai=" + dai +
                ", rong=" + rong +
                '}';
    }

    public String kt(){
        String a="";
        if(dai==rong){
            a="tu giac la hinh vuong";
        }else{
            a="tu giac khong phai la hinh vuong";
        }
        return a;
    }
}
