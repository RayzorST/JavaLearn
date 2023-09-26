package lab12;

import java.util.Stack;

public class PlayerDequeue {
    private Stack<Integer> Cards = new Stack<>();

    public PlayerDequeue(String cards){
        for(int i = 0; i < cards.length(); i++){
            Cards.add(cards.charAt(i) - 48);
        }
    }

    public int getUpCard(){
        int buf = Cards.get(0);
        Cards.remove(0);
        return buf;
    }

    public Boolean isEmpty(){
        return Cards.empty();
    }

    public void addCards(int a, int b){
        Cards.push(a);
        Cards.push(b);
    }
}
