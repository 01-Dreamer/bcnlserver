package zxylearn.bcnlserver.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.repository.query.Param;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import zxylearn.bcnlserver.pojo.DTO.TeamJoinApplyVO;
import zxylearn.bcnlserver.pojo.entity.TeamJoinApply;

@Mapper
public interface TeamJoinApplyMapper extends BaseMapper<TeamJoinApply> {
    List<TeamJoinApplyVO> selectTeamJoinApplies(@Param("teamId") Long teamId);
}
