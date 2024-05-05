public class SimuladorFofoca {
    public static void main(String[] args) {

        Node[] nodes = new Node[5];
        for (int i = 0; i < 5; i++) {
            nodes[i] = new Node(i + 1);
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 1; j <= 10; j++) {
                int nextIndex = (i + j) % 5;
                nodes[i].addNeighbor(nodes[nextIndex]);
            }
        }

        for (Node node : nodes) {
            node.startGossip();
        }
    }
}