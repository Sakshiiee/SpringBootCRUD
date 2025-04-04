package com.neosoft.SpringBootCRUDDemo.Services;

import com.neosoft.SpringBootCRUDDemo.Entity.Makeup;

public interface MakeupService {


    public Makeup save(Makeup makeup);
    public Makeup update(Makeup makeup);
    public void delete(int id);
    public Makeup get(int id);


}
