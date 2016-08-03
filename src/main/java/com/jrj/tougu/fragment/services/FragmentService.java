package com.jrj.tougu.fragment.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jrj.tougu.fragment.GetFragmentInfoInterface;
import com.jrj.tougu.fragment.dao.FragmentDao;
import com.jrj.tougu.fragment.po.Fragment;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class FragmentService implements GetFragmentInfoInterface {

	@Autowired
	private FragmentDao fragmentDao;

	@Override
	public String getInfo(String id) {
		log.debug("[FragmentService] - [getInfo] - [inner] - [id:]{}", id);
		String ret = "i am " + id + " :fragment_1";
		log.debug("[FragmentService] - [getInfo] - [outter] - {}", ret);

		Fragment fragment = fragmentDao.getFragmentInfoById(id);

		log.info(fragment.toString());

		return ret;
	}

}
