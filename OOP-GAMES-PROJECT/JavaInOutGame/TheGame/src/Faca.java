public class Faca implements Arma_IF {

    @Override
    public boolean usarArma() {
        InOut.MsgDeInformacao("Disgaea Hour of Darkness",
                "Que arriscado... você confia muito em si mesmo (morte eminente))");
        InOut.MsgDeAviso("Disgaea hour of Darkness",
                "Essa opção lhe rendeu uma chande de 1 em 5 de vencer");
        int opt = InOut.leInt("Digite um número de 1 a 5 ");
        if (opt == 2) {
            InOut.MsgDeInformacao("Disgaea Hour of Darkness",
                    "Milagrosamente você acerta em cheio a facada em um ponto vital do monstro...");
            return true;
        } else {
            InOut.MsgDeInformacao("Disgaea Hour of Darkness",
                    "Obviamente... tudo deu errado... (uma facada em um monstro? HAHAHA!!!)");
            return false;
        }

    }

}
