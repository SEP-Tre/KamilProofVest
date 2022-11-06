package sep3.rightovers.service;

import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;
import sep3.rightovers.model.FoodPost;
import sep3.rightovers.protobuf.*;
import sep3.rightovers.repository.FoodPostRepository;

import java.util.ArrayList;

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

    @Override
    public void getAllFoodPosts(GetAllRequest request, StreamObserver<GetAllResponse> responseObserver)
    {
        ArrayList<FoodPost> allPosts = (ArrayList<FoodPost>) foodPostRepository.findAll();
        System.out.println("All posts: " + allPosts.toString());
        for (int i = 0; i < allPosts.size(); i++)
        {
            GetAllResponse response = GetAllResponse.newBuilder()
                    .setTitle(allPosts.get(i).getTitle()).setCategory(allPosts.get(i).getCategory()).build();
            responseObserver.onNext(response);
        };
        responseObserver.onCompleted();
    }
}
