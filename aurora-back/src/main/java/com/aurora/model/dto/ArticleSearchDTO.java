package com.aurora.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ArticleSearchDTO {

    @Id
    private Integer id;

    private String articleTitle;

    private String articleContent;

    private Integer isDelete;

    private Integer status;

}
