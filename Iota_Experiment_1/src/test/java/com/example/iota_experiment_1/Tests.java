package com.example.iota_experiment_1;

import org.iota.Client;
import org.iota.types.ClientConfig;
import org.iota.types.ClientException;
import org.iota.types.responses.NodeInfoResponse;
import org.junit.jupiter.api.Test;

public class Tests {

  @Test
  void test_1() throws ClientException {
    Client client = new Client(new ClientConfig("{ \"nodes\": [ \"https://api.testnet.shimmer.network\" ], \"nodeSyncEnabled\": true }"));
//
//    // Get the node information for a given node.
    NodeInfoResponse response = client.getNodeInfo();
//
//    // Print the URL of the node that was requested.
    System.out.println(response.getNodeUrl());
//
//    // Print the node information for the requested node.
    System.out.println(response.getNodeInfo());
  }
}
