package com.wocloud.api.Wo_Cloud_Api.service;

import java.io.File;

import com.jcraft.jsch.Session;

public interface SshToClusterService {

	public String exec(Session session, boolean closeSession, String command);
	
	public String sftp(Session session, boolean closeSession, File src, String dst);
	
	public Session getSession();
}
