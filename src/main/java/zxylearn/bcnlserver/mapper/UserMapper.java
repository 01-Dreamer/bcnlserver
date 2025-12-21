package zxylearn.bcnlserver.mapper;

import org.apache.ibatis.annotations.Mapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import zxylearn.bcnlserver.pojo.entity.User;

@Mapper
public interface UserMapper extends BaseMapper<User> {

}