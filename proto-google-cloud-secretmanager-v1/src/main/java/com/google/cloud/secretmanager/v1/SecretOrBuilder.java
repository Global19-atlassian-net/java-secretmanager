/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/secretmanager/v1/resources.proto

package com.google.cloud.secretmanager.v1;

public interface SecretOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.secretmanager.v1.Secret)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The resource name of the [Secret][google.cloud.secretmanager.v1.Secret] in the format `projects/&#42;&#47;secrets/&#42;`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Output only. The resource name of the [Secret][google.cloud.secretmanager.v1.Secret] in the format `projects/&#42;&#47;secrets/&#42;`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Required. Immutable. The replication policy of the secret data attached to the [Secret][google.cloud.secretmanager.v1.Secret].
   * The replication policy cannot be changed after the Secret has been created.
   * </pre>
   *
   * <code>
   * .google.cloud.secretmanager.v1.Replication replication = 2 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the replication field is set.
   */
  boolean hasReplication();
  /**
   *
   *
   * <pre>
   * Required. Immutable. The replication policy of the secret data attached to the [Secret][google.cloud.secretmanager.v1.Secret].
   * The replication policy cannot be changed after the Secret has been created.
   * </pre>
   *
   * <code>
   * .google.cloud.secretmanager.v1.Replication replication = 2 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The replication.
   */
  com.google.cloud.secretmanager.v1.Replication getReplication();
  /**
   *
   *
   * <pre>
   * Required. Immutable. The replication policy of the secret data attached to the [Secret][google.cloud.secretmanager.v1.Secret].
   * The replication policy cannot be changed after the Secret has been created.
   * </pre>
   *
   * <code>
   * .google.cloud.secretmanager.v1.Replication replication = 2 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.secretmanager.v1.ReplicationOrBuilder getReplicationOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The time at which the [Secret][google.cloud.secretmanager.v1.Secret] was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time at which the [Secret][google.cloud.secretmanager.v1.Secret] was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time at which the [Secret][google.cloud.secretmanager.v1.Secret] was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * The labels assigned to this Secret.
   * Label keys must be between 1 and 63 characters long, have a UTF-8 encoding
   * of maximum 128 bytes, and must conform to the following PCRE regular
   * expression: `[&#92;p{Ll}&#92;p{Lo}][&#92;p{Ll}&#92;p{Lo}&#92;p{N}_-]{0,62}`
   * Label values must be between 0 and 63 characters long, have a UTF-8
   * encoding of maximum 128 bytes, and must conform to the following PCRE
   * regular expression: `[&#92;p{Ll}&#92;p{Lo}&#92;p{N}_-]{0,63}`
   * No more than 64 labels can be assigned to a given resource.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * The labels assigned to this Secret.
   * Label keys must be between 1 and 63 characters long, have a UTF-8 encoding
   * of maximum 128 bytes, and must conform to the following PCRE regular
   * expression: `[&#92;p{Ll}&#92;p{Lo}][&#92;p{Ll}&#92;p{Lo}&#92;p{N}_-]{0,62}`
   * Label values must be between 0 and 63 characters long, have a UTF-8
   * encoding of maximum 128 bytes, and must conform to the following PCRE
   * regular expression: `[&#92;p{Ll}&#92;p{Lo}&#92;p{N}_-]{0,63}`
   * No more than 64 labels can be assigned to a given resource.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  boolean containsLabels(java.lang.String key);
  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();
  /**
   *
   *
   * <pre>
   * The labels assigned to this Secret.
   * Label keys must be between 1 and 63 characters long, have a UTF-8 encoding
   * of maximum 128 bytes, and must conform to the following PCRE regular
   * expression: `[&#92;p{Ll}&#92;p{Lo}][&#92;p{Ll}&#92;p{Lo}&#92;p{N}_-]{0,62}`
   * Label values must be between 0 and 63 characters long, have a UTF-8
   * encoding of maximum 128 bytes, and must conform to the following PCRE
   * regular expression: `[&#92;p{Ll}&#92;p{Lo}&#92;p{N}_-]{0,63}`
   * No more than 64 labels can be assigned to a given resource.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();
  /**
   *
   *
   * <pre>
   * The labels assigned to this Secret.
   * Label keys must be between 1 and 63 characters long, have a UTF-8 encoding
   * of maximum 128 bytes, and must conform to the following PCRE regular
   * expression: `[&#92;p{Ll}&#92;p{Lo}][&#92;p{Ll}&#92;p{Lo}&#92;p{N}_-]{0,62}`
   * Label values must be between 0 and 63 characters long, have a UTF-8
   * encoding of maximum 128 bytes, and must conform to the following PCRE
   * regular expression: `[&#92;p{Ll}&#92;p{Lo}&#92;p{N}_-]{0,63}`
   * No more than 64 labels can be assigned to a given resource.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  java.lang.String getLabelsOrDefault(java.lang.String key, java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * The labels assigned to this Secret.
   * Label keys must be between 1 and 63 characters long, have a UTF-8 encoding
   * of maximum 128 bytes, and must conform to the following PCRE regular
   * expression: `[&#92;p{Ll}&#92;p{Lo}][&#92;p{Ll}&#92;p{Lo}&#92;p{N}_-]{0,62}`
   * Label values must be between 0 and 63 characters long, have a UTF-8
   * encoding of maximum 128 bytes, and must conform to the following PCRE
   * regular expression: `[&#92;p{Ll}&#92;p{Lo}&#92;p{N}_-]{0,63}`
   * No more than 64 labels can be assigned to a given resource.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);
}
