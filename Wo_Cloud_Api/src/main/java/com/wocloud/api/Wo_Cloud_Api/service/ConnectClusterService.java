package com.wocloud.api.Wo_Cloud_Api.service;

import io.fabric8.kubernetes.client.KubernetesClient;

public interface ConnectClusterService{

	public KubernetesClient Conn();
}
