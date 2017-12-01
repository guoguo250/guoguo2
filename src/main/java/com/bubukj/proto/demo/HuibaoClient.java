package com.bubukj.proto.demo;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.bubukj.proto.Home;
import com.bubukj.proto.HomeRequest;
import com.bubukj.proto.service.HuibaoHomeGrpc;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;

public class HuibaoClient {
	
	
	private static final Logger logger = Logger.getLogger(HuibaoClient.class.getName());

	  private final ManagedChannel channel;
	  private final HuibaoHomeGrpc.HuibaoHomeBlockingStub blockingStub;

	  /** Construct client connecting to HelloWorld server at {@code host:port}. */
	  public HuibaoClient(String host, int port) {
	    channel = ManagedChannelBuilder.forAddress(host, port)
	        .usePlaintext(true)
	        .build();
	    blockingStub = HuibaoHomeGrpc.newBlockingStub(channel);
	  }

	  public void shutdown() throws InterruptedException {
	    channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
	  }

	  /** Say hello to server. */
	  public void greet(String name) {
	    logger.info("Will try to greet " + name + " ...");
	    HomeRequest request = HomeRequest.newBuilder().setId(name).build();
	    Home response;
	    try {
	    	response = blockingStub.getHome(request);
	      //response = blockingStub.sayHello(request);
	    } catch (StatusRuntimeException e) {
	      logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
	      return;
	    }
	    logger.info("Greeting: " + response.getSerializedSize());
	  }

	  /**
	   * Greet server. If provided, the first element of {@code args} is the name to use in the
	   * greeting.
	   */
	  public static void main(String[] args) throws Exception {
	    HuibaoClient client = new HuibaoClient("localhost", 50051);
	    try {
	      /* Access a service running on the local machine on port 50051 */
	      String user = "xiaotian";
	      if (args.length > 0) {
	        user = args[0]; /* Use the arg as the name to greet if provided */
	      }
	      client.greet(user);
	    } finally {
	      client.shutdown();
	    }
	  }

}
