package com.dlucchesi.basic.convert;

import com.dlucchesi.basic.model.BasicEntity;
import com.dlucchesi.basic.model.data.BasicEntityData;

public abstract class BasicEntityDataConvert<I extends BasicEntity, E extends BasicEntityData> {

    public abstract E convertToData(I imp);

    public abstract I convertToImp(E data);
}
