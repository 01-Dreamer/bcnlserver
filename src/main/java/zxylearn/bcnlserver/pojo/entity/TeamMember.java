package zxylearn.bcnlserver.pojo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@TableName("team_member")
public class TeamMember {
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField(value = "team_id")
    private Long teamId;

    @TableField(value = "user_id")
    private Long userId;

    @TableField(value = "position")
    private String position;
}
