package com.camtorage.domain.user.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserResponse {
    private Integer id;

    private String name = "";

    private String email= "";

    private String phone= "";

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer userImageId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String userImageUrl;

    @JsonIgnore
    private String userImagePath;

    private Boolean isPublic;
}