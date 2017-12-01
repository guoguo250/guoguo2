package com.bubukj.proto.service;

import java.io.IOException;
import java.util.logging.Logger;

import javax.print.attribute.standard.RequestingUserName;

import com.bubukj.proto.Home;
import com.bubukj.proto.HomeRequest;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

public class HuibaoServer {
	
	private static final Logger logger = Logger.getLogger(HuibaoServer.class.getName());

	  /* The port on which the server should run */
	  private int port = 50051;
	  private Server server;
 
	  private void start() throws IOException {
	    server = ServerBuilder.forPort(port)
	        .addService(new HuibaoImpl())
	        .build()
	        .start();
	    logger.info("Server started, listening on " + port);
	    Runtime.getRuntime().addShutdownHook(new Thread() {
	      @Override
	      public void run() {
	        // Use stderr here since the logger may have been reset by its JVM shutdown hook.
	        System.err.println("*** shutting down gRPC server since JVM is shutting down");
	        HuibaoServer.this.stop();
	        System.err.println("*** server shut down");
	      }
	    });
	  }

	  private void stop() {
	    if (server != null) {
	      server.shutdown();
	    }
	  }

	  /**
	   * Await termination on the main thread since the grpc library uses daemon threads.
	   */
	  private void blockUntilShutdown() throws InterruptedException {
	    if (server != null) {
	      server.awaitTermination();
	    }
	  }

	  /**
	   * Main launches the server from the command line.
	   */
	  public static void main(String[] args) throws IOException, InterruptedException {
	    final HuibaoServer server = new HuibaoServer();
	    server.start();
	    server.blockUntilShutdown();
	  }
	  
	  
	  private class HuibaoImpl extends HuibaoHomeGrpc.HuibaoHomeImplBase {
		  
		@Override
		public void getHome(HomeRequest request,
				StreamObserver<Home> responseObserver) {
			// TODO Auto-generated method stub
			System.out.println("来了吗？？"+request.getId());
			super.getHome(request, responseObserver);
		}
		  
		  
	  }
	 
	 

}
