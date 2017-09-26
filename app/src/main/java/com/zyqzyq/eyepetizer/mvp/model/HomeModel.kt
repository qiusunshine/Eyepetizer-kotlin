package com.zyqzyq.eyepetizer.mvp.model

import android.util.Log
import com.zyqzyq.eyepetizer.TAG
import com.zyqzyq.eyepetizer.io_main
import com.zyqzyq.eyepetizer.mvp.model.bean.HomeBean
import com.zyqzyq.eyepetizer.network.Network
import io.reactivex.Observable

class HomeModel{
    fun loadFirstData(): Observable<HomeBean> {
        return Network.service.getFirstHomeData(System.currentTimeMillis()).io_main()
    }

    fun loadMoreData(url: String): Observable<HomeBean> {
        return Network.service.getMoreHomeData(url).io_main()
    }
}