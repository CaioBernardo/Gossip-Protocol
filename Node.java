import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Node {
    private int id;
    private List<Node> neighbors;
    private String data;

    public Node(int id) {
        this.id = id;
        this.neighbors = new ArrayList<>();
        this.data = "Dados";
    }

    public void addNeighbor(Node neighbor) {
        neighbors.add(neighbor);
    }

    public void startGossip() {
        Random random = new Random();
        Node randomNeighbor = neighbors.get(random.nextInt(neighbors.size()));
        randomNeighbor.receiveGossip(data);
    }

    public void receiveGossip(String gossip) {
        this.data = gossip;
        System.out.println("Nó " + id + " recebeu o gossip: " + gossip);
    }
}
