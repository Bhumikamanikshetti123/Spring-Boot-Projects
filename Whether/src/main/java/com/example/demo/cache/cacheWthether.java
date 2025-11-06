package com.example.demo.cache;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.demo.entity.Whether;

@Component
public class cacheWthether {

	List<Whether> l = new ArrayList<>();

	public void storedataincache(Whether w) {
		System.out.println("store data in from cache");
		l.add(w);
	}

	public Whether getdataincache(int cityID) {

		System.out.println("get data from cache");

		for (Whether w : l) {
			if (w.getCityid() == cityID) {

				return w;

			}
		}
		return null;
	}

	public boolean checkdadaincache(int cityID) {
		System.out.println("cache data from cache");
		for (Whether w : l) {
			if (w.getCityid() == cityID) {
				return true;
			}
		}
		return false;
	}
}
