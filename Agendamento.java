public class Agendamento {
    protected String nomePet;
    protected String especie;
    protected String nomeDono;
    protected String telefoneDono;
    protected String horario;
    protected String servicoAdicional;

    public Agendamento(String nomePet, String especie, String nomeDono, String telefoneDono, String horario, String servicoAdicional) {
        this.nomePet = nomePet;
        this.especie = especie;
        this.nomeDono = nomeDono;
        this.telefoneDono = telefoneDono;
        this.horario = horario;
        this.servicoAdicional = servicoAdicional;
    }

    @Override
    public String toString() {
        return "Pet: " + nomePet + " (" + especie + ") | Dono: " + nomeDono +
               " | Tel: " + telefoneDono + " | Horário: " + horario +
               (servicoAdicional != null && !servicoAdicional.isEmpty() ? " | Serviço: " + servicoAdicional : "");
    }
}
