package onepiece.chopper.iuh;

public class House {
    private static int chieudai;
    private static int chieungang;

    /**
     * thiet lap chieu dai cho ngoi nha
     * @param chieudai
     */
    void setchieudai(int chieudai){
        this.chieudai = chieudai;
    }

    /**
     * thiet lap chieu ngang cho ngoi nha
     * @param chieungang
     */
    void setchieungang(int chieungang){
        this.chieungang = chieungang;
    }

    /**
     * lay chieu dai cua ngoi nha
     * @param chieudai
     * @return
     */
    public static int getchieudai(int chieudai){
        return chieudai;
    }
    /**
     * lay chieu ngang cua ngoi nha
     * @param chieungang
     * @return
     */
    public static int getchieungang(int chieungang){
        return chieungang;
    }

    /**
     * tinh dien tich cua ngoi nha
     * @return
     */
    public static int getDienTich(){
        return chieudai * chieungang;
    }
    /**
     * chuyen doi thong tin ngoi nha thanh chuoi
     * @return
     */
    public String toString(){
        return "Chieu dai: " + chieudai + "\nChieu rong: " + chieungang + "\nDien tich: " + getDienTich();
    }
}
