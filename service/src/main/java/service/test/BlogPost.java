package service.test;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;

@Getter
@Setter
@Entity
public class BlogPost{

    @Id
    @GeneratedValue
    private Long id;
	private String title;
    private String slug;
	private String content;

}
