package com.esmatas.services.impl;

import com.esmatas.bean.ModelMapperBean;
import com.esmatas.business.dto.BlogCategoryDto;
import com.esmatas.business.dto.BlogDto;
import com.esmatas.data.entity.BlogCategoryEntity;
import com.esmatas.data.entity.BlogEntity;
import com.esmatas.data.mapper.BlogCategoryMapper;
import com.esmatas.data.repository.IBlogCategoryRepository;
import com.esmatas.services.interfaces.IBlogCategoryServices;
import com.esmatas.services.interfaces.IBlogServices;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

// LOMBOK
@RequiredArgsConstructor //DI
@Log4j2

// SERVİCE
@Service
public class BlogCategoryServicesImpl implements IBlogCategoryServices<BlogCategoryDto, BlogCategoryEntity> {

    //DI

    /*
    1.Yol: Field İnjection
     @Autowired
    private IBlogCategoryRepository IBlogCategoryRepository;
    */

    /*
    2.Yol:Constructor İnjection (eklendiği zaman alışkanlık haline getir ve aoutowired ekle)
     private final IBlogCategoryRepository IBlogCategoryRepository;
    @Autowired
    public BlogCategoryServicesImpl(IBlogCategoryRepository iBlogCategoryRepository) {
        IBlogCategoryRepository = iBlogCategoryRepository;
    }
    */

     /*
    3.Yol: LOMBOK
    */
     private IBlogCategoryRepository IBlogCategoryRepository;
     private ModelMapperBean ModelMapperBean;
    ////////////////////////////////////////////////

    // Const
    private final BlogCategoryMapper blogCategoryMapper = new BlogCategoryMapper()


    ////////////////////////////////////////////////
    //METHOD
    //MODEL MAPPER
    @Override
    public BlogCategoryDto entityToDto(BlogCategoryEntity blogCAtegoryEntity) {
        //1.Yol
       // return modelMapperBean.modelMapperMethod().map(blogCategoryEntity, BlogDto.class) ;

        //2.Yol
        return blogCategoryMapper.toDto(blogCAtegoryEntity);
    }

    @Override
    public BlogCategoryEntity dtoToEntity(BlogCategoryDto blogCategoryDto) {
        //1.Yol
        // return modelMapperBean.modelMapperMethod().map(blogCategoryDto, BlogDto.class) ;

        //2.Yol
        return blogCategoryMapper.toEntity(blogCategoryDto);
    }

    ////////////////////////////////////////////////

    // SPEED DATA
    @Override
    public List<BlogCategoryDto> speedData(Integer data) {
        return List.of();
    }

    @Override
    public List<BlogCategoryDto> deleteData() {
        return List.of();
    }
    ////////////////////////////////////////////////

    //CRUD
    @Override
    public BlogCategoryDto objectServiceCreate(BlogCategoryDto blogCategoryDtoDto) {
        return null;
    }

    @Override
    public List<BlogCategoryDto> objectServiceList() {
        return List.of();
    }

    @Override
    public List<BlogCategoryDto> objectServiceFindById(Long id) {
        return List.of();
    }

    @Override
    public BlogCategoryDto objectServiceUpdate(Long id, BlogCategoryDto blogCategoryDto) {
        return null;
    }

    @Override
    public BlogCategoryDto objectServiceDelete(Long id) {
        return null;
    }


} //end BlogServicesImpl
