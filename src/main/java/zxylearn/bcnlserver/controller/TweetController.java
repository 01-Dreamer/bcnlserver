package zxylearn.bcnlserver.controller;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import zxylearn.bcnlserver.ES.TweetDocService;
import zxylearn.bcnlserver.common.UserContext;
import zxylearn.bcnlserver.pojo.DTO.TweetSendRequestDTO;
import zxylearn.bcnlserver.pojo.document.TweetDoc;
import zxylearn.bcnlserver.service.TweetService;

@Tag(name = "推文模块")
@RestController
@RequestMapping("/tweet")
public class TweetController {

    @Autowired
    private TweetService tweetService;

    @Autowired
    private TweetDocService tweetDocService;

    @Operation(summary = "发送推文")
    @PostMapping("/send")
    public ResponseEntity<?> sendTweet(@RequestBody TweetSendRequestDTO tweetSendRequestDTO) {

        Long userId = Long.parseLong(UserContext.getUserId());

        TweetDoc tweetDoc = TweetDoc.builder()
                .teamId(tweetSendRequestDTO.getTeamId())
                .senderId(userId)
                .createTime(LocalDateTime.now())
                .title(tweetSendRequestDTO.getTitle())
                .content(tweetSendRequestDTO.getContent())
                .build();


        return ResponseEntity.ok("");
    }

    @Operation(summary = "删除推文")
    @PostMapping("/delete")
    public ResponseEntity<?> deleteTweet(@RequestBody Long tweetId) {

        Long userId = Long.parseLong(UserContext.getUserId());
        String role = UserContext.getUserRole();

        return ResponseEntity.ok("");
    }

}
