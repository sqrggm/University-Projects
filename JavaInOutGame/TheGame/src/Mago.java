public class Mago extends PersonagensEspeciais {

    public Mago(ArmasMagicas magia) {

        magia = this.magia;

    }

    @Override
    public void desenhar() {
        InOut.MsgSemIcone("Disgaea Hour of Darkness",
                "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣟⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡈⠙⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
                        + //
                        "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠻⣿⡿⣿⣻⣜⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⠀⢹⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
                        + //
                        "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⣿⣿⣿⣿⣿⣆⠈⠙⠩⠁⣰⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡄⠂⢻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
                        + //
                        "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣽⣿⣿⣿⣿⣟⣿⠁⡈⠄⠘⣟⡆⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⠠⠘⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
                        + //
                        "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣟⣿⣿⣿⣿⣟⡾⠃⠀⠄⣈⣂⠹⣌⠘⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣇⠠⠹⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
                        + //
                        "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡟⣁⣴⣿⣴⢿⣯⣯⣿⡌⣹⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡄⠘⢻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
                        + //
                        "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠀⣠⣼⣿⣷⡿⣯⣵⣿⣿⣿⣿⣿⣿⣶⣶⡉⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⠀⠌⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
                        + //
                        "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡐⠈⠙⠻⢿⣿⣤⣿⣿⣿⣿⣿⠿⣿⢻⡟⣿⠇⡘⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣇⠠⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
                        + //
                        "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣏⠃⣼⣶⣾⣿⣿⣎⣹⣿⣿⣿⡏⠻⣴⠏⢰⡇⠟⠀⢻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠄⠀⣻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
                        + //
                        "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⢻⣤⣿⣿⣿⣿⣿⣿⣷⢽⣿⣯⢹⣄⡠⠐⣸⡀⢤⡃⠘⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⠀⡀⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
                        + //
                        "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣟⢢⣿⣿⣿⣿⢿⣶⣽⣿⣻⣿⡟⣸⡗⠀⢄⠠⠙⣆⢡⡀⢻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡟⠉⠀⡀⢈⠁⡈⣉⠘⠛⠛⠻⠿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
                        + //
                        "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣧⣿⣿⣿⣿⣿⡿⣿⣿⣿⣿⣻⣱⠏⣀⣎⢀⡷⠋⣹⣆⢣⡄⢹⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣮⡙⣒⡒⠛⢋⡁⠐⢀⠂⠐⡀⠀⠄⠈⠉⠙⠛⠻⡿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
                        + //
                        "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣻⠿⣿⢻⡦⢟⠚⣟⢛⣼⠃⠶⠜⣡⢎⣀⢌⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠏⠋⠀⡀⢀⠉⢉⠚⠒⠬⢄⡠⠁⠀⠌⠀⠌⢀⠁⠹⢡⣶⣌⠻⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
                        + //
                        "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣽⣿⡌⠛⢿⣿⣿⣷⠟⠺⠿⠾⢯⣷⣶⢺⣧⠀⣴⣌⢰⡋⠨⠄⡀⢺⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡟⠛⠉⠉⠁⠠⠀⠿⣭⣖⣀⠂⠀⢂⠐⠀⡉⠳⢮⣄⣈⠀⠂⠠⡎⣼⣶⣿⣦⣄⠙⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
                        + //
                        "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡛⢼⡿⠋⢀⠀⡈⠙⠛⠛⠛⣫⡵⢛⣷⡆⢺⡷⠐⠺⣡⠺⣥⢩⠅⠀⠄⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⠐⠈⡀⠡⠐⠀⠄⢀⠈⠛⠻⣶⣤⣄⣁⠠⠐⠈⠙⠻⣷⣮⡀⠷⣹⣿⢟⣾⡾⡷⡀⠙⠿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
                        + //
                        "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡟⢧⣟⣀⣀⣂⡠⠐⠀⢂⣴⢟⡉⢴⡽⡿⢸⠿⣤⡾⢧⣠⠖⣋⢴⡆⠈⠠⠘⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣮⡀⠐⢀⠐⠈⡀⠄⢀⠂⠀⠌⠙⠿⣷⣔⢄⠂⠐⡀⠈⠛⢿⣦⢣⢰⣿⢷⠁⢟⠱⠀⠂⠈⠿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
                        + //
                        "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⢯⢶⣯⢽⣿⣿⣿⡄⢈⡾⠩⣠⡤⣿⡅⣯⢸⣆⠈⢁⢀⢥⢠⡇⢘⡆⠁⠄⡁⢹⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡟⡏⠙⠿⣿⣿⣿⣿⣿⣿⣿⣷⣦⣦⡅⠀⠄⠂⢀⠁⡀⠂⢀⠀⡙⢝⢵⡄⢀⠡⠐⠀⠛⢿⣇⠘⠈⢀⠀⡀⠂⢁⠈⡀⠈⢻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
                        + //
                        "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡯⣏⣼⣿⣿⣿⣿⣿⣿⣾⡷⣏⣿⣮⢺⠃⡉⠈⣧⢀⢂⡀⠐⣼⣁⠈⡙⠀⠄⢧⡈⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠆⢰⡄⠹⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣦⣌⠀⠂⠀⠄⠐⠀⠠⠀⠂⠱⣷⠘⢁⠠⠈⠠⠈⣿⣆⠐⠀⠠⠐⠀⠂⢀⠀⡁⠄⠈⢻⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
                        + //
                        "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣱⣼⣿⣿⣿⣿⣟⣿⣻⣿⣹⠧⣿⡵⢓⠅⣨⠞⠁⡀⢀⠠⠈⠿⡌⠐⡁⢈⠄⡞⠁⠘⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡄⢀⣻⡦⠀⠹⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣆⠈⠄⠂⢈⠀⢁⠠⠁⢈⠉⠡⠄⠀⠂⢁⠠⠘⠙⠀⡈⠄⠀⠡⠐⠀⠠⠀⠠⠁⢠⠘⢿⣿⣿⣿⣿⣿⣿⣿\r\n"
                        + //
                        "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⢡⣾⣿⣿⣿⣿⣿⣿⣾⡿⠋⣹⢺⣟⣷⣝⡸⠡⠶⢤⡄⠠⢠⡦⡴⣌⡶⠀⣱⠎⠄⣈⠀⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣄⢻⡇⠀⡁⠙⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⡀⠌⠀⡀⠂⢀⠐⠀⠰⠀⠠⠁⢈⠀⠠⠐⠀⡐⠀⠠⠈⢀⢐⡌⠀⠄⢁⢰⣂⡃⠈⣿⣿⣿⣿⣿⣿⣿\r\n"
                        + //
                        "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⢻⡟⣿⣿⠿⠿⡿⠟⠛⠁⠀⣿⣿⣿⡼⢿⢉⠰⢈⢆⢧⢠⡟⡤⢐⡛⢠⠿⢡⡖⢺⢋⡠⠸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣎⠀⡐⠀⠄⡈⠻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣦⠐⠀⡐⠀⠠⠈⠀⠄⠁⡀⠂⢀⠁⡐⠀⠄⠠⠁⠐⢠⣿⣿⣶⣠⠸⣟⢸⡇⠀⣿⣿⣿⣿⣿⣿⣿\r\n"
                        + //
                        "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⢹⣄⢻⣼⣿⣷⡀⠘⠀⡐⠈⡀⣿⣿⡞⢳⠀⣥⢂⡤⠈⢈⠎⠠⡄⠟⢁⡼⡀⠘⠩⢈⠁⠀⠌⢹⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣦⠐⢀⠂⠀⠌⠙⠿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⡀⠠⠀⢁⠠⠁⢀⠂⢀⠐⠀⠠⠀⢂⠀⠂⠠⢁⣿⣿⣿⣿⠏⣴⣿⣿⠁⢐⣿⣿⣿⣿⣿⣿⣿\r\n"
                        + //
                        "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⢐⣏⣿⣿⣿⣿⣿⠒⠁⠠⠐⠀⡀⠉⢓⣢⣴⣯⢰⡮⢃⡻⡄⠴⢕⢤⡾⠁⢧⠈⠠⣁⠠⠁⢁⠈⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⡄⠠⠈⠀⠄⠠⠐⣌⣉⠛⢿⣿⣿⣿⣿⣿⣿⡆⠐⠀⡀⠄⠂⠀⠄⠠⢈⣴⣱⣄⠠⣥⠀⢸⣿⣿⣿⡿⢀⢻⣿⢃⠀⣸⣿⣿⣿⣿⣿⣿⣿\r\n"
                        + //
                        "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣠⣾⣿⣿⡿⣿⠃⠀⡌⡀⠄⠁⣶⣾⣟⢡⣞⠻⣇⡔⠀⢍⠀⣆⠛⢾⡁⠠⠈⠧⢈⡑⠊⢀⠂⠠⢹⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣦⡂⢁⠀⠂⠄⠑⢌⢷⢤⡈⠛⠿⠿⠿⠛⠀⠠⠁⢀⠠⠐⠈⠀⠄⣼⣿⣿⣿⡇⠻⣧⠸⡟⣿⣿⣦⠚⣼⣿⠷⠀⢸⣿⣿⣿⣿⣿⣿⣿\r\n"
                        + //
                        "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣰⣿⣿⣟⣾⠃⣠⣵⣷⣿⣦⠈⣿⡟⣷⣯⣿⣵⣏⢸⠧⢂⠐⠀⣽⠢⠄⣀⠲⠀⢰⡊⢡⡀⠐⠠⠘⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣶⣄⠈⢀⠂⠀⠙⡆⠁⠧⣧⠦⡥⡐⠄⠡⠀⠠⠀⡀⠂⢁⣾⣿⣿⢿⣿⣷⣼⠌⢀⢰⢹⣿⠿⠀⣿⣟⡆⠀⢺⣿⣿⣿⣿⣿⣿⣿\r\n"
                        + //
                        "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡷⣏⣾⣷⣿⣿⣿⣾⣿⣿⣿⣿⣿⣧⡏⡟⣾⣮⣿⡿⣾⣀⠐⠁⠠⠸⠃⠔⠋⡉⢉⠒⡀⠇⠐⠁⠠⠁⠠⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣦⣀⠁⠂⡠⠈⠑⠚⡇⠛⣀⡧⠁⠠⠁⡀⠄⡀⣿⠁⠙⢸⡜⢸⣿⣧⠈⡤⠈⠿⣿⣧⢐⢻⡯⢱⠀⢸⣿⣿⣿⣿⣿⣿⣿\r\n"
                        + //
                        "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡟⡼⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⢻⣿⡟⣛⡿⢿⣿⣿⣟⠂⠄⠬⠂⠤⠐⠄⠁⡀⠂⠠⠀⠌⠀⠡⠐⠈⡀⠄⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣤⠀⡐⠠⠀⡀⠄⠈⢀⠠⠁⠀⠄⡀⠨⠁⠠⢜⠐⣀⠼⣿⣿⣿⡁⠂⣰⣿⡇⠸⣿⠃⢈⠠⠈⣿⣿⣿⣿⣿⣿⣿\r\n"
                        + //
                        "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣶⣿⣿⣿⠿⢿⠿⣿⡿⣿⣿⣿⣿⣶⣷⣾⣶⣾⣿⡿⣿⣿⢿⣷⢶⣶⡶⢾⡾⠿⠿⠷⠶⠶⠷⠾⠷⠶⠾⣷⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣦⣀⠐⠀⠠⠈⢀⠀⠄⠁⡀⠠⠐⠀⠁⡘⠈⡈⠀⠙⡻⣿⡧⡙⢳⣿⡇⠘⣿⠀⢠⠀⠄⣿⣿⣿⣿⣿⣿⣿\r\n"
                        + //
                        "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡟⠋⠉⡉⠉⡀⢨⠀⢉⠁⠉⠉⠉⠉⠉⠉⠉⢻⣿⡉⠁⠉⠉⠈⠉⡈⠉⢷⣈⠁⡀⡄⢠⠀⡄⢀⠆⢠⠰⠀⡉⢉⢿⡿⣿⣿⣿⣯⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣧⡀⠃⡀⠎⢀⠰⠀⢡⠀⠰⠘⢀⢡⠰⠹⠀⡰⢁⢻⣿⣷⠈⣿⢷⣄⣿⢀⠘⡄⠀⢻⣿⣿⣿⣿⣿⣿\r\n"
                        + //
                        "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠃⢠⠃⡁⠆⣁⣣⣴⣬⣼⣤⣃⡜⠀⡃⠘⡄⠈⡟⣇⠀⡃⠘⡀⠃⡁⣾⣿⣿⡷⠟⢀⠰⠀⠸⠈⡀⠆⢀⠃⡁⢸⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣆⡁⠰⠈⢠⠘⠀⡄⠃⡀⠎⠀⡄⠆⠀⡅⢈⠆⡟⣏⣇⢸⣇⢸⣧⠈⢀⠆⠃⢸⣿⣿⣿⣿⣿⣿\r\n"
                        + //
                        "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠆⢀⣣⣷⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣅⡰⠀⡃⢹⢻⡆⢁⠰⠁⣤⣿⣿⢿⠏⢀⢰⣨⣶⣾⣿⣿⣿⣿⣿⣶⣧⣘⡘⣿⣿⣿⣿⣿⣿⣿⣿⣿⣞⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠆⠃⢠⠀⢃⠀⠆⠁⡄⠃⡀⠆⠃⡀⠎⠸⢸⣿⣿⣾⣟⡸⠉⡃⢨⠀⡜⢸⣿⣿⣿⣿⣿⣿\r\n"
                        + //
                        "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣶⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣦⡁⡾⢸⣷⠈⠀⣾⣿⡛⠁⣾⣧⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠀⡜⠀⡰⠈⢠⠘⠀⡄⠆⠁⡄⠃⠁⡄⠃⡀⢙⣿⣯⢟⣿⠀⢡⠃⢀⠆⢸⣿⣿⣿⣿⣿⣿\r\n"
                        + //
                        "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣧⠐⢨⣿⠀⢰⣿⣿⣇⣶⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⣽⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⡀⠄⠀⠁⠠⠀⢀⠂⠀⠠⠐⠀⠐⠀⠠⠀⢁⠘⡌⣷⠈⠗⠀⠠⠀⠌⠀⣸⣿⣿⣿⣿⣿⣿\r\n"
                        + //
                        "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠿⠋⠁⣠⣤⣶⣶⣮⡍⡛⢿⣿⣿⣿⣿⣷⣽⡏⠀⣿⣿⣿⣿⣿⣿⣿⣿⠟⠛⠉⣉⣃⡐⢦⡀⠉⠛⣿⣿⣿⣿⠿⣿⣿⣿⣿⣿⣿⣿⢧⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡌⠀⡀⠌⠀⡐⠀⠠⠀⢈⠀⠄⠈⡀⠌⠀⡐⠀⠠⠈⢛⠃⢀⠈⡀⠐⠀⠂⢸⣿⣿⣿⣿⣿⣿\r\n"
                        + //
                        "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠏⠁⡀⠐⣼⣿⣿⣿⣿⣿⣿⡽⣆⠈⡻⣿⣿⣿⣿⣶⣤⣿⣿⣿⣿⣿⡿⠫⠁⡴⣡⣿⣿⣿⣿⣷⡝⠦⠀⡀⠹⢿⣿⡦⣿⣿⣿⣿⣿⣿⢟⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⡀⠀⠄⠂⠀⠄⠁⡀⠂⠀⠄⠂⢀⠠⠐⠀⠠⠁⢀⠂⢀⠂⠀⠄⠈⠐⠈⢸⣿⣿⣿⣿⣿⣿\r\n"
                        + //
                        "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡁⢀⠂⢀⠂⣿⣿⣿⣿⣿⣿⣿⡿⣽⠇⠀⠈⣻⣿⣿⣿⣿⣿⣿⣿⡿⠋⠀⠀⠄⡇⢹⣿⣿⣿⣿⣿⡿⠿⠁⠀⠄⢀⣿⣧⣿⣿⣿⣿⣿⡿⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡁⠠⠀⠁⡀⠂⠀⠄⠁⠠⠐⠀⡀⠄⠂⠁⢀⠂⠀⠂⡀⠁⠠⠈⠀⠌⢸⣿⣿⣿⣿⣿⣿\r\n"
                        + //
                        "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⡀⠐⡀⢀⠻⣿⣿⣿⣿⣿⡿⢳⠏⠀⠠⠁⠀⣹⣿⣿⠿⠿⣿⡟⠀⠀⠌⠀⠄⠘⢌⠻⢿⣿⣿⡿⠛⠋⠀⠌⢄⣾⣿⣿⣿⣿⣿⣿⣿⣿⣶⣙⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⡀⠂⠁⠀⠄⠁⠠⠈⠀⠄⠂⢀⠠⠐⠈⠀⠠⠈⠀⠄⠈⡀⠄⠁⠠⢸⣿⣿⣿⣿⣿⣿\r\n"
                        + //
                        "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣦⡀⠂⢀⠈⠛⠿⠯⠗⠚⠁⡀⠐⢀⣢⣿⣿⣿⠒⠀⡀⢸⣿⣦⡁⠠⠈⠀⠌⠀⡑⠒⠪⠒⠊⠁⠠⢈⣴⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣌⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡖⠁⠈⡀⠈⡀⠄⠁⠠⠐⠀⡀⠄⠂⠁⡀⠂⠁⡀⠂⢀⠠⠈⢀⢸⣿⣿⣿⣿⣿⣿\r\n"
                        + //
                        "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣶⣄⣐⠀⠄⠠⠐⠀⣂⣠⣼⣿⣿⣿⣿⣿⠆⠀⠄⢸⣿⣿⣿⣷⣤⣁⡀⠂⢀⠐⠀⡐⣀⣥⣶⣿⣿⣿⣿⡿⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣦⠁⢀⠐⠀⠠⠈⠀⠄⠂⢀⠠⠐⠀⠠⠀⠁⡀⠐⠀⡀⠐⠀⢸⣿⣿⣿⣿⣿⣿\r\n"
                        + //
                        "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣟⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠄⠈⡀⢸⣿⣿⡿⢿⣿⣿⣿⣿⣷⣶⣿⣿⣿⣿⣿⣿⣿⢿⠏⠀⣾⣿⣿⣿⣿⣿⣿⣿⣿⡿⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣄⠠⢈⠀⠄⠁⠠⠐⠀⠠⠐⠈⠀⠄⠁⢀⠐⠀⠠⠀⢁⢸⣿⣿⣿⣿⣿⣿\r\n"
                        + //
                        "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣰⡟⠛⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⢿⣿⠗⢠⣿⢟⠀⠐⢀⢸⣿⡟⣷⠩⡿⠿⣿⣿⣿⣿⣿⣿⣿⣿⣟⣻⡾⠁⢀⢲⣿⣿⣿⣿⣿⣿⣿⣿⣿⣇⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣄⠀⢂⠈⢀⠐⠈⢀⠐⠀⠁⠠⠈⠀⠠⠈⢀⠐⠀⣿⣿⣿⣿⣿⣿⣿\r\n"
                        + //
                        "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣧⢿⡀⢀⠉⠻⢿⣿⠿⣿⡿⣟⣙⡿⠋⠀⡀⡟⠁⡒⠀⢁⠠⢸⣿⣿⡜⡆⠈⠓⢌⡿⠻⣿⡿⠛⠋⣣⠔⠁⠀⡼⠀⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣧⠂⠀⠂⠀⠌⠀⠠⠈⠀⢁⠠⠈⢀⠐⠀⡀⠂⣿⣿⣿⣿⣿⣿⣿\r\n"
                        + //
                        "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣯⣇⠀⡐⠀⡀⠈⠉⠛⠉⠉⠁⢀⠀⠂⠀⣿⠀⢿⠀⠠⠀⠘⣿⣿⡟⢿⠀⠂⡀⠈⠁⠒⠓⠒⠉⠁⡀⡌⢰⠃⣹⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣖⠁⠠⠁⠀⠌⠀⠄⠁⡀⠠⠐⠀⡀⠂⢀⣰⣿⣿⣿⣿⣿⣿⣿\r\n"
                        + //
                        "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡄⠞⡇⠀⠌⠐⠀⠌⠐⠈⢀⠠⠁⠂⣸⢢⠈⠀⠄⠁⠠⣿⣿⡿⢸⠀⡁⠀⠌⠐⠀⠂⠐⠈⣀⠀⣇⠃⢠⣿⣿⣿⣿⣿⣿⣿⣿⣿⣹⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⠁⠠⠀⢁⠀⠂⢀⠂⢀⠐⠀⠂⢀⣰⣾⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
                        + //
                        "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣾⡇⠈⣰⠈⢀⠂⠈⠄⠂⠀⢄⡟⠁⠂⠠⠈⠀⠌⠀⢻⡿⡄⢺⠀⠠⠈⠀⠄⠁⡈⢀⠂⢹⠀⠃⣰⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⡟⣻⣛⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡖⠀⢈⠀⠠⠈⢀⠠⠀⠂⠈⢄⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
                        + //
                        "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡤⢮⡐⠀⠂⡀⠡⠀⠌⢀⠘⣧⣧⡌⢢⠀⢁⠠⠈⢸⣗⡎⡄⣇⠂⠁⡈⠀⢂⠀⠄⡠⠸⣈⣴⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣜⣣⣼⣿⣿⣿⣾⣶⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡐⠀⠄⠂⠐⠀⡀⠂⢁⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
                        + //
                        "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣙⡇⢠⡅⢀⠐⠀⢂⠀⠂⠸⣷⢳⣼⠀⠠⠀⢂⠸⣯⣟⣏⣿⠀⢁⠀⠂⠠⠀⠂⡇⠆⣻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣏⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣶⣤⣈⡀⢂⣤⣶⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
                        + //
                        "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠤⣉⡆⠀⠂⢁⠀⠂⠁⢤⣿⡟⣿⠄⢀⠡⠀⡀⣿⣿⣿⣿⠀⢀⠂⠁⠄⠂⠁⣇⡖⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
                        + //
                        "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⡥⠇⢈⡔⠀⡈⠠⢁⣿⠏⢰⣿⠀⠠⠀⢂⠀⣇⠻⣿⡟⠀⠠⠀⠌⠀⡆⡁⢹⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
                        + //
                        "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⠀⡎⣷⠀⠐⠀⣾⢏⣰⣿⣿⣦⡁⠐⣀⣾⣿⣦⣹⣧⣀⠁⡐⠀⠂⣇⢸⣠⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
                        + //
                        "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣧⢀⣧⣀⣌⣰⣿⣿⣿⣿⣿⣿⣷⣾⣿⣿⣿⣿⣿⣿⣧⡀⠄⢈⠀⢹⢰⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
                        + //
                        "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣳⣮⣶⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣄⡈⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
                        + //
                        "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
                        + //
                        "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
                        + //
                        "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
                        + //
                        "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
                        + //
                        "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
                        + //
                        "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
                        + //
                        "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
                        + //
                        "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
                        + //
                        "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
                        + //
                        "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
                        + //
                        "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
                        + //
                        "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
    }

    @Override
    public void falar() {
        InOut.MsgDeInformacao("Disgaea Hour of Darkness", "Mago Diz: Fé no galo");
    }

    public boolean gameplayMago(ArmasMagicas magia) {
        while (true) {
            desenhar();
            InOut.MsgDeInformacao("Disgaea Hour of Darkness",
                    "Você escolheu o Mago!\nVocê possui além de conhecimento uma forte magia...\nO jogo começa agora!");
            falar();
            InOut.MsgDeInformacao("Disgaea Hour of Darkness",
                    "Uma guerra santa se iniciou a muito tempo... está agora no seu 145° ano!\nCercado de monstros... \n\nO que você escolhe?");
            int opt = InOut.leInt(
                    "[1] - Usar sua magia restante... (tudo em um fentiço poderoso!)\n[2] - Desistir (O jogo acaba!)");
            if (opt == 1) {
                return magia.usarArmaMagica();
            }
            if (opt == 2) {
                InOut.MsgDeInformacao("Disgaea Hour of Darkness",
                        "As chances eram baixas...\nFim de jogo!");
                return false;

            }

        }
    }
}
