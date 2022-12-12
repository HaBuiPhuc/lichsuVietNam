package lichsu;

public class TrieuDai {
	private String ten, nguoiSangLap, queHuong, kinhDo, thoiGian;

	public String getThoiGian() {
		return thoiGian;
	}

	public void setThoiGian(String thoiGian) {
		this.thoiGian = thoiGian;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getNguoiSangLap() {
		return nguoiSangLap;
	}

	public void setNguoiSangLap(String nguoiSangLap) {
		this.nguoiSangLap = nguoiSangLap;
	}

	public String getQueHuong() {
		return queHuong;
	}

	public void setQueHuong(String queHuong) {
		this.queHuong = queHuong;
	}

	public String getKinhDo() {
		return kinhDo;
	}

	public void setKinhDo(String kinhDo) {
		this.kinhDo = kinhDo;
	}
	@Override
	public String toString () {
		return "tên:" + ten + "\n" + "sáng lập: " + nguoiSangLap + "\n"
	+ "quê hương :" + queHuong + "\n" + "kinh đô:" + kinhDo + "\n" + "thời gian: " +thoiGian+"\n\n";
		
	}

}
