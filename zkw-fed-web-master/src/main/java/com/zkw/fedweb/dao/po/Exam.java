package com.zkw.fedweb.dao.po;

public class Exam {
    private Integer id;

    private Integer bookId;

    private String bookName;

    private Boolean examHard;

    private String examName;

    private Integer examType;

    private String examIntr;

    private String examImg;

    private String allTime;

    private Integer pv;

    private Integer studyNum;

    private Integer holdNum;

    private Integer addtime;

    private Boolean hasQuestion;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Boolean getExamHard() {
        return examHard;
    }

    public void setExamHard(Boolean examHard) {
        this.examHard = examHard;
    }

    public String getExamName() {
        return examName;
    }

    public void setExamName(String examName) {
        this.examName = examName;
    }

    public Integer getExamType() {
        return examType;
    }

    public void setExamType(Integer examType) {
        this.examType = examType;
    }

    public String getExamIntr() {
        return examIntr;
    }

    public void setExamIntr(String examIntr) {
        this.examIntr = examIntr;
    }

    public String getExamImg() {
        return examImg;
    }

    public void setExamImg(String examImg) {
        this.examImg = examImg;
    }

    public String getAllTime() {
        return allTime;
    }

    public void setAllTime(String allTime) {
        this.allTime = allTime;
    }

    public Integer getPv() {
        return pv;
    }

    public void setPv(Integer pv) {
        this.pv = pv;
    }

    public Integer getStudyNum() {
        return studyNum;
    }

    public void setStudyNum(Integer studyNum) {
        this.studyNum = studyNum;
    }

    public Integer getHoldNum() {
        return holdNum;
    }

    public void setHoldNum(Integer holdNum) {
        this.holdNum = holdNum;
    }

    public Integer getAddtime() {
        return addtime;
    }

    public void setAddtime(Integer addtime) {
        this.addtime = addtime;
    }

    public Boolean getHasQuestion() {
        return hasQuestion;
    }

    public void setHasQuestion(Boolean hasQuestion) {
        this.hasQuestion = hasQuestion;
    }
}