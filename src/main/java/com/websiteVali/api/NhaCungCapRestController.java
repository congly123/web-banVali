package com.websiteVali.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.websiteVali.converter.NhaCungCapConverter;
import com.websiteVali.dto.NhaCungCapDTO;
import com.websiteVali.entity.MauSanPham;
import com.websiteVali.entity.NhaCungCap;
import com.websiteVali.entity.SanPham;
import com.websiteVali.service.NhaCungCapService;
import com.websiteVali.service.SanPhamService;


@RestController
@RequestMapping("/api/nha-cung-cap")
public class NhaCungCapRestController {
	
	@Autowired
	private NhaCungCapService nhaCungCapService;
	@Autowired
	private SanPhamService sanPhamService;
	
	@Autowired
	private NhaCungCapConverter nhaCungCapConverter;
	
	@GetMapping("/danh-sach")
	public List<NhaCungCapDTO> getDanhSachNhaCungCapTheoTen(@RequestParam("tenNhaCungCap") String tenNhaCungCap,
			@RequestParam(value = "page", defaultValue = "0") int page,
			@RequestParam(value = "size", defaultValue = "10") int size){
		List<NhaCungCapDTO> nhaCungCapDTOs = new ArrayList<NhaCungCapDTO>();
		List<NhaCungCap> nhaCungCaps = nhaCungCapService.timKiemNhaCungCap(tenNhaCungCap, page, size);
		
		for(NhaCungCap ncc : nhaCungCaps) {
			NhaCungCapDTO capDTO = nhaCungCapConverter.toNhaCungCapDTO(ncc);
			nhaCungCapDTOs.add(capDTO);
		}
		return nhaCungCapDTOs;
	}
	
	@DeleteMapping("/xoa")
	public int xoaMau(@RequestParam("id") String id) {
		List<SanPham> sanPhams = sanPhamService.getDanhSachSanPhamTheoNhaCungCap(id);
		if(sanPhams.size() > 0)
			return -1;
		nhaCungCapService.xoaNhaCungCap(id);
		return 1;
	}
	
}
