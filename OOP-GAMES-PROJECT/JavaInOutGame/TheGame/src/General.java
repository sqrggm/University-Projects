public class General extends Personagem {

    public General(Arma_IF arma, Arma_IF armaSecundaria) {

        arma = this.arma;

    }

    @Override
    public void falar() {
        InOut.MsgDeInformacao("Disgaea Hour of Darkness", "General Diz: ...");
    }

    @Override
    public void desenhar() {
        InOut.MsgSemIcone("Disgaea Hour of Darkness", "　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　 　 　 　 　∧\r\n" + //
                "　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　/　 ',\r\n" + //
                "　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　 　 　 　 　　　 / 　 　',\r\n" + //
                "　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　,.　 '\"´￣￣ ｀ヽ､\r\n" + //
                "　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　 ／　　　　　　　　　　ヽ､\r\n" + //
                "　　　　　　　　　　　　　　　　　　　　　 _ ＿＿ ＿　　　　　　　　　　 ,.　-──- ､　_ノ　 .: .: .: .:｀ヽ　　　　　　 ヽ\r\n" + //
                "　　　　　　　　　　　　　　　　　　　 ／´￣｀＼　　　＼ 　 　 　 　 ,.'´　　　　　　　｀ヽ　 ｀ .::: .: .:.:.:.:. . ..　　 ,.‐ ､ j\r\n" + //
                "　　　　　　　　　　　　　　　　　　／　　　 , ‐､:.＼　　　＼　　,　イ .::::...　　　　　　　　'.　　｀､.:. :.:. :. :.: . .:. ,'　 　＼\r\n" + //
                "　　　　　　　　　　　　　　　　 ／　　　 ／.::::.:.＼:.＼　　　＼,^ヽ,′.:::::: . .　　　　　 　 ト､　　｀､.:.: .: .: .:.:.:,　 　　　 ＼\r\n" + //
                "　　　　　　　　　　　　　　　／　　　,.イ.://´￣｀ ＼:.＼　　　＼:{ r r:､.:::::::. . 　　 　 ,.‐i´ ﾐヽ､　 ヽ .:.:.:.:::. :.　── ─‐ヽ､\r\n"
                + //
                "　　　　　　　　　　　　　 ／　　　／.:::::// /⌒).:::／＼ ＼_ .... _V L{:::.丶､_ ＿ ,.　.ｲ:/:i´｀ﾄ､. :＼　 .: .:. :. :.　 .: .::/.:.:.:.:.:.:,ﾊ\r\n"
                + //
                "　　　　　　　　　　　　／　　　／.:::::::((　).:::_ノ／　　　＼/_＿ /(　｀丶､.:::（ __）.:::ノ/ .:i´｀ﾄ､.:::.:.:.:ヽ　.:.:.:.:.:.:.:.:.／.:.::::::::::.:{　}\r\n"
                + //
                "　　　　　　　　　　 ／　　　／,.:' ,.:'／　／_ノﾉ　　　　　　＼　, '´ ,'^ヽ､_｀\"\"\"\"´__　_ノ´`ｿ ∧.:::.::.::ヽゝ-- ＜.:.::::::::::ヽ.::::V'.\r\n"
                + //
                "　　　　　　　　　／ 　　 ／,.:' ,.:'／　 く_／rく　　　　　　　 c.ヽ〃⌒ヽヽ　￣￣　 「　} ｀ｿ /.:::.',.:::.:::.:ヽ　　　　ヽ.:.:.:::____ノ　.',\r\n"
                + //
                "　　　　 　 　 ／ 　,. ´／,.:' ,.:'／,.　-=＝＝＝＝＝＝＝= ､　{.{　　　 .}:j::i´ ￣｀i::ﾉ'-'‐'´ /.:::::.:.',.:.:::.:/　　　　　　＼__＿＿ノ\r\n"
                + //
                "　　　　 　 ／　 ,. ´／,.:' ,.:'／ 「.::「.::「.:::「「.:::j「.::::j「.::::j「.:::::「フ ､ヽ __.ノﾉL［三三!:::::::::::／.::::::.:.::::',.::/　　　　　　 〈 ,ゝ----'´ )\r\n"
                + //
                "　　　　 ／　,. ´／,.:' ,.:.'／　__」.::」.::」.:::」j.:::::ﾘ.:::::ﾘ.::::::ﾘ.／　　// `ー'.::: .:.:.`ヽ .:::.:,.　'´.: :: .　　 .　.:.　　　　　　　/ /　`y'´｀V\r\n"
                + //
                "　　　／　,. ´／ ,.:' .:'／ ／／,.　--- ､￣｀T´二 二フ　　　 //.: :`ヽ.: :: .: :: .:.:V´.: :: .::　　 ,､､､､,,　　　　　　　　｀(　__ノ __ノ)\r\n"
                + //
                "　 ／　　 ／　,.:'　／　ﾉレ'//,.　--- ､＼ /　´ ￣フ´￣｀＜/.:.::::::::::.';:::::::::::::. :.:';.:.:.:.: .:　　,' .:.:;;;;;;;;',　　　　　　　　　`ヽ.::ノﾉﾉ\r\n"
                + //
                "∠　＿,.　　‐ 　 ´　　 |.::|//´ ,.　--- ､ V　　〃´ .,r'´　 ￣｀ヽ､.:.:.::::::';:::::::::. :. :.:'; .:.:.:　　 r .:;:;;;:;:;:;;}\r\n"
                + //
                "　　　　　　 　 　 　 　 |.::|/ , '´　　　　 V ﾆﾆ{ l 　 {.　　　 ,r´￣｀ヽ.:.::::';:::::::::::.:. :.:'; .:　　　ﾘ .:;;;;;:;:;ｼ\r\n"
                + //
                "　　　　　　 　 　 　 　 |_ﾉV /´　/ /´___　 ﾄ､_'... 　 '､ r_‐l:::::::::::::::::|.:.::::::;.:.:.:.:.: 　　　 _,. ィ´`ヽ ￣｀}､　　｀丶､\r\n"
                + //
                "　　　　　　　　　　　　 〈.:::| | 　 |: |::! ____) LL__ゝ .: .丶､ .ヽ.:::::::::ノ.:.:.::::ﾉ.:.:.: .:　　/´｀ヽ.::｀ヽ　ヽ__/ `ヽ､　　　｀丶､\r\n"
                + //
                "　　　 　 　 　 　 　 　　 ヽ| | 　 |: |::!　　 )_ ＿ 〕.::.{｀ ー ' .:.:￣. :.:.:.::::::::::. :. 　　,/_　　　';.::i ゝ ---- ｲ｀7ヽ　　　　.:ヽ\r\n"
                + //
                "　　　　　 　 　 　 　 　 　 L| 　 |: |::|´￣ ).::ゝ‐‐L_{　 / /.:.:.:. :. :.::::::::::::::.:　　 /´_‐`ヽ ..ﾉ i l::::::::::::::::l |. /　 '､　　 .:.:.:.|\r\n"
                + //
                "　　　　　　　　　　　　　　　| 　 |. |::|´￣ }.:入.::__‐_.＼_.:.:.::::::::::::::::::::::::::::　　 /´ `ヽ }ﾉ/.:::i l::::::::::::::: l |/　　　ﾞ､　　.:.: |\r\n"
                + //
                "　　　　　　　　　　　　　　　L＿L」ﾉﾞ´「´(.:::::´.::_.::_.::::::.:) .: .: .::::::::::::::::/　　 /　　 /ｿ /.::::j l.:::::::::::::::ﾉﾉ｀ヽ ,　´¨ﾞ､　＼|\r\n"
                + //
                "　　　　　　　　　　　　　　　　　　　　 L_/.::/´｀¨¨/ /´ .: .: .:.::::::::::::::/　　 /　 　,′ｊﾉ.::∧.:::`ヽヽ｀ﾞﾞﾞﾞﾞヽ＼V´￣ '.\r\n"
                + //
                "　　　　　　　　　　　　　　　　　　　　　 ￣ 　 　 / / .: .: .: .:.:::::::::::::/:　　/　 ／.:, ´`V　人　 ｊ ﾘ__ _ ___.ｊ ﾘ {　　　i　　ヽ\r\n"
                + //
                "　　　　　　　　　　　　　　　　　　　　　 　 　 　 〈/ .: .: .:.:.:.:.:::::::::::/.: 　 /　. '.:::::/　 .:::}´　,.'」_［］‐‐ ［］‐‐」　',　　 !　　　ト､\r\n"
                + //
                "　　　　　　　　　　　　　　　　　　　　　　　 , 　'´´＼ .: .: .:.:::::::::::/.: 　 /‐./.::::::〈　 .:::人 ,.' ___ﾉﾉ_＿ﾉﾉ___ﾉ　　'.　 |　　　 l　 ＼\r\n"
                + //
                "　　　　　　　　　　　　　　　　　　　　　,　 '´　　　 / ＼ .:.:.::::::::/.:　　ﾉ　V.:.:::::::::｀7´　. :. :.} }　　　} } .:U: 　 　 }　j　　＼ l　　　ヽ\r\n"
                + //
                "　　　　　　　　　　　　　　　　　　　,　´　　 ,.　 ´/　　　＼. .:.:/.:.:.:.　{　　ﾄ､.::::::::/　 .: .: .: .:LL_____」」 .:ﾘ.　　　ﾉ´ )　 .:.:.:.:＼　 .::::}\r\n"
                + //
                "　　　　　　　　　　　　　　　　　,.　´　　 ／　　 /　. :. :.: .: .:.:. :. :.:.　 /｀ｰ'　 ヽ/　　　.: .: .: .: .: .: .: .: .: .: L|　　｀ｰ'");
    }

    public boolean gameplayGeneral(Arma_IF arma, Arma_IF armaSecundaria) {

        while (true) {
            desenhar();
            InOut.MsgDeInformacao("Disgaea Hour of Darkness",
                    "Você escolheu o General!\nVocê possui os seguintes equipamentos:\nFuzil e Revolver\nO jogo começa agora!");
            falar();
            InOut.MsgDeInformacao("Disgaea Hour of Darkness",
                    "Em uma operação militar você se encontra sem seu pelotão (Todos mortos), olha para os dois lados\ne apenas vê além de destruição uma caixa de suprimentos, e um pouco mais distante um bunker...\n\nO que você escolhe?");
            int opt = InOut.leInt(
                    "[1] - Caixa de suprimentos (Nada suspeito)\n[2] - Se abrigar no bunker... (Chatooooo!!!)");
            if (opt == 1) {
                InOut.MsgDeInformacao("Disgaea Hour of Darkness",
                        "Você Morreu!\nUma armadilha bem bolada pelos inimigos... você cai como um patinho (quem ia saber que havia uma bomba engatilhada acoplada a caixa...)");
                InOut.MsgDeAviso("Disgaea Hour of Darkness", "Fim de jogo!");
                return false;

            }
            if (opt == 2) {
                InOut.MsgDeInformacao("Disgaea Hour of Darkness",
                        "O bunker?\n(Pare de ser tão conservador)");
                InOut.MsgDeInformacao("Disgaea Hour of Darkness",
                        "O tempo passa e você escuta passos (talvez o resgate?)\nVocê ouve um barulho muito peculiar...\nalgo deu errado...\n");
                InOut.MsgDeErro("Disgaea Hour of Darkness", "INIMIGO APARECE");
                InOut.MsgDeInformacao("Disgaea Hour of Darkness",
                        "Um pelotão inimigo!!!!...\nSua vida depende disto... faça sua escolha...");
                opt = InOut.leInt("[1] - Usar Fuzil - [2] - Usar revolver");
                if (opt == 1) {

                    return arma.usarArma();
                }
                if (opt == 2) {

                    return armaSecundaria.usarArma();
                }
            }
        }

    }

}
