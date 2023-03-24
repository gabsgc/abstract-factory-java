public class FabricaModerna implements FabricaAbstrata {
    @Override
    public Cama solicitarCama() {
        return new CamaModerna();
    }

    @Override
    public GuardaRoupa solicitarGuardaRoupa() {
        return new GuardaRoupaModerno();
    }
}
