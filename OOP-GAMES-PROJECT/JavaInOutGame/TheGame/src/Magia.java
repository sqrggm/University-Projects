public class Magia extends ArmasMagicas {

    @Override
    public boolean usarArmaMagica() {

        InOut.MsgDeInformacao("Disgaea Hour of Darkness",
                "Sua magia será suficiente... é algo difícil...");
        InOut.MsgDeAviso("Disgaea hour of Darkness",
                "Essa opção lhe rendeu uma chande de 1 em 5 de vencer!");
        int opt = InOut.leInt("Digite um número de 1 a 5 ");
        if (opt == 5) {
            InOut.MsgDeInformacao("Disgaea Hour of Darkness",
                    "Sua fé não falha... seu número da sorte é 13 e ele aparece novamente!");
            return true;
        } else {
            InOut.MsgDeInformacao("Disgaea Hour of Darkness",
                    "Uma guerra não é fácil infelizmente (quem dirá uma santa!)");
            return false;
        }

    }

}
