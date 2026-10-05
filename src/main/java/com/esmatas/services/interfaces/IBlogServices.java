package com.esmatas.services.interfaces;

import com.esmatas.services.*;
import org.springframework.data.domain.Page;
import org.springframework.data.querydsl.QPageRequest;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface IBlogServices<D,E>
        extends
        IModelMapperService<D,E>,
        ISpeedAndDeleteService<D,E>,
        ICrudService<D,E>,
        IImageService<D,E>,
        ISortingPagingService<D,E>  {

}
