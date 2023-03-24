public class Cliente {
    private Cama cama;
    private GuardaRoupa guardaRoupa;

    public Cliente(Cama cama, GuardaRoupa guardaRoupa) {
        this.cama = cama;
        this.guardaRoupa = guardaRoupa;
    }

    public String comprarCama() {
        return this.cama.criar();
    }

    public String comprarGuardaRoupa() {
        return this.guardaRoupa.criar();
    }
}
