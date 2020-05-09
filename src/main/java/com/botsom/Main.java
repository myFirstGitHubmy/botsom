package com.botsom;

import com.lukaspradel.steamapi.data.json.appnews.Newsitem;
import com.petersamokhin.bots.sdk.clients.Group;
import com.petersamokhin.bots.sdk.objects.Message;


public class Main {

    private static final String VK_KEY = "ce6ec1d92be8d936df5ab0a3447f6e1b6c2ebbc56dd18f4eb4c5002a1aed7be65971fec89940c35b4c861";

    public static void main(String[] args) {
        Group group = new Group(195129111 , VK_KEY);

        group.onSimpleTextMessage(message ->
//                    Message toSend =
                        new Message()
                            .from(group)
                            .to(message.authorId())
                            .text("здарова илья!!")
                            .send()

        );
//            getNewsForApp.getAppnews().getNewsitems().stream()
//                    .map(Newsitem::getContents)
//                    .forEach(toSend::text);
//            toSend.send();
    }
}
