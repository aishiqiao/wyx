package com.zkw.fedweb.dao.po;

public class Banner {
    private Integer id;

    private Integer clumnId;

    private String img;

    private Integer inout;

    private String url;

    private Byte status;

    private Byte sort;

    private Integer ctime;

    private String bigtit;

    private String smalltit;

    private String content;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getClumnId() {
        return clumnId;
    }

    public void setClumnId(Integer clumnId) {
        this.clumnId = clumnId;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Integer getInout() {
        return inout;
    }

    public void setInout(Integer inout) {
        this.inout = inout;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Byte getSort() {
        return sort;
    }

    public void setSort(Byte sort) {
        this.sort = sort;
    }

    public Integer getCtime() {
        return ctime;
    }

    public void setCtime(Integer ctime) {
        this.ctime = ctime;
    }

    public String getBigtit() {
        return bigtit;
    }

    public void setBigtit(String bigtit) {
        this.bigtit = bigtit;
    }

    public String getSmalltit() {
        return smalltit;
    }

    public void setSmalltit(String smalltit) {
        this.smalltit = smalltit;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}