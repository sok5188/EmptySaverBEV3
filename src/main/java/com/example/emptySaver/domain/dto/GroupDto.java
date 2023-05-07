package com.example.emptySaver.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

public class GroupDto {
    @Data
    @AllArgsConstructor
    public static class res<T>{
        private T data;
    }
    @Data
    @AllArgsConstructor
    public static class GroupMemberRes<T>{
        private T data;
        private Boolean isPublic;
    }
    @Data
    @Builder
    public static class GroupInfo{
        private String groupName;
        private String oneLineInfo;
        private String groupDescription;

        private Long maxMember;

        private Boolean isPublic;

        private String categoryLabel;

    }
    @Data
    @Builder
    public static class SimpleGroupRes{
        private Long groupId;
        private String groupName;
        private String oneLineInfo;

        private Long nowMember;
        private Long maxMember;

        private Boolean isPublic;

        private String categoryLabel;
    }
    @Data
    @Builder
    public static class memberGroupReq{
        private Long memberId;
        private Long groupId;
    }
    @Data
    @Builder
    public static class DetailGroupRes{
        private Long groupId;
        private String groupName;
        private String oneLineInfo;
        private String groupDescription;
        private Long nowMember;
        private Long maxMember;

        private Boolean isPublic;

        private String categoryLabel;
    }
}