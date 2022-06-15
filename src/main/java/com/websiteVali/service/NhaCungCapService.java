package com.websiteVali.service;

import java.util.List;

import com.websiteVali.entity.NhaCungCap;

public interface NhaCungCapService {
	public List<NhaCungCap> getTatCaNhaCungCap();

	public NhaCungCap getNhaCungCapTheoMaNCC(String id);
	
	public void xoaNhaCungCap(String id);
	
	public void themNhaCungCap(NhaCungCap nhaCungCap);
	
	public List<NhaCungCap> timKiemNhaCungCap(String tenNhaCungCap, int page, int size);
	
}
