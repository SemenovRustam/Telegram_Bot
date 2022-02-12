package com.rustam_semenov.telegramm_bot.demo.service;

import com.rustam_semenov.telegramm_bot.demo.javarushclient.dto.GroupDiscussionInfo;
import com.rustam_semenov.telegramm_bot.demo.repository.entity.GroupSub;

public interface GroupSubService {
    GroupSub save(String chatId, GroupDiscussionInfo groupDiscussionInfo);
}
