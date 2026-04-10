package com.itheima.ai.entity.vo;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.ai.chat.messages.Message;

import static org.springframework.ai.ollama.api.OllamaApi.ChatRequest.Tool.Type.FUNCTION;

@NoArgsConstructor
@Data
public class MessageVO {
    private String role;
    private String content;

    public MessageVO(Message message){
        switch (message.getMessageType()){
            case USER:
                this.role = "user";
                break;
            case ASSISTANT:
                this.role = "assistant";
                break;
//            case SYSTEM:
//                this.role = "system";
//                break;
//            case TOOL:
//                this.role = "function";
//                break;
            default:
                this.role = "";
                break;
        }
        this.content = message.getText();
    }
}
