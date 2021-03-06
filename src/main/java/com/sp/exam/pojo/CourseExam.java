package com.sp.exam.pojo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class CourseExam {
    @Id
    private String courseNo;

    private Integer weight;

    private String beArranged;

    private String time;
}
