package zxylearn.bcnlserver.pojo.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LoginYNURequestDTO {
    String username;
    String password;
    String uuid;
    String code;

    // 第一次登陆需要邮箱验证码
    String email;
    String emailCode;
}
