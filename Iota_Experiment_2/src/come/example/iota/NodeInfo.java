package come.example.iota;

import org.iota.Client;
import org.iota.types.ClientConfig;
import org.iota.types.ClientException;
import org.iota.types.responses.NodeInfoResponse;

public class NodeInfo {

  public static void main(String[] args) throws ClientException {

    Client client = new Client(new ClientConfig(
        """
            {"nodes": [ "https://api.testnet.shimmer.network" ], "nodeSyncEnabled": true }
            """
    ));

//    NodeCoreApi b = new NodeCoreApi(new ClientConfig("""
//            {"nodes": [ "https://api.testnet.shimmer.network" ], "nodeSyncEnabled": true }
//            """));
//    System.out.println("Api Info====== "+b.);
    NodeInfoResponse response = client.getNodeInfo();
    System.out.println("URL======== " + response.getNodeUrl());
    System.out.println("INFO======== " + response.getNodeInfo());
  }
}
