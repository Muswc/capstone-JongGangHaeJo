// package: jeiu.capstone.jongGangHaejo.dto.response

package jeiu.capstone.jongGangHaejo.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Map;

/**
 * 오류 응답을 위한 DTO
 */
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ErrorResponseDto {
    private int code;
    private String message;
    private Map<String, String> validation;

    public ErrorResponseDto(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public void setValidation(Map<String, String> validation) {
        this.validation = validation;
    }
}
