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
@TableName("team")
public class Team {
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField(value = "name")
    private String name;

    @TableField(value = "banner")
    private String banner;

    @TableField(value = "logo")
    private String logo;

    @TableField(value = "description")
    private String description;

    @TableField(value = "owner_id")
    private Long ownerId;

    @TableField(value = "status")
    private Integer status;
}
