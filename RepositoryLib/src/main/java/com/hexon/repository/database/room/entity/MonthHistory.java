package com.hexon.repository.database.room.entity;

import androidx.room.Entity;

import com.hexon.chartlib.stock.model.HistoryEntity;
import com.hexon.repository.Constants;


/**
 * Created by hexiaohong on 2017/4/12.
 */

@Entity(inheritSuperIndices = true)
public class MonthHistory extends History {
    public MonthHistory() {
    }

    public MonthHistory(Constants.MetalType type, HistoryEntity entity) {
        super(type, entity);
    }
}
