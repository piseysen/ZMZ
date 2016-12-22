package me.knox.zmz.contract;

import io.reactivex.Flowable;
import java.util.List;
import me.knox.zmz.entity.News;
import me.knox.zmz.network.JsonResponse;
import me.knox.zmz.view.BaseView;

/**
 * Created by KNOX.
 */

public interface NewsListContract {

  interface Model {
    Flowable<JsonResponse<List<News>>> getNewsList(int page);
  }

  interface View extends BaseView {
    void obtainNewsListSucceed(List<News> newsList);
  }

  interface Presenter {
    void getNewsList(int page);
  }
}
