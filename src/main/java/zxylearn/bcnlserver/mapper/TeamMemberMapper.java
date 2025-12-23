package zxylearn.bcnlserver.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.repository.query.Param;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import zxylearn.bcnlserver.pojo.DTO.TeamMemberVO;
import zxylearn.bcnlserver.pojo.entity.TeamMember;

@Mapper
public interface TeamMemberMapper extends BaseMapper<TeamMember> {
    List<TeamMemberVO> selectTeamMembers(@Param("teamId") Long teamId);
}
