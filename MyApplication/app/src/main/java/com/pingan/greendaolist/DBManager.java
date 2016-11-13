package com.pingan.greendaolist;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Author：liupeng264 on 2016/11/11 18:00
 * Address：liupeng264@pingan.com.cn
 */
public class DBManager {


    private static DBManager               mInstance;
    private        String                  dbName;
    private        DaoMaster.DevOpenHelper openHelper;
    private        Context                 context;

    private DBManager(Context context) {
        this.context = context;
        openHelper = new DaoMaster.DevOpenHelper(context, dbName, null);
    }

    public static DBManager getInstance(Context context) {
        if (mInstance == null) {
            synchronized (DBManager.class) {
                if (mInstance == null) {
                    mInstance = new DBManager(context);
                }
            }
        }
        return mInstance;
    }

    /**
     * 获取可写数据库
     */
    private SQLiteDatabase getWritableDatabase() {
        if (openHelper == null) {
            openHelper = new DaoMaster.DevOpenHelper(context, dbName, null);
        }
        SQLiteDatabase db = openHelper.getWritableDatabase();
        return db;
    }


    /**
     * @return 获取可读数据库
     */
    private SQLiteDatabase getReadableDatabase() {
        if (openHelper == null) {
            openHelper = new DaoMaster.DevOpenHelper(context, dbName, null);
        }
        SQLiteDatabase db = openHelper.getReadableDatabase();
        return db;
    }

    public long insertUser(CerListModel cerList) {
        DaoMaster daoMaster = new DaoMaster(getWritableDatabase());
        DaoSession daoSession = daoMaster.newSession();
        CerListModelDao modelDao = daoSession.getCerListModelDao();
        long insert = modelDao.insert(cerList);
        return insert;
    }





}
