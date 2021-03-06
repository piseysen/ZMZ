package me.knox.zmz.mvp.model;

import io.reactivex.Flowable;
import javax.inject.Inject;
import me.knox.zmz.App;
import me.knox.zmz.mvp.contract.ResourceInfoContract;
import me.knox.zmz.entity.ResourceInfo;
import me.knox.zmz.network.JsonResponse;

/**
 * Created by KNOX.
 */

public class ResourceInfoModel implements ResourceInfoContract.Model {

  @Inject
  public ResourceInfoModel() {
    // empty constructor for injection
  }

  @Override public Flowable<JsonResponse<ResourceInfo>> getResourceInfo(int id, int isSharable) {
    return App.getInstance().getApi().getResourceInfo(id, isSharable);
  }
}
