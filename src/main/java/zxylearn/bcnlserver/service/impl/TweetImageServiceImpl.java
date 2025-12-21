package zxylearn.bcnlserver.service.impl;

import zxylearn.bcnlserver.pojo.entity.TweetImage;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import zxylearn.bcnlserver.mapper.TweetImageMapper;
import zxylearn.bcnlserver.service.TweetImageService;

@Service
public class TweetImageServiceImpl extends ServiceImpl<TweetImageMapper, TweetImage> implements TweetImageService {

}
