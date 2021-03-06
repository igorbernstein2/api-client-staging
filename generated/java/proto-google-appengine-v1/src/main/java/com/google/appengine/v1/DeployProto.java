// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/appengine/v1/deploy.proto

package com.google.appengine.v1;

public final class DeployProto {
  private DeployProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_appengine_v1_Deployment_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_appengine_v1_Deployment_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_appengine_v1_Deployment_FilesEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_appengine_v1_Deployment_FilesEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_appengine_v1_FileInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_appengine_v1_FileInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_appengine_v1_ContainerInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_appengine_v1_ContainerInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_appengine_v1_ZipInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_appengine_v1_ZipInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n google/appengine/v1/deploy.proto\022\023goog" +
      "le.appengine.v1\032\034google/api/annotations." +
      "proto\"\366\001\n\nDeployment\0229\n\005files\030\001 \003(\0132*.go" +
      "ogle.appengine.v1.Deployment.FilesEntry\022" +
      "5\n\tcontainer\030\002 \001(\0132\".google.appengine.v1" +
      ".ContainerInfo\022)\n\003zip\030\003 \001(\0132\034.google.app" +
      "engine.v1.ZipInfo\032K\n\nFilesEntry\022\013\n\003key\030\001" +
      " \001(\t\022,\n\005value\030\002 \001(\0132\035.google.appengine.v" +
      "1.FileInfo:\0028\001\"C\n\010FileInfo\022\022\n\nsource_url" +
      "\030\001 \001(\t\022\020\n\010sha1_sum\030\002 \001(\t\022\021\n\tmime_type\030\003 ",
      "\001(\t\"\036\n\rContainerInfo\022\r\n\005image\030\001 \001(\t\"2\n\007Z" +
      "ipInfo\022\022\n\nsource_url\030\003 \001(\t\022\023\n\013files_coun" +
      "t\030\004 \001(\005Bf\n\027com.google.appengine.v1B\013Depl" +
      "oyProtoP\001Z<google.golang.org/genproto/go" +
      "ogleapis/appengine/v1;appengineb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
        }, assigner);
    internal_static_google_appengine_v1_Deployment_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_appengine_v1_Deployment_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_appengine_v1_Deployment_descriptor,
        new java.lang.String[] { "Files", "Container", "Zip", });
    internal_static_google_appengine_v1_Deployment_FilesEntry_descriptor =
      internal_static_google_appengine_v1_Deployment_descriptor.getNestedTypes().get(0);
    internal_static_google_appengine_v1_Deployment_FilesEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_appengine_v1_Deployment_FilesEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_google_appengine_v1_FileInfo_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_appengine_v1_FileInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_appengine_v1_FileInfo_descriptor,
        new java.lang.String[] { "SourceUrl", "Sha1Sum", "MimeType", });
    internal_static_google_appengine_v1_ContainerInfo_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_appengine_v1_ContainerInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_appengine_v1_ContainerInfo_descriptor,
        new java.lang.String[] { "Image", });
    internal_static_google_appengine_v1_ZipInfo_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_appengine_v1_ZipInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_appengine_v1_ZipInfo_descriptor,
        new java.lang.String[] { "SourceUrl", "FilesCount", });
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
