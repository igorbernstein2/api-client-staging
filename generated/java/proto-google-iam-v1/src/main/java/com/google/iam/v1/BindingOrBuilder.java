// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/iam/v1/policy.proto

package com.google.iam.v1;

public interface BindingOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.iam.v1.Binding)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Role that is assigned to `members`.
   * For example, `roles/viewer`, `roles/editor`, or `roles/owner`.
   * Required
   * </pre>
   *
   * <code>optional string role = 1;</code>
   */
  java.lang.String getRole();
  /**
   * <pre>
   * Role that is assigned to `members`.
   * For example, `roles/viewer`, `roles/editor`, or `roles/owner`.
   * Required
   * </pre>
   *
   * <code>optional string role = 1;</code>
   */
  com.google.protobuf.ByteString
      getRoleBytes();

  /**
   * <pre>
   * Specifies the identities requesting access for a Cloud Platform resource.
   * `members` can have the following values:
   * * `allUsers`: A special identifier that represents anyone who is
   *    on the internet; with or without a Google account.
   * * `allAuthenticatedUsers`: A special identifier that represents anyone
   *    who is authenticated with a Google account or a service account.
   * * `user:{emailid}`: An email address that represents a specific Google
   *    account. For example, `alice&#64;gmail.com` or `joe&#64;example.com`.
   * * `serviceAccount:{emailid}`: An email address that represents a service
   *    account. For example, `my-other-app&#64;appspot.gserviceaccount.com`.
   * * `group:{emailid}`: An email address that represents a Google group.
   *    For example, `admins&#64;example.com`.
   * * `domain:{domain}`: A Google Apps domain name that represents all the
   *    users of that domain. For example, `google.com` or `example.com`.
   * </pre>
   *
   * <code>repeated string members = 2;</code>
   */
  java.util.List<java.lang.String>
      getMembersList();
  /**
   * <pre>
   * Specifies the identities requesting access for a Cloud Platform resource.
   * `members` can have the following values:
   * * `allUsers`: A special identifier that represents anyone who is
   *    on the internet; with or without a Google account.
   * * `allAuthenticatedUsers`: A special identifier that represents anyone
   *    who is authenticated with a Google account or a service account.
   * * `user:{emailid}`: An email address that represents a specific Google
   *    account. For example, `alice&#64;gmail.com` or `joe&#64;example.com`.
   * * `serviceAccount:{emailid}`: An email address that represents a service
   *    account. For example, `my-other-app&#64;appspot.gserviceaccount.com`.
   * * `group:{emailid}`: An email address that represents a Google group.
   *    For example, `admins&#64;example.com`.
   * * `domain:{domain}`: A Google Apps domain name that represents all the
   *    users of that domain. For example, `google.com` or `example.com`.
   * </pre>
   *
   * <code>repeated string members = 2;</code>
   */
  int getMembersCount();
  /**
   * <pre>
   * Specifies the identities requesting access for a Cloud Platform resource.
   * `members` can have the following values:
   * * `allUsers`: A special identifier that represents anyone who is
   *    on the internet; with or without a Google account.
   * * `allAuthenticatedUsers`: A special identifier that represents anyone
   *    who is authenticated with a Google account or a service account.
   * * `user:{emailid}`: An email address that represents a specific Google
   *    account. For example, `alice&#64;gmail.com` or `joe&#64;example.com`.
   * * `serviceAccount:{emailid}`: An email address that represents a service
   *    account. For example, `my-other-app&#64;appspot.gserviceaccount.com`.
   * * `group:{emailid}`: An email address that represents a Google group.
   *    For example, `admins&#64;example.com`.
   * * `domain:{domain}`: A Google Apps domain name that represents all the
   *    users of that domain. For example, `google.com` or `example.com`.
   * </pre>
   *
   * <code>repeated string members = 2;</code>
   */
  java.lang.String getMembers(int index);
  /**
   * <pre>
   * Specifies the identities requesting access for a Cloud Platform resource.
   * `members` can have the following values:
   * * `allUsers`: A special identifier that represents anyone who is
   *    on the internet; with or without a Google account.
   * * `allAuthenticatedUsers`: A special identifier that represents anyone
   *    who is authenticated with a Google account or a service account.
   * * `user:{emailid}`: An email address that represents a specific Google
   *    account. For example, `alice&#64;gmail.com` or `joe&#64;example.com`.
   * * `serviceAccount:{emailid}`: An email address that represents a service
   *    account. For example, `my-other-app&#64;appspot.gserviceaccount.com`.
   * * `group:{emailid}`: An email address that represents a Google group.
   *    For example, `admins&#64;example.com`.
   * * `domain:{domain}`: A Google Apps domain name that represents all the
   *    users of that domain. For example, `google.com` or `example.com`.
   * </pre>
   *
   * <code>repeated string members = 2;</code>
   */
  com.google.protobuf.ByteString
      getMembersBytes(int index);
}