package com.rustam_semenov.telegramm_bot.demo.javarushclient.dto;


import lombok.Data;

@Data
public class UserDiscussionInfo {
    private Boolean isBookmarked;
    private Integer lastTime;
    private Integer newCommentsCount;
}
