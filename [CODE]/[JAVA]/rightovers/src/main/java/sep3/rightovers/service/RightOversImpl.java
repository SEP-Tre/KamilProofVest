package sep3.rightovers.service;

import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;
import sep3.rightovers.model.FoodPost;
import sep3.rightovers.protobuf.FoodPostCreatedResponse;
import sep3.rightovers.protobuf.FoodPostRequest;
import sep3.rightovers.protobuf.RightOversServiceGrpc;
import sep3.rightovers.repository.FoodPostRepository;

@GRpcService
public class RightOversImpl extends RightOversServiceGrpc.RightOversServiceImplBase {

    @Autowired
    private FoodPostRepository foodPostRepository;
    @Override
    public void saveFoodPost(FoodPostRequest request, StreamObserver<FoodPostCreatedResponse> responseObserver) {
        System.out.println("\nSaving food post...\n");
        FoodPost foodPost = createFoodPost(request);
        FoodPost savedFoodPost = foodPostRepository.save(foodPost);
        System.out.println("Id of a new food post: " + savedFoodPost.getPostId());
        FoodPostCreatedResponse response = FoodPostCreatedResponse.newBuilder()
                .setCreated(true).setIdInDB(savedFoodPost.getPostId()).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    private static FoodPost createFoodPost(FoodPostRequest request) {
        String title = request.getTitle();
        String description = request.getDescription();
        String daysUntilExpired = request.getDaysLeftToEat();
        //To be used later \/
        String userName = request.getCreatorUserName();
        String category = request.getCategory();
        String pictureUrl = request.getPictureUrl();
        return new FoodPost(title, category,description,pictureUrl,daysUntilExpired);
    }
}
