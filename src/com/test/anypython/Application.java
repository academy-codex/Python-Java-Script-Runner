package com.test.anypython;

import py4j.GatewayServer;

public class Application {

	public static void main(String[] args) {
		EntryPoint entryPoint = new EntryPoint();
		GatewayServer server = new GatewayServer(entryPoint);
		server.start();
	}

}
