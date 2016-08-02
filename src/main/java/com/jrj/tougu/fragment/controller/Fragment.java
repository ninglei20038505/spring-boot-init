package com.jrj.tougu.fragment.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ApplicationObjectSupport;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jrj.tougu.fragment.GetFragmentInfoInterface;

@RestController
public class Fragment extends ApplicationObjectSupport {

	@RequestMapping(value = "/fragment/get/{id}", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
	public String getFragmentInfo(@PathVariable("id") String id) throws Exception {

		ApplicationContext ac = getApplicationContext();
		Object obj = ac.getBean("fragment_" + id);
		if (obj == null) {
			throw new Exception("service not found");
		}
		GetFragmentInfoInterface face = (GetFragmentInfoInterface) obj;

		return face.getInfo(id);
	}

}
