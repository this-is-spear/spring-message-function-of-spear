package hello.messagefunction.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {
    private String userName;
    private String studying;
}
