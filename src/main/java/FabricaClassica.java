public class FabricaClassica implements FabricaAbstrata {
    @Override
    public Cama solicitarCama() {
        return new CamaClassica();
    }

    @Override
    public GuardaRoupa solicitarGuardaRoupa() {
        return new GuardaRoupaClassico();
    }
}
