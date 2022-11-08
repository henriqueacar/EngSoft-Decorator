public class CPU extends ComponenteDecorator {

    private String cpu = null;
    public CPU(Componente componente, String cpu){
        super(componente);
        this.cpu = cpu;
    }
    public String getAtualConfiguracao(){
        return cpu;
    }
}
