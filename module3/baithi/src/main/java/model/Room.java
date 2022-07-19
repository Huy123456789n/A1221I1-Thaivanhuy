package model;

public class Room {
    private int id;
    private String name;
    private String sdt;
    private String starDay;
    private int idThanhToan;
    private String note;
    private String nameThanhToan;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getStarDay() {
        return starDay;
    }

    public void setStarDay(String starDay) {
        this.starDay = starDay;
    }

    public int getIdThanhToan() {
        return idThanhToan;
    }

    public void setIdThanhToan(int idThanhToan) {
        this.idThanhToan = idThanhToan;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getNameThanhToan() {
        return nameThanhToan;
    }

    public void setNameThanhToan(String nameThanhToan) {
        this.nameThanhToan = nameThanhToan;
    }

    public Room(int id, String name, String sdt, String starDay, int idThanhToan, String note, String nameThanhToan) {
        this.id = id;
        this.name = name;
        this.sdt = sdt;
        this.starDay = starDay;
        this.idThanhToan = idThanhToan;
        this.note = note;
        this.nameThanhToan = nameThanhToan;
    }
    public Room(int id, String name, String sdt, String starDay, String note, String nameThanhToan) {
        this.id = id;
        this.name = name;
        this.sdt = sdt;
        this.starDay = starDay;
        this.note = note;
        this.nameThanhToan = nameThanhToan;
    }
    public Room( String name, String sdt, String starDay, String note, String nameThanhToan) {
        this.name = name;
        this.sdt = sdt;
        this.starDay = starDay;
        this.note = note;
        this.nameThanhToan = nameThanhToan;
    }
    public Room( String name, String sdt, String starDay, String note, int idThanhToan) {
        this.name = name;
        this.sdt = sdt;
        this.starDay = starDay;
        this.note = note;
        this.idThanhToan = idThanhToan;
    }
    public Room(int id, String name, String sdt, String starDay, String note, int idThanhToan) {
        this.id = id;
        this.name = name;
        this.sdt = sdt;
        this.starDay = starDay;
        this.note = note;
        this.idThanhToan = idThanhToan;
    }

}
