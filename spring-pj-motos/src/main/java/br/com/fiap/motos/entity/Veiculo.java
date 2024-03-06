package br.com.fiap.motos.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "TB_VEICULO")
public class Veiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "SQ_VEICULO")
    @SequenceGenerator(name = "SQ_VEICULO",
            sequenceName = "SQ_VEICULO",
            initialValue = 1,
            allocationSize = 1
    )
    @Column(name = "ID_VEICULO")
    private Long id;

    @Column(name = "NM_VEICULO")
    private String nome;

    @Column(name = "COR")
    private  String cor;
    @Column(name = "NM_PRECO")
    private Double preco;
    @Column(name = "NM_CILINDRADAS")
    private Short cilindradas;

    @ManyToMany(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinTable(
            name = "TB_ACESSORIOS",
            joinColumns = {
                    @JoinColumn(name = "VEICULO", referencedColumnName = "ID_VEICULO", foreignKey = @ForeignKey(name = "FK_ACESSORIO_VEICULO"))
            },
            inverseJoinColumns = {
                    @JoinColumn(name = "ACESSORIO", referencedColumnName = "ID_ACESSORIO", foreignKey = @ForeignKey(name = "FK_ACESSORIO_VEICULO_ACESSORIO"))
            }
    )
    private List<Acessorio> acessorios = new ArrayList<>();

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "VEICULO", referencedColumnName = "ID_SQ_TIPO_VEICULO", foreignKey = @ForeignKey(name = "FK_TIPO_VEICULO_VEICULO"))
    private TipoVeiculo tipoVeiculo;

}
