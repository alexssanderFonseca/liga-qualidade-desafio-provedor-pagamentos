package br.com.zup.edu.ligaqualidade.desafioprovadorpagamentos.pronto;

import java.math.BigDecimal;

public class DadosRecebimentoAdiantado {

	public final int idTransacao;
	public final BigDecimal taxa;

	public DadosRecebimentoAdiantado(int idTransacao, BigDecimal taxa) {
		this.idTransacao = idTransacao;
		this.taxa = taxa;
	}

}
