// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Rightovers.proto

package sep3.rightovers.protobuf;

public final class Rightovers {
  private Rightovers() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_rightovers_grpc_FoodPostRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_rightovers_grpc_FoodPostRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_rightovers_grpc_FoodPostCreatedResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_rightovers_grpc_FoodPostCreatedResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_rightovers_grpc_GetAllRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_rightovers_grpc_GetAllRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_rightovers_grpc_GetAllResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_rightovers_grpc_GetAllResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020Rightovers.proto\022\017rightovers.grpc\"\213\001\n\017" +
      "FoodPostRequest\022\r\n\005title\030\001 \001(\t\022\023\n\013descri" +
      "ption\030\002 \001(\t\022\025\n\rdaysLeftToEat\030\003 \001(\t\022\027\n\017cr" +
      "eatorUserName\030\004 \001(\t\022\020\n\010category\030\005 \001(\t\022\022\n" +
      "\npictureUrl\030\006 \001(\t\":\n\027FoodPostCreatedResp" +
      "onse\022\017\n\007created\030\001 \001(\010\022\016\n\006idInDB\030\002 \001(\005\"\037\n" +
      "\rGetAllRequest\022\016\n\006filler\030\001 \001(\010\"1\n\016GetAll" +
      "Response\022\r\n\005title\030\001 \001(\t\022\020\n\010category\030\002 \001(" +
      "\t2\305\001\n\021RightOversService\022Z\n\014saveFoodPost\022" +
      " .rightovers.grpc.FoodPostRequest\032(.righ" +
      "tovers.grpc.FoodPostCreatedResponse\022T\n\017g" +
      "etAllFoodPosts\022\036.rightovers.grpc.GetAllR" +
      "equest\032\037.rightovers.grpc.GetAllResponse0" +
      "\001B\034\n\030sep3.rightovers.protobufP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_rightovers_grpc_FoodPostRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_rightovers_grpc_FoodPostRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_rightovers_grpc_FoodPostRequest_descriptor,
        new java.lang.String[] { "Title", "Description", "DaysLeftToEat", "CreatorUserName", "Category", "PictureUrl", });
    internal_static_rightovers_grpc_FoodPostCreatedResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_rightovers_grpc_FoodPostCreatedResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_rightovers_grpc_FoodPostCreatedResponse_descriptor,
        new java.lang.String[] { "Created", "IdInDB", });
    internal_static_rightovers_grpc_GetAllRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_rightovers_grpc_GetAllRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_rightovers_grpc_GetAllRequest_descriptor,
        new java.lang.String[] { "Filler", });
    internal_static_rightovers_grpc_GetAllResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_rightovers_grpc_GetAllResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_rightovers_grpc_GetAllResponse_descriptor,
        new java.lang.String[] { "Title", "Category", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
