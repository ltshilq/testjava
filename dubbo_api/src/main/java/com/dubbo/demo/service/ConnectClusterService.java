package com.dubbo.demo.service;

import io.fabric8.kubernetes.client.KubernetesClient;

public interface ConnectClusterService{

	public KubernetesClient Conn();
}
