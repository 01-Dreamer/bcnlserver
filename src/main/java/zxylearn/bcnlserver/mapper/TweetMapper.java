package zxylearn.bcnlserver.mapper;

import org.apache.ibatis.annotations.Mapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import zxylearn.bcnlserver.pojo.entity.Tweet;

@Mapper
public interface TweetMapper extends BaseMapper<Tweet> {

}
