package com.jrj.tougu.fragment.po;

import java.util.Date;

import lombok.Data;

@Data
public class Fragment {

	private int id;
	private int type;
	private String column_name;
	private String content;
	private String operator;
	private int status;
	private Date ctime;
	private Date utime;

}
