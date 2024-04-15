package jp.ac.ohara.juncha.model;
 
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.SQLRestriction;

//import jakarta.persistence.NotBlank
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
@Data
@Entity
@Table(name = "address_books")
@SQLDelete(sql = "UPDATE [テーブル名] SET deleted_at = NOW() WHERE id=?")
@SQLRestriction(value = "deleted_at IS NULL")
public class AddressBook {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "name_sei",length = 100)
	private String name_sei;
	
	@Column(name = "name_mei",length = 100)
	private String name_mei;
	
	@Column(name = "mail_address",length = 100)
	private String mail_address;
	
	@Column(name = "phone", length = 100)
	private String phone;
}