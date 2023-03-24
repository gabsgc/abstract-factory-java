public class Cliente {
    private Cama cama;
    private GuardaRoupa guardaRoupa;

    public Cliente(FabricaAbstrata fabricaAbstrata) {
        this.cama = fabricaAbstrata.solicitarCama();
        this.guardaRoupa = fabricaAbstrata.solicitarGuardaRoupa();
    }

    public String comprarCama() {
        return this.cama.criar();
    }

    public String comprarGuardaRoupa() {
        return this.guardaRoupa.criar();
    }
}
