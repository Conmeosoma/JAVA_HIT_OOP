// CodeByConMeoSoMa
// /\_/\  
//( o.o ) 
// > ^ <
package tx1_ca2_de2;

public class NhaMay {

    private String tenNhaMay;
    private String maNhaMay;

    public NhaMay() {

    }

    public NhaMay(String tenNhaMay, String maNhaMay) {
        this.tenNhaMay = tenNhaMay;
        this.maNhaMay = maNhaMay;
    }

    public String getTenNhaMay() {
        return tenNhaMay;
    }

    public void setTenNhaMay(String tenNhaMay) {
        this.tenNhaMay = tenNhaMay;
    }

    public String getMaNhaMay() {
        return maNhaMay;
    }

    public void setMaNhaMay(String maNhaMay) {
        this.maNhaMay = maNhaMay;
    }

    @Override
    public String toString() {
        return  tenNhaMay + maNhaMay ;
    }

}
