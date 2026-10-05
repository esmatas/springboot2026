package com.esmatas.services;

import java.util.List;
//D: Dto
//E: Entity

public interface ISpeedAndDeleteService<D,E> {
    //SPEED CREATE & DELETE
    //SPEED DATA
    public List<D> speedData(Integer data);

    // DELETE DATA
    public List<D> deleteData();

}
