package com.jk.entity;

import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
@Accessors(chain = true)
@ToString
public class Storerank implements Serializable {
    private Long id;

    private Date createddate;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date lastmodifieddate;

    private Long version;

    private Integer orders;

    private Boolean isallowregister;

    private String memo;

    private String name;

    private Long quantity;

    private BigDecimal servicefee;


}