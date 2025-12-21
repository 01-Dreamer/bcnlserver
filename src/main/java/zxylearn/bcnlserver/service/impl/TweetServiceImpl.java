package zxylearn.bcnlserver.service.impl;

import zxylearn.bcnlserver.pojo.entity.Tweet;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import zxylearn.bcnlserver.mapper.TweetMapper;
import zxylearn.bcnlserver.service.TweetService;

@Service
public class TweetServiceImpl extends ServiceImpl<TweetMapper, Tweet> implements TweetService {

}
