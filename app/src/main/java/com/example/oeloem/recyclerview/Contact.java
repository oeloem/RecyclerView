package com.example.oeloem.recyclerview;

public class Contact {

    private String nama, status, tipePhone;
    private Integer photoPic;

    public Contact(String subarjo, String tukang_gorengan, String mobile, int icon) {
    }


    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTipePhone() {
        return tipePhone;
    }

    public void setTipePhone(String tipePhone) {
        this.tipePhone = tipePhone;
    }

    public Integer getPhotoPic() {
        return photoPic;
    }

    public void setPhotoPic(Integer photoPic) {
        this.photoPic = photoPic;
    }
}
