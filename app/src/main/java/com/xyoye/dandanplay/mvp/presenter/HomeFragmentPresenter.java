package com.xyoye.dandanplay.mvp.presenter;

import com.xyoye.dandanplay.utils.interf.presenter.BaseMvpPresenter;

/**
 * Created by YE on 2018/6/29 0029.
 */


public interface HomeFragmentPresenter extends BaseMvpPresenter {
    void getBannerList();
    void getAnimaList();

    void getHomeFragmentData();
}
