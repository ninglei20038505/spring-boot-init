package com.jrj.tougu.fragment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ApplicationObjectSupport;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jrj.tougu.fragment.GetFragmentInfoInterface;
import com.jrj.tougu.fragment.services.FragmentService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class Fragment extends ApplicationObjectSupport {
	
	@Autowired
	private FragmentService fragmentService;

	@RequestMapping(value = "/fragment/get/{id}", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
	public String getFragmentInfo(@PathVariable("id") String id) throws Exception {
		log.info("[Fragment] - [getFragmentInfo] - [inner] - [id:]{}", id);
//		ApplicationContext ac = getApplicationContext();
//		Object obj = ac.getBean("fragment_" + id);
//		if (obj == null) {
//			throw new Exception("service not found");
//		}
//		GetFragmentInfoInterface face = (GetFragmentInfoInterface) obj;
		String ret = fragmentService.getInfo(id);
		log.info("[Fragment] - [getFragmentInfo] - [outter] - {}", ret);
		return ret;
	}

}
