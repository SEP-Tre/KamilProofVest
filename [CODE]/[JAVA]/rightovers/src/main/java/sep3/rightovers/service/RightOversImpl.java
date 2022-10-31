package sep3.rightovers.service;

import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import sep3.rightovers.protobuf.FoodPostCreatedResponse;
import sep3.rightovers.protobuf.FoodPostRequest;
import sep3.rightovers.protobuf.RightOversServiceGrpc;

@GRpcService
public class RightOversImpl extends RightOversServiceGrpc.RightOversServiceImplBase {
    @Override
    public void saveFoodPost(FoodPostRequest request, StreamObserver<FoodPostCreatedResponse> responseObserver) {

    }
}
