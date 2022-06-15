package com.websiteVali.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class NhaCungCapDTO {

	private String maNhaCungCap;

	private String tenNhaCungCap;

	private String soDienThoai;

	private String email;

	private String website;

	private String tinhThanhPho;

	private String quanHuyen;

	private String phuongXa;

	private String diaChi;
	
	

	public NhaCungCapDTO(String tenNhaCungCap, String soDienThoai, String email, String website, String tinhThanhPho,
			String quanHuyen, String phuongXa, String diaChi) {
		super();
		this.tenNhaCungCap = tenNhaCungCap;
		this.soDienThoai = soDienThoai;
		this.email = email;
		this.website = website;
		this.tinhThanhPho = tinhThanhPho;
		this.quanHuyen = quanHuyen;
		this.phuongXa = phuongXa;
		this.diaChi = diaChi;
	}

	public NhaCungCapDTO() {
		super();
		this.tinhThanhPho ="";
		this.quanHuyen = "";
		this.phuongXa = "";
		this.diaChi = "";
	}

	public NhaCungCapDTO(String maNhaCungCap, String tenNhaCungCap, String soDienThoai, String email, String website,
			String tinhThanhPho, String quanHuyen, String phuongXa, String diaChi) {
		super();
		this.maNhaCungCap = maNhaCungCap;
		this.tenNhaCungCap = tenNhaCungCap;
		this.soDienThoai = soDienThoai;
		this.email = email;
		this.website = website;
		this.tinhThanhPho = tinhThanhPho;
		this.quanHuyen = quanHuyen;
		this.phuongXa = phuongXa;
		this.diaChi = diaChi;
	}

	public String getMaNhaCungCap() {
		return maNhaCungCap;
	}

	public void setMaNhaCungCap(String maNhaCungCap) {
		this.maNhaCungCap = maNhaCungCap;
	}

	public String getTenNhaCungCap() {
		return tenNhaCungCap;
	}

	public void setTenNhaCungCap(String tenNhaCungCap) {
		this.tenNhaCungCap = tenNhaCungCap;
	}

	public String getSoDienThoai() {
		return soDienThoai;
	}

	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getTinhThanhPho() {
		return tinhThanhPho;
	}

	public void setTinhThanhPho(String tinhThanhPho) {
		this.tinhThanhPho = tinhThanhPho;
	}

	public String getQuanHuyen() {
		return quanHuyen;
	}

	public void setQuanHuyen(String quanHuyen) {
		this.quanHuyen = quanHuyen;
	}

	public String getPhuongXa() {
		return phuongXa;
	}

	public void setPhuongXa(String phuongXa) {
		this.phuongXa = phuongXa;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	@Override
	public String toString() {
		return "NhaCungCapDTO [maNhaCungCap=" + maNhaCungCap + ", tenNhaCungCap=" + tenNhaCungCap + ", soDienThoai="
				+ soDienThoai + ", email=" + email + ", website=" + website + ", tinhThanhPho=" + tinhThanhPho
				+ ", quanHuyen=" + quanHuyen + ", phuongXa=" + phuongXa + ", diaChi=" + diaChi + "]";
	}
	
}
