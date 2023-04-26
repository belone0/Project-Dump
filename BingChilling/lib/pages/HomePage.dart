import 'package:audioplayers/audioplayers.dart';
import 'package:flutter/material.dart';

class HomePage extends StatefulWidget {
  const HomePage({Key? key}) : super(key: key);

  @override
  State<HomePage> createState() => _HomePageState();
}

class EfeitoWidget extends StatelessWidget {
  final String nome;
  final String sound;

  const EfeitoWidget({Key? key, required this.nome, required this.sound})
      : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Container(
      padding: const EdgeInsets.all(32),
      child: Row(
        children: [
          Expanded(
            /*1*/
            child: Column(
              crossAxisAlignment: CrossAxisAlignment.start,
              children: [
                /*2*/
                Container(
                  padding: const EdgeInsets.only(bottom: 8),
                  child: Text(
                    nome,
                    style: const TextStyle(
                      fontWeight: FontWeight.bold,
                    ),
                  ),
                ),
              ],
            ),
          ),
          Column(
            children: [
              ElevatedButton(
                  onPressed: () {
                    final player = AudioCache();
                    player.play(sound);
                  },
                  style: ElevatedButton.styleFrom(
                    shape: const CircleBorder(),
                    padding: const EdgeInsets.all(10),
                    primary: Colors.purple
                  ),
                  child: const Icon(Icons.volume_up)),
            ],
          )
        ],
      ),
    );
  }
}

class _HomePageState extends State<HomePage> {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        centerTitle: true,
        title: const Text('marreta12345678987654321@gmail'),
        backgroundColor: Colors.purple,
      ),
      body: ListView(
        children: [
          GestureDetector(
            onTap: (){
              final player = AudioCache();
              player.play('boom.mp3');
            },
            child: Image.asset(
              'assets/caio.png',
            ),
          ),
          const EfeitoWidget(nome: '🥶 Bing Chilling ', sound: 'jhonXina.mp3'),
          const EfeitoWidget(nome: '🥚 Ovo de Pascoa', sound: 'ovodepascoa.mp3'),
          const EfeitoWidget(nome: '⚠️ Sirene', sound: 'sirene.mp3'),
          const EfeitoWidget(nome: '🐔 Un video ma mi gente', sound: 'unvideoma.mp3'),
          const EfeitoWidget(nome: '🥸 Goofy Ahh Sound', sound: 'cartoon.mp3'),
        ],
      ),
    );
  }
}
