package zxylearn.bcnlserver.pojo.DTO;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import zxylearn.bcnlserver.pojo.entity.User;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TeamJoinApplyVO {
    private User user;
    private LocalDateTime applyTime;
}
