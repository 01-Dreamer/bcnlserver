package zxylearn.bcnlserver.mapper;

import org.apache.ibatis.annotations.Mapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import zxylearn.bcnlserver.pojo.entity.TeamMember;

@Mapper
public interface TeamMemberMapper extends BaseMapper<TeamMember> {

}
