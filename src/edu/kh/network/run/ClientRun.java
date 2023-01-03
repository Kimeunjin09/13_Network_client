package edu.kh.network.run;

import edu.kh.network.model.service.TCPclient;

public class ClientRun {

	public static void main(String[] args) {
		
		TCPclient client = new TCPclient();
		
		client.clientStart();
	}
}
