public class Revolver implements Arma_IF {

    @Override
    public boolean usarArma() {

        InOut.MsgDeInformacao("Disgaea Hour of Darkness",
                "Uma opção mais prudente... porém você não pode errar (restam poucas balas)");
        InOut.MsgDeAviso("Disgaea hour of Darkness",
                "Essa opção lhe rendeu uma chande de 3 em 5 de vencer");
        int opt = InOut.leInt("Digite um número de 1 a 5 ");
        if (opt == 1 || opt == 5 || opt == 2) {
            InOut.MsgDeInformacao("Disgaea Hour of Darkness", "Em cheio! parabéns pela boa pontaria!");
            return true;
        } else {
            InOut.MsgDeInformacao("Disgaea Hour of Darkness", "Infelizmente você falhou... miseravelmente...");
            return false;
        }

    }

}
