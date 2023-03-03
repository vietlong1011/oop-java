package exercise_eight.dto;

public class TheMuon {
    private int idCart ;
    private String dateStart ;
    private String dateEnd ;
    private String idBook;
    private SinhVien sinhVien;
    public TheMuon(){};

    public TheMuon(int idCart, String dateStart, String dateEnd, String idBook, SinhVien sinhVien) {
        this.idCart = idCart;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
        this.idBook = idBook;
        this.sinhVien = sinhVien;
    }
    public int getIdCart() {
        return idCart;
    }

    public void setIdCart(int idCart) {
        this.idCart = idCart;
    }

    public String getDateStart() {
        return dateStart;
    }

    public void setDateStart(String dateStart) {
        this.dateStart = dateStart;
    }

    public String getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(String dateEnd) {
        this.dateEnd = dateEnd;
    }

    public String getIdBook() {
        return idBook;
    }

    public void setIdBook(String idBook) {
        this.idBook = idBook;
    }

    public SinhVien getSinhVien() {
        return sinhVien;
    }

    public void setSinhVien(SinhVien sinhVien) {
        this.sinhVien = sinhVien;
    }

    @Override
    public String toString() {
        return "TheMuon{" +
                "idCart=" + idCart +
                ", dateStart='" + dateStart + '\'' +
                ", dateEnd='" + dateEnd + '\'' +
                ", idBook='" + idBook + '\'' +
                ", sinhVien=" + sinhVien +
                '}';
    }
}
