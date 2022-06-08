package br.com.republica.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tb_mesa")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Mesa {
	
	@Id
	@Column(name = "mesa_id", nullable = false, length = 18)
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	private Long codigo;
	
	@Column(name = "numero")
	private Long numero;
	
	@Column(name = "situacao")
	private String situacao;
	
	@Column(name = "valor_mesa")
	private BigDecimal valorMesa;

}
