package com.esmatas.data.mapper;

import com.esmatas.business.dto.BlogCategoryDto;
import com.esmatas.data.entity.BlogCategoryEntity;

// Lombok
// @UtilityClass
public class BlogCategoryMapper implements IGenericMapper<BlogCategoryDto,BlogCategoryEntity> {



    //toDto
    public BlogCategoryDto toDto(BlogCategoryEntity blogCategoryEntity) {
        if(blogCategoryEntity == null) return null;
        return BlogCategoryDto.builder()
                .blogCategoryId(blogCategoryEntity.getBlogCategoryId())
                .categoryName(blogCategoryEntity.getCategoryName())
                .build();
    }


    //toEntity
    public BlogCategoryEntity toEntity(BlogCategoryDto blogCategoryDto) {
        if(blogCategoryDto == null) return null;
        return BlogCategoryEntity.builder()
                .blogCategoryId(blogCategoryDto.getBlogCategoryId())
                .categoryName(blogCategoryDto.getCategoryName())
                .build();
    }

} //end BlogCategoryMapper
