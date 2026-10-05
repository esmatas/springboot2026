package com.esmatas.services;

import org.springframework.data.domain.Page;

//D: Dto
//E: Entity

import java.util.List;

public interface ISortingPagingService<D,E> {
    //SORTING AND PAGİNG
    //PAGINATION
    public Page<D> objectServicePagination(int currentPage, int pageSize);

    //SORTING
    //Database içinde herhangi bir kolona göre sıralama yapsın
    public List<D> objectServiceListSortedByDefault(String sortedBy);
    public List<D> objectServiceListSortedByAsc();
    public List<D> objectServiceListSortedByDesc();
}
