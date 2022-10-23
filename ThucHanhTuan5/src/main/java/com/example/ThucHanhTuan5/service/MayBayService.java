package com.example.ThucHanhTuan5.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ThucHanhTuan5.entity.MayBay;
import com.example.ThucHanhTuan5.repository.MayBayRepository;

@Service
@Transactional
public class MayBayService {
	@Autowired
	private MayBayRepository bayRepository;
	
	public void save(MayBay mayBay) {
		bayRepository.save(mayBay);
	}
	
	
	public MayBay get(Integer id) {
        return bayRepository.findById(id).get();
    }
	
	public void delete(Integer id) {
		bayRepository.deleteById(id);
	}
}
