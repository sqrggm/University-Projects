public class Fuzil implements Arma_IF {

    @Override
    public boolean usarArma() {

        InOut.MsgDeInformacao("Disgaea Hour of Darkness",
                "É o tudo ou nada... Eles não sabem que está aqui (hora do show!)");
        InOut.MsgDeAviso("Disgaea hour of Darkness",
                "Essa opção lhe rendeu uma chande de 4 em 5 de vencer");
        int opt = InOut.leInt("Digite um número de 1 a 5 ");
        if (opt == 1 || opt == 4 || opt == 2 || opt == 3) {
            InOut.MsgDeInformacao("Disgaea Hour of Darkness", "Você detonou... brutal...");
            return true;
        } else {
            InOut.MsgDeInformacao("Disgaea Hour of Darkness",
                    "Era um plano brilhante... mas você escorrega e falha miseravelmente (o suicidio era menos humilhante)");
            return false;
        }

    }

}
