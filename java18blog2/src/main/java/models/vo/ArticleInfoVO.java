package models.vo;

/**
 * [description]
 *
 * @author： zhangbo
 * @date: 2021-04-11
 * @time: 16:33
 */
import models.ArticleInfo;

public class ArticleInfoVO extends ArticleInfo {
    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}