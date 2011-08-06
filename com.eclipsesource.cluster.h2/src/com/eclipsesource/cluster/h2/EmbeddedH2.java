package com.eclipsesource.cluster.h2;

import java.io.IOException;
import java.sql.SQLException;

import org.h2.tools.Server;

public class EmbeddedH2 {

	public static void main(String[] args) throws SQLException, IOException {
		String[] serverArgs = new String[] { "-tcp", "-tcpAllowOthers", "true", "-tcpPort", "9101" };
		Server server = Server.createTcpServer(serverArgs ).start();
		System.out.println("Press <return> to shutdown H2 server.");
		System.in.read();
		server.shutdown();
	}
}
