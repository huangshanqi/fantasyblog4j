package cn.evilcoder.fantasyblog4j.controller.forms;

import java.io.Serializable;

/**
 * User: evilcoder
 * Date: 2016/4/10
 * Time: 13:04
 */
public class NewPostForm implements Serializable {
  private long id;
  private String title;
  private String category;
  private String tags;
  private String content;
  private int state;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public String getTags() {
    return tags;
  }

  public void setTags(String tags) {
    this.tags = tags;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public int getState() {
    return state;
  }

  public void setState(int state) {
    this.state = state;
  }
}
