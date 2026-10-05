package com.esmatas.services.interfaces;

import com.esmatas.services.*;

public interface IBlogCategoryServices<D,E>
        extends
        IModelMapperService<D,E>,
        ISpeedAndDeleteService<D,E>,
        ICrudService<D,E>,
          {

}
