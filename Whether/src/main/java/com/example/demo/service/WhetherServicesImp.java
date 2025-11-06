package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.WhetherRepo;
import com.example.demo.cache.cacheWthether;
import com.example.demo.entity.Whether;

@Service
public class WhetherServicesImp implements WhetherService {

	@Autowired
	cacheWthether cw;
	@Autowired
	WhetherRepo wr;

	@Override
	public void saveWthetherdetails(Whether w) {

		wr.save(w);

	}

	@Override
	public Whether getWhetherdetails(int id) {

		if (cw.checkdadaincache(id)) {
			return cw.getdataincache(id);
		}
		Whether w = wr.findById(id).get();
		System.out.println("get");
		cw.storedataincache(w);

		return w;
	}

}
