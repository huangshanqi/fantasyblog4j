package cn.evilcoder.fantasyblog4j.service;

import cn.evilcoder.fantasyblog4j.domain.KeyValue;
import cn.evilcoder.fantasyblog4j.domain.Post;
import cn.evilcoder.fantasyblog4j.domain.PostDetailModel;

import java.util.ArrayList;

/**
 * User: evilcoder
 * Date: 2016/4/10
 * Time: 13:58
 */
public interface PostService {

  public boolean insertPost(Post post,String tagStr,String content);
  public PostDetailModel selectDetail(long pid);
  public ArrayList<KeyValue> getUserTags(long uid);
}