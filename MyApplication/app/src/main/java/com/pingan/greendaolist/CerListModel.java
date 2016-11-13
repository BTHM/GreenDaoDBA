package com.pingan.greendaolist;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;

/**
 * Author：liupeng264 on 2016/11/11 17:40
 * Address：liupeng264@pingan.com.cn
 */
@Entity
public class CerListModel {
    @Id
    public long id;
    public String date;
    public String name;
    public float time;
    @Generated(hash = 869512914)
    public CerListModel(long id, String date, String name, float time) {
        this.id = id;
        this.date = date;
        this.name = name;
        this.time = time;
    }
    @Generated(hash = 359281783)
    public CerListModel() {
    }
    public long getId() {
        return this.id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getDate() {
        return this.date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public float getTime() {
        return this.time;
    }
    public void setTime(float time) {
        this.time = time;
    }
    public void setId(long id) {
        this.id = id;
    }


}
