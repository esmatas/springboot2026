package com.esmatas.data.mapper;

import com.esmatas.business.dto.BlogDto;
import com.esmatas.data.entity.BlogEntity;

// Lombok
// @UtilityClass
public class BlogMapper implements IGenericMapper<BlogDto, BlogEntity>  {

    // Const
    private final BlogCategoryMapper blogCategoryMapper;

    // Constructor
    public BlogMapper() {
        this.blogCategoryMapper = new BlogCategoryMapper();
    }

    //toDto
    public BlogDto toDto(BlogEntity blogEntity) {
        if(blogEntity == null) return null;

        return BlogDto.builder()
                .blogId(blogEntity.getBlogId())
                .header(blogEntity.getHeader())
                .title(blogEntity.getTitle())
                .content(blogEntity.getContent())
                .image(blogEntity.getImage())
                .blogCategoryDto(blogCategoryMapper.toDto(blogEntity.getBlogCategoryEntity()))
                .build();
    }


    //toEntity
    public BlogEntity toEntity(BlogDto blogDto) {
        if(blogDto == null) return null;
        return BlogEntity.builder()
                .blogId(blogDto.getBlogId())
                .header(blogDto.getHeader())
                .title(blogDto.getTitle())
                .content(blogDto.getContent())
                .image(blogDto.getImage())
                .blogCategoryEntity(blogCategoryMapper.toEntity(blogDto.getBlogCategoryDto()))
                .build();
    }

} //end BlogCategoryMapper
