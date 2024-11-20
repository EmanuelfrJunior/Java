import java.util.Scanner;
import Humans.People;
import Message.ChatView;
import Message.Message;

public class Main{
    public void main(String[]args){
        Scanner sc = new Scanner(System.in);    
        People peopleH = new People();
        Message chat = new ChatView();

                chat.SpeakName();
                peopleH.setNome(sc.next());

                chat.SpeakAge();
                peopleH.setage(sc.nextByte());

                peopleH.ChatEnd(); 

    }
}