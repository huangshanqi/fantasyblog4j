package cn.evilcoder.fantasyblog4j.domain;

/**
 * User: evilcoder
 * Date: 2016/4/9
 * Time: 12:55
 */
public class Post extends BaseDomain{

  private long uid;
  private String title;
  private String category;
  private String tags;
  private int visitTime;
  private int commentNum;
  private int state;

  public long getUid() {
    return uid;
  }

  public void setUid(long uid) {
    this.uid = uid;
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

  public int getVisitTime() {
    return visitTime;
  }

  public void setVisitTime(int visitTime) {
    this.visitTime = visitTime;
  }

  public int getCommentNum() {
    return commentNum;
  }

  public void setCommentNum(int commentNum) {
    this.commentNum = commentNum;
  }

  public int getState() {
    return state;
  }

  public void setState(int state) {
    this.state = state;
  }
}
