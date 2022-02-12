package com.rustam_semenov.telegramm_bot.demo.javarushclient.dto;

import java.util.List;

public interface JavaRushGroupClient {


    List<GroupInfo> getGroupList(GroupRequestArgs requestArgs);


    List<GroupDiscussionInfo> getGroupDiscussionList(GroupRequestArgs requestArgs);


    Integer getGroupCount(GroupsCountRequestArgs countRequestArgs);


    GroupDiscussionInfo getGroupById(Integer id);
}
