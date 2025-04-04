package com.neosoft.SpringBootCRUDDemo.Services;

import com.neosoft.SpringBootCRUDDemo.Entity.Makeup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MakeupServiceImpl implements MakeupService{


    @Autowired
    private MakeupService makeupService;


    @Override
    public Makeup save(Makeup makeup) {
        Makeup makeup1 = makeupService.save(makeup);
        return makeup1;
    }

    @Override
    public Makeup update(Makeup makeup) {
        Makeup makeup1 = makeupService.update(makeup);
        return makeup1;
    }

    @Override
    public void delete(int id) {
        makeupService.delete(id);

    }

    @Override
    public Makeup get(int id) {
        Makeup makeup1 = makeupService.get(id);
        return makeup1;
    }
}
