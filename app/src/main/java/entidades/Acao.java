package entidades;

import java.util.Date;

/**
 * Created by Leandro on 18/05/2017.
 */
public class Acao {

    private String nomeAcao;
    private String bancoCorretora;
    private Date dtInicial;
    private Date dtFinal;
    private Double valorInvestido;
    private Double valorEsperado;
    private Double valorAtual;
    private Double valor7D;
    private Double valor30D;
    private Double valor365D;
    private Double abertura;
    private Double fechamento;
    private Double fechamentoAnt;

    public String calcularVar7D(){
        Double valor = ((valor7D / valorAtual)-1)*100;
        String valorString = String.valueOf(valor)+"%";
        return valorString;
    }
    public String calcularVar30D(){
        Double valor = ((valor30D / valorAtual)-1)*100;
        String valorString = String.valueOf(valor)+"%";
        return valorString;
    }
    public String calcularVar365D(){
        Double valor = ((valor365D / valorAtual)-1)*100;
        String valorString = String.valueOf(valor)+"%";
        return valorString;
    }

    public String getNomeAcao() {
        return nomeAcao;
    }

    public void setNomeAcao(String nomeAcao) {
        this.nomeAcao = nomeAcao;
    }

    public String getBancoCorretora() {
        return bancoCorretora;
    }

    public void setBancoCorretora(String bancoCorretora) {
        this.bancoCorretora = bancoCorretora;
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

    public Double getAbertura() {
        return abertura;
    }

    public void setAbertura(Double abertura) {
        this.abertura = abertura;
    }

    public Double getFechamento() {
        return fechamento;
    }

    public void setFechamento(Double fechamento) {
        this.fechamento = fechamento;
    }

    public Double getFechamentoAnt() {
        return fechamentoAnt;
    }

    public void setFechamentoAnt(Double fechamentoAnt) {
        this.fechamentoAnt = fechamentoAnt;
    }
}
