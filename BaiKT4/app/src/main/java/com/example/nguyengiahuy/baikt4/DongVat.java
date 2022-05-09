package com.example.nguyengiahuy.baikt4;

public class DongVat {
    private String tendv;
    private String dactinh;
    private int IDHinhAnh;

    public DongVat(String tendv, String dactinh, int IDHinhAnh){
        this.tendv = tendv;
        this.dactinh = dactinh;
        this.IDHinhAnh = IDHinhAnh;
    }

    public String getTendv() {return tendv;}
    public void setTendv(String tendv) {this.tendv = tendv;}

    public String getDactinḥ̣() {return dactinh;}
    public void setDactinh(String dactinh) {this.dactinh = dactinh;}

    public int getIDHinhAnh() {return IDHinhAnh;}
    public void setIDHinhAnh(int idHinhAnh) {this.IDHinhAnh = idHinhAnh;}

    @Override
    public String toString()  {
        return this.tendv+" (Đặc trưng: "+ this.dactinh+")";
    }
}
