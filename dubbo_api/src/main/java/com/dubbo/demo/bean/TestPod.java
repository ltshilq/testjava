package com.dubbo.demo.bean;

import java.io.Serializable;

public class TestPod implements Serializable {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String podname;
	private String nodename;
	private String containername;
	private String containerimage;
	private String containerimagepullpolicy;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPodname() {
		return podname;
	}
	public void setPodname(String podname) {
		this.podname = podname;
	}
	public String getNodename() {
		return nodename;
	}
	public void setNodename(String nodename) {
		this.nodename = nodename;
	}
	public String getContainername() {
		return containername;
	}
	public void setContainername(String containername) {
		this.containername = containername;
	}
	public String getContainerimage() {
		return containerimage;
	}
	public void setContainerimage(String containerimage) {
		this.containerimage = containerimage;
	}
	public String getContainerimagepullpolicy() {
		return containerimagepullpolicy;
	}
	public void setContainerimagepullpolicy(String containerimagepullpolicy) {
		this.containerimagepullpolicy = containerimagepullpolicy;
	}
	
	
	
}
