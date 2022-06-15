package com.websiteVali.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.websiteVali.entity.NhaCungCap;
import com.websiteVali.repository.NhaCungCapRepository;
import com.websiteVali.service.NhaCungCapService;

@Service
public class NhaCungCapServiceImpl implements NhaCungCapService {

	@Autowired
	NhaCungCapRepository nhaCungCapRepository;

	@Override
	public List<NhaCungCap> getTatCaNhaCungCap() {

		List<NhaCungCap> nhaCungCaps = nhaCungCapRepository.findAll();
		return nhaCungCaps;
	}

	@Override
	public NhaCungCap getNhaCungCapTheoMaNCC(String id) {

		NhaCungCap nhaCungCap = nhaCungCapRepository.findById(id).get();

		return nhaCungCap;
	}

	@Override
	public void xoaNhaCungCap(String id) {

		nhaCungCapRepository.deleteById(id);

	}

	@Override
	public void themNhaCungCap(NhaCungCap nhaCungCap) {

		nhaCungCapRepository.save(nhaCungCap);

	}

	@Override
	public List<NhaCungCap> timKiemNhaCungCap(String tenNhaCungCap, int page, int size) {
		
		List<NhaCungCap> nhaCungCaps = nhaCungCapRepository.findByTenNhaCungCapContaining(tenNhaCungCap, PageRequest.of(page, size));
		
		return nhaCungCaps;
	}

}
