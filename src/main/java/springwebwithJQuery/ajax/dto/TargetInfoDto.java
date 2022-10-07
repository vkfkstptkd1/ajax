package springwebwithJQuery.ajax.dto;

import lombok.Data;

import java.util.Date;

@Data
public class TargetInfoDto {
    private Long productId;
    private int targetPrice;
    private String regUserId;
    private Date regDate;
    private String modifyUserId;
    private Date modifyDate;
    private Date deadline;
}
