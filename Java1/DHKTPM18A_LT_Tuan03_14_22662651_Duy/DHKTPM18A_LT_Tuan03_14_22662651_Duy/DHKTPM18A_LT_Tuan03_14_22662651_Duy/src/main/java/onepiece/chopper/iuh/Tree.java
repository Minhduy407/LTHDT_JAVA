package onepiece.chopper.iuh;

public class Tree {
    private static int chieucao;
    private static int bengang;
    /**
     * thiet lap chieu cao cho cay
     * @param chieucao
     */
    public void setchieucao(int chieucao) {
        this.chieucao = chieucao;
    }

    /**
     * thiet lap ban kinh cho cay
     * @param bengang
     */
    public void setbengang(int bengang) {
        this.bengang = bengang;
    }
    /**
     * lay chieu cao cua cay
     * @param chieucao
     * @return
     */
    public static int getchieucao(int chieucao){
        return chieucao;
    }

    /**
     * lay ban kinh cua cay
     * @param bengang
     * @return
     */
    public static int getbengang(int bengang){
        return bengang;
    }
    /**
     * in ra thong tin cua cay
     * @return
     */
    public String toString(){
        return "Chieu cao: " + chieucao + "\nBan kinh: " + bengang;
    }
}
