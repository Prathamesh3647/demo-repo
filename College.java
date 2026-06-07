package crud.hibernate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
//changes the entity name
//(name = "college-data")
@Entity
//changes only the table name
@Table(name="college-data")
public class College {
        @Id
        private int cId;
        //changes the column name
        @Column(name="college-name")
        private String name;
        private String department;
}
