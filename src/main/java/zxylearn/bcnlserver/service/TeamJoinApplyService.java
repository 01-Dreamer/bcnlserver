package zxylearn.bcnlserver.service;


import java.util.List;

import com.baomidou.mybatisplus.extension.service.IService;

import zxylearn.bcnlserver.pojo.DTO.TeamJoinApplyVO;
import zxylearn.bcnlserver.pojo.entity.TeamJoinApply;

public interface TeamJoinApplyService extends IService<TeamJoinApply> {
    public TeamJoinApply getTeamJoinApply(Long teamId, Long applicantId);
    public List<TeamJoinApplyVO> getTeamJoinApplyList(Long teamId);
}
