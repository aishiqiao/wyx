package com.zkw.fedweb.dao.po;

import lombok.Data;

@Data
public class RecruitmentJobs {
    private Integer id;

    private String welfareName;

    private Integer company_id;

    private Integer industry_id;

    private String job_name;

    private Integer work_area;

    private Integer number;

    private Integer work_year;

    private Integer education;

    private Integer emolument_low;

    private Integer emolument_high;

    private String welfare;

    private Integer check_num;

    private Integer collect_num;

    private Integer status;

    private Integer create_time;

    private Integer update_time;

    private String intro;

    private String requirement;

}