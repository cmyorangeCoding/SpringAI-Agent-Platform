package com.itheima.ai.repository;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Repository
public class InMemoryChatHistoryRepository implements ChatHistoryRepository {

   //内存存储
   private final Map<String,List<String>> chatHistory=new HashMap<>();

    /**
     * 保存会话记录
     * @param type 业务类型 chat service pdf...
     * @param chatId 会话ID
     */
    public void save(String type, String chatId) {
        if(!chatHistory.containsKey(type)){
            chatHistory.put(type,new ArrayList<>());
        }
        List<String> chatIds = chatHistory.get(type);
        if(chatIds.contains(chatId)){
            return;
        }
        chatIds.add(chatId);
    }

    /**
     * 获取会话id列表
     * @param type 业务类型 chat service pdf...
     * @return
     */
    public List<String> getChatIds(String type) {
//        List<String> chatIds = chatHistory.get(type);
//        return chatIds==null?new ArrayList<>():chatIds;

          return chatHistory.getOrDefault(type,List.of());
    }
}
