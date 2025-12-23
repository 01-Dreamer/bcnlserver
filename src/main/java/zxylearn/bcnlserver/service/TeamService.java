package zxylearn.bcnlserver.service;


import java.util.List;

import com.baomidou.mybatisplus.extension.service.IService;

import zxylearn.bcnlserver.pojo.entity.Team;

public interface TeamService extends IService<Team> {
    public List<Team> getTeamListByStatus(Integer status);
}
