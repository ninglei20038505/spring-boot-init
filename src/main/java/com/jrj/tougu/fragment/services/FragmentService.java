package com.jrj.tougu.fragment.services;

import org.springframework.stereotype.Service;

import com.jrj.tougu.fragment.GetFragmentInfoInterface;

@Service(value="fragment_1")
public class FragmentService implements GetFragmentInfoInterface{

	@Override
	public String getInfo(String id) {
		return "i am " + id + " :fragment_1";
	}
	
	

}
