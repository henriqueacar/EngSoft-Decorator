public class GPU extends ComponenteDecorator {

    private String gpu = null;

    public GPU(Componente componente, String gpu){
        super(componente);
        this.gpu = gpu;
    }
    public String getAtualConfiguracao(){
        return gpu;
    }
}
