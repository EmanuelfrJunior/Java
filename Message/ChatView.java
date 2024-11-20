package Message;

public class ChatView implements Message {

    @Override
    public void SpeakName() {
        System.out.println("Digite seu nome: ");
    }

    @Override
    public void SpeakAge() {
        System.out.println("Digite sua idade: ");
    }
    
}
