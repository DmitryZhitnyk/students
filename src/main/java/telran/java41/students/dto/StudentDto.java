package telran.java41.students.dto;

import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
//@Setter
public class StudentDto {
	Integer id;
	String name;
	Map<String, Integer> scores;
}
