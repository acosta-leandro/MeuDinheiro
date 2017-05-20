package entidades;

import java.util.Date;

/**
 * Created by Leandro on 18/05/2017.
 */
public class RendaFixa {

    private String nomeAplicacao;
    private String bancoCorretora;
    private String tipoAplicacao;
    private Double ValorizacaoTaxa;
    private Date dtInicial;
    private Date dtFinal;
    private Double valorInvestido;
    private Double valorEsperado;
    private Double valorAtual;
    private Double valor7D;
    private Double valor30D;
    private Double valor365D;

    public String calcularVar7D(){
        Double valor = ((getValor7D() / valorAtual)-1)*100;
        String valorString = String.valueOf(valor)+"%";
        return valorString;
    }
    public String calcularVar30D(){
        Double valor = ((getValor30D() / valorAtual)-1)*100;
        String valorString = String.valueOf(valor)+"%";
        return valorString;
    }
    public String calcularVar365D(){
        Double valor = ((getValor365D() / valorAtual)-1)*100;
        String valorString = String.valueOf(valor)+"%";
        return valorString;
    }

    public String getNomeAplicacao() {
        return nomeAplicacao;
    }

    public void setNomeAplicacao(String nomeAplicacao) {
        this.nomeAplicacao = nomeAplicacao;
    }

    public String getBancoCorretora() {
        return bancoCorretora;
    }

    public void setBancoCorretora(String bancoCorretora) {
        this.bancoCorretora = bancoCorretora;
    }

    public String getTipoAplicacao() {
        return tipoAplicacao;
    }

    public void setTipoAplicacao(String tipoAplicacao) {
        this.tipoAplicacao = tipoAplicacao;
    }

    public Double getValorizacaoTaxa() {
        return ValorizacaoTaxa;
    }

    public void setValorizacaoTaxa(Double valorizacaoTaxa) {
        ValorizacaoTaxa = valorizacaoTaxa;
    }

    public Date getDtInicial() {
        return dtInicial;
    }

    public void setDtInicial(Date dtInicial) {
        this.dtInicial = dtInicial;
    }

    public Date getDtFinal() {
        return dtFinal;
    }

    public void setDtFinal(Date dtFinal) {
        this.dtFinal = dtFinal;
    }

    public Double getValorInvestido() {
        return valorInvestido;
    }

    public void setValorInvestido(Double valorInvestido) {
        this.valorInvestido = valorInvestido;
    }

    public Double getValorEsperado() {
        return valorEsperado;
    }

    public void setValorEsperado(Double valorEsperado) {
        this.valorEsperado = valorEsperado;
    }

    public Double getValorAtual() {
        return valorAtual;
    }

    public void setValorAtual(Double valorAtual) {
        this.valorAtual = valorAtual;
    }

    public Double getValor7D() {
        return valor7D;
    }

    public void setValor7D(Double valor7D) {
        this.valor7D = valor7D;
    }

    public Double getValor30D() {
        return valor30D;
    }

    public void setValor30D(Double valor30D) {
        this.valor30D = valor30D;
    }

    public Double getValor365D() {
        return valor365D;
    }

    public void setValor365D(Double valor365D) {
        this.valor365D = valor365D;
    }
}
