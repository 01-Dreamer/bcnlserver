package zxylearn.bcnlserver.service.impl;

import zxylearn.bcnlserver.pojo.entity.TeamMember;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import zxylearn.bcnlserver.mapper.TeamMemberMapper;
import zxylearn.bcnlserver.service.TeamMemberService;

@Service
public class TeamMemberServiceImpl extends ServiceImpl<TeamMemberMapper, TeamMember> implements TeamMemberService {

}
