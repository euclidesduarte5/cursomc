package com.euclides.cursomc.resources.exception;

import java.io.Serializable;

public class StandartError  implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer status;
	private String msg;
	private Long timeLong;
	
	
	public StandartError(Integer status, String msg, Long timeLong) {
		super();
		this.status = status;
		this.msg = msg;
		this.timeLong = timeLong;
	}


	public Integer getStatus() {
		return status;
	}


	public void setStatus(Integer status) {
		this.status = status;
	}


	public String getMsg() {
		return msg;
	}


	public void setMsg(String msg) {
		this.msg = msg;
	}


	public Long getTimeLong() {
		return timeLong;
	}


	public void setTimeLong(Long timeLong) {
		this.timeLong = timeLong;
	}
	
	

}
