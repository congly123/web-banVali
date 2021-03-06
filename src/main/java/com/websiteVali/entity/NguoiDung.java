package com.websiteVali.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "NguoiDungs")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class NguoiDung {

	@Id
	@Column(name = "nguoi_dung_id")
	private String id;

	@Column(name = "ho_ten", columnDefinition = "NVARCHAR(MAX)")
	private String hoTen;

	@Column(name = "email")
	private String email;
	
	@Column(name = "so_dien_thoai")
	private String soDienThoai;

	@Column(name = "dia_chi", columnDefinition = "NVARCHAR(MAX)")
	private String diaChi;

	@Column(name = "password")
	private String password;

	@Column(name = "role")
	@Enumerated(EnumType.STRING)
	private ROLE role;

	@Column(name = "ma_xac_nhan")
	private String maXacNhan;

	@Column(name = "trang_thai")
	private boolean trangThai;

	@OneToMany(mappedBy = "nguoiDung", fetch = FetchType.LAZY)
	@EqualsAndHashCode.Exclude
	@ToString.Exclude
	private List<HoaDon> hoaDons;

	@OneToMany(mappedBy = "nguoiDung", fetch = FetchType.LAZY)
	@EqualsAndHashCode.Exclude
	@ToString.Exclude
	private List<BinhLuan> binhLuans;

	public NguoiDung(String id, String hoTen,String soDienThoai, String email, String password, ROLE role, String maXacNhan,
			boolean trangThai) {
		super();
		this.id = id;
		this.hoTen = hoTen;
		this.email = email;
		this.soDienThoai = soDienThoai;
		this.password = password;
		this.role = role;
		this.maXacNhan = maXacNhan;
		this.trangThai = trangThai;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSoDienThoai() {
		return soDienThoai;
	}

	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public ROLE getRole() {
		return role;
	}

	public void setRole(ROLE role) {
		this.role = role;
	}

	public String getMaXacNhan() {
		return maXacNhan;
	}

	public void setMaXacNhan(String maXacNhan) {
		this.maXacNhan = maXacNhan;
	}

	public boolean isTrangThai() {
		return trangThai;
	}

	public void setTrangThai(boolean trangThai) {
		this.trangThai = trangThai;
	}

	public List<HoaDon> getHoaDons() {
		return hoaDons;
	}

	public void setHoaDons(List<HoaDon> hoaDons) {
		this.hoaDons = hoaDons;
	}

	public List<BinhLuan> getBinhLuans() {
		return binhLuans;
	}

	public void setBinhLuans(List<BinhLuan> binhLuans) {
		this.binhLuans = binhLuans;
	}

	public NguoiDung() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "NguoiDung [id=" + id + ", hoTen=" + hoTen + ", email=" + email + ", soDienThoai=" + soDienThoai
				+ ", diaChi=" + diaChi + ", password=" + password + ", role=" + role + ", maXacNhan=" + maXacNhan
				+ ", trangThai=" + trangThai + ", hoaDons=" + hoaDons + ", binhLuans=" + binhLuans + "]";
	}
	
	

}
