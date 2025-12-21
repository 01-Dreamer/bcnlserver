package zxylearn.bcnlserver.service.impl;

import zxylearn.bcnlserver.pojo.entity.Team;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import zxylearn.bcnlserver.mapper.TeamMapper;
import zxylearn.bcnlserver.service.TeamService;

@Service
public class TeamServiceImpl extends ServiceImpl<TeamMapper, Team> implements TeamService {

}
