package bt;

public class hcn {
    private int dai;
    private int rong;
    public hcn(int dai, int rong) {
        if (dai > 0 && rong > 0) {
            this.dai = dai;
            this.rong = rong;
        } else {
            throw new IllegalArgumentException("Vui long nhap so nguyen duong");
        }

    }
    public int getDai() {
        return dai;
    }
    public void setDai(int dai) {
        if (dai > 0) {
            this.dai = dai;
        }
    }
    public int getRong() {
        return rong;
    }
    public void setRong(int rong) {
        if (rong > 0) {
            this.rong = rong;
        }
    }
    public int tinhChuVi() {
        return 2 * (dai + rong);
    }

    public int tinhDienTich() {
        return dai * rong;
    }
}
