package com.jrj.tougu.fragment.dao;

import org.apache.ibatis.annotations.Param;

import com.jrj.tougu.fragment.po.Fragment;

public interface FragmentDao {

	Fragment getFragmentInfoById(@Param("id") String id);

}
