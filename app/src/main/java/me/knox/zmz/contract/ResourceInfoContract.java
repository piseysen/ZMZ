package me.knox.zmz.contract;

import io.reactivex.Flowable;
import me.knox.zmz.entity.ResourceInfo;
import me.knox.zmz.network.JsonResponse;
import me.knox.zmz.view.BaseView;

/**
 * Created by KNOX.
 */

public interface ResourceInfoContract {

  interface Model {
    Flowable<JsonResponse<ResourceInfo>> getResourceInfo(int id);
  }

  interface View extends BaseView {
    void obtainResourceInfoSucceed(ResourceInfo resourceInfo);
  }
  interface Presenter {
    void getResourceInfo(int id);
  }
}
