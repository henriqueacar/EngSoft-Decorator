public abstract class ComponenteDecorator implements Componente {

    //PlacaMae é a base, que pode ter CPU ou GPU

    private Componente componente;
    private String configuracao;

    public ComponenteDecorator(Componente componente) {
        this.componente = componente;
    }

    public Componente getComputador() {
        return componente;
    }

    public void setComputador(Componente componente) {
        this.componente = componente;
    }

    public void setConfiguracao(String configuracao) {
        this.configuracao = configuracao;
    }

    public abstract String getAtualConfiguracao();
    public String getConfiguracaoComputador(){
        return this.componente.getConfiguracaoComputador() + this.getAtualConfiguracao();
    }


}
