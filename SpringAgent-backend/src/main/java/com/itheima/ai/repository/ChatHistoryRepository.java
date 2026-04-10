package com.itheima.ai.repository;

import com.itheima.ai.entity.vo.MessageVO;

import java.util.List;

public interface ChatHistoryRepository {

    /**
     * 保存会话记录
     * @param type 业务类型 chat service pdf...
     * @param chatId 会话ID
     */
    void save(String type,String chatId);

    /**
     * 获取会话id列表
     * @param type 业务类型 chat service pdf...
     * @return
     */
    List<String> getChatIds(String type);


}
