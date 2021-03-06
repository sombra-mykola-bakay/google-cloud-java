// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/redis/v1/cloud_redis.proto

package com.google.cloud.redis.v1;

public final class CloudRedisServiceV1Proto {
  private CloudRedisServiceV1Proto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_redis_v1_Instance_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_redis_v1_Instance_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_redis_v1_Instance_LabelsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_redis_v1_Instance_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_redis_v1_Instance_RedisConfigsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_redis_v1_Instance_RedisConfigsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_redis_v1_ListInstancesRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_redis_v1_ListInstancesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_redis_v1_ListInstancesResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_redis_v1_ListInstancesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_redis_v1_GetInstanceRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_redis_v1_GetInstanceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_redis_v1_CreateInstanceRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_redis_v1_CreateInstanceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_redis_v1_UpdateInstanceRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_redis_v1_UpdateInstanceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_redis_v1_DeleteInstanceRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_redis_v1_DeleteInstanceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_redis_v1_OperationMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_redis_v1_OperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_redis_v1_LocationMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_redis_v1_LocationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_redis_v1_LocationMetadata_AvailableZonesEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_redis_v1_LocationMetadata_AvailableZonesEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_redis_v1_ZoneMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_redis_v1_ZoneMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\'google/cloud/redis/v1/cloud_redis.prot" +
      "o\022\025google.cloud.redis.v1\032\034google/api/ann" +
      "otations.proto\032#google/longrunning/opera" +
      "tions.proto\032 google/protobuf/field_mask." +
      "proto\032\037google/protobuf/timestamp.proto\"\320" +
      "\006\n\010Instance\022\014\n\004name\030\001 \001(\t\022\024\n\014display_nam" +
      "e\030\002 \001(\t\022;\n\006labels\030\003 \003(\0132+.google.cloud.r" +
      "edis.v1.Instance.LabelsEntry\022\023\n\013location" +
      "_id\030\004 \001(\t\022\037\n\027alternative_location_id\030\005 \001" +
      "(\t\022\025\n\rredis_version\030\007 \001(\t\022\031\n\021reserved_ip" +
      "_range\030\t \001(\t\022\014\n\004host\030\n \001(\t\022\014\n\004port\030\013 \001(\005" +
      "\022\033\n\023current_location_id\030\014 \001(\t\022/\n\013create_" +
      "time\030\r \001(\0132\032.google.protobuf.Timestamp\0224" +
      "\n\005state\030\016 \001(\0162%.google.cloud.redis.v1.In" +
      "stance.State\022\026\n\016status_message\030\017 \001(\t\022H\n\r" +
      "redis_configs\030\020 \003(\01321.google.cloud.redis" +
      ".v1.Instance.RedisConfigsEntry\0222\n\004tier\030\021" +
      " \001(\0162$.google.cloud.redis.v1.Instance.Ti" +
      "er\022\026\n\016memory_size_gb\030\022 \001(\005\022\032\n\022authorized" +
      "_network\030\024 \001(\t\032-\n\013LabelsEntry\022\013\n\003key\030\001 \001" +
      "(\t\022\r\n\005value\030\002 \001(\t:\0028\001\0323\n\021RedisConfigsEnt" +
      "ry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\"s\n\005St" +
      "ate\022\025\n\021STATE_UNSPECIFIED\020\000\022\014\n\010CREATING\020\001" +
      "\022\t\n\005READY\020\002\022\014\n\010UPDATING\020\003\022\014\n\010DELETING\020\004\022" +
      "\r\n\tREPAIRING\020\005\022\017\n\013MAINTENANCE\020\006\"8\n\004Tier\022" +
      "\024\n\020TIER_UNSPECIFIED\020\000\022\t\n\005BASIC\020\001\022\017\n\013STAN" +
      "DARD_HA\020\003\"M\n\024ListInstancesRequest\022\016\n\006par" +
      "ent\030\001 \001(\t\022\021\n\tpage_size\030\002 \001(\005\022\022\n\npage_tok" +
      "en\030\003 \001(\t\"d\n\025ListInstancesResponse\0222\n\tins" +
      "tances\030\001 \003(\0132\037.google.cloud.redis.v1.Ins" +
      "tance\022\027\n\017next_page_token\030\002 \001(\t\"\"\n\022GetIns" +
      "tanceRequest\022\014\n\004name\030\001 \001(\t\"o\n\025CreateInst" +
      "anceRequest\022\016\n\006parent\030\001 \001(\t\022\023\n\013instance_" +
      "id\030\002 \001(\t\0221\n\010instance\030\003 \001(\0132\037.google.clou" +
      "d.redis.v1.Instance\"{\n\025UpdateInstanceReq" +
      "uest\022/\n\013update_mask\030\001 \001(\0132\032.google.proto" +
      "buf.FieldMask\0221\n\010instance\030\002 \001(\0132\037.google" +
      ".cloud.redis.v1.Instance\"%\n\025DeleteInstan" +
      "ceRequest\022\014\n\004name\030\001 \001(\t\"\326\001\n\021OperationMet" +
      "adata\022/\n\013create_time\030\001 \001(\0132\032.google.prot" +
      "obuf.Timestamp\022,\n\010end_time\030\002 \001(\0132\032.googl" +
      "e.protobuf.Timestamp\022\016\n\006target\030\003 \001(\t\022\014\n\004" +
      "verb\030\004 \001(\t\022\025\n\rstatus_detail\030\005 \001(\t\022\030\n\020can" +
      "cel_requested\030\006 \001(\010\022\023\n\013api_version\030\007 \001(\t" +
      "\"\304\001\n\020LocationMetadata\022T\n\017available_zones" +
      "\030\001 \003(\0132;.google.cloud.redis.v1.LocationM" +
      "etadata.AvailableZonesEntry\032Z\n\023Available" +
      "ZonesEntry\022\013\n\003key\030\001 \001(\t\0222\n\005value\030\002 \001(\0132#" +
      ".google.cloud.redis.v1.ZoneMetadata:\0028\001\"" +
      "\016\n\014ZoneMetadata2\245\006\n\nCloudRedis\022\241\001\n\rListI" +
      "nstances\022+.google.cloud.redis.v1.ListIns" +
      "tancesRequest\032,.google.cloud.redis.v1.Li" +
      "stInstancesResponse\"5\202\323\344\223\002/\022-/v1/{parent" +
      "=projects/*/locations/*}/instances\022\220\001\n\013G" +
      "etInstance\022).google.cloud.redis.v1.GetIn" +
      "stanceRequest\032\037.google.cloud.redis.v1.In" +
      "stance\"5\202\323\344\223\002/\022-/v1/{name=projects/*/loc" +
      "ations/*/instances/*}\022\236\001\n\016CreateInstance" +
      "\022,.google.cloud.redis.v1.CreateInstanceR" +
      "equest\032\035.google.longrunning.Operation\"?\202" +
      "\323\344\223\0029\"-/v1/{parent=projects/*/locations/" +
      "*}/instances:\010instance\022\247\001\n\016UpdateInstanc" +
      "e\022,.google.cloud.redis.v1.UpdateInstance" +
      "Request\032\035.google.longrunning.Operation\"H" +
      "\202\323\344\223\002B26/v1/{instance.name=projects/*/lo" +
      "cations/*/instances/*}:\010instance\022\224\001\n\016Del" +
      "eteInstance\022,.google.cloud.redis.v1.Dele" +
      "teInstanceRequest\032\035.google.longrunning.O" +
      "peration\"5\202\323\344\223\002/*-/v1/{name=projects/*/l" +
      "ocations/*/instances/*}Bs\n\031com.google.cl" +
      "oud.redis.v1B\030CloudRedisServiceV1ProtoP\001" +
      "Z:google.golang.org/genproto/googleapis/" +
      "cloud/redis/v1;redisb\006proto3"
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
          com.google.longrunning.OperationsProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        }, assigner);
    internal_static_google_cloud_redis_v1_Instance_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_redis_v1_Instance_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_redis_v1_Instance_descriptor,
        new java.lang.String[] { "Name", "DisplayName", "Labels", "LocationId", "AlternativeLocationId", "RedisVersion", "ReservedIpRange", "Host", "Port", "CurrentLocationId", "CreateTime", "State", "StatusMessage", "RedisConfigs", "Tier", "MemorySizeGb", "AuthorizedNetwork", });
    internal_static_google_cloud_redis_v1_Instance_LabelsEntry_descriptor =
      internal_static_google_cloud_redis_v1_Instance_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_redis_v1_Instance_LabelsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_redis_v1_Instance_LabelsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_google_cloud_redis_v1_Instance_RedisConfigsEntry_descriptor =
      internal_static_google_cloud_redis_v1_Instance_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_redis_v1_Instance_RedisConfigsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_redis_v1_Instance_RedisConfigsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_google_cloud_redis_v1_ListInstancesRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_redis_v1_ListInstancesRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_redis_v1_ListInstancesRequest_descriptor,
        new java.lang.String[] { "Parent", "PageSize", "PageToken", });
    internal_static_google_cloud_redis_v1_ListInstancesResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_redis_v1_ListInstancesResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_redis_v1_ListInstancesResponse_descriptor,
        new java.lang.String[] { "Instances", "NextPageToken", });
    internal_static_google_cloud_redis_v1_GetInstanceRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_redis_v1_GetInstanceRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_redis_v1_GetInstanceRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_cloud_redis_v1_CreateInstanceRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_redis_v1_CreateInstanceRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_redis_v1_CreateInstanceRequest_descriptor,
        new java.lang.String[] { "Parent", "InstanceId", "Instance", });
    internal_static_google_cloud_redis_v1_UpdateInstanceRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_redis_v1_UpdateInstanceRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_redis_v1_UpdateInstanceRequest_descriptor,
        new java.lang.String[] { "UpdateMask", "Instance", });
    internal_static_google_cloud_redis_v1_DeleteInstanceRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_redis_v1_DeleteInstanceRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_redis_v1_DeleteInstanceRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_cloud_redis_v1_OperationMetadata_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_redis_v1_OperationMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_redis_v1_OperationMetadata_descriptor,
        new java.lang.String[] { "CreateTime", "EndTime", "Target", "Verb", "StatusDetail", "CancelRequested", "ApiVersion", });
    internal_static_google_cloud_redis_v1_LocationMetadata_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_redis_v1_LocationMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_redis_v1_LocationMetadata_descriptor,
        new java.lang.String[] { "AvailableZones", });
    internal_static_google_cloud_redis_v1_LocationMetadata_AvailableZonesEntry_descriptor =
      internal_static_google_cloud_redis_v1_LocationMetadata_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_redis_v1_LocationMetadata_AvailableZonesEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_redis_v1_LocationMetadata_AvailableZonesEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_google_cloud_redis_v1_ZoneMetadata_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_redis_v1_ZoneMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_redis_v1_ZoneMetadata_descriptor,
        new java.lang.String[] { });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
