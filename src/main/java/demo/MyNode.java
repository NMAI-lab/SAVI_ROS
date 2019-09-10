package demo;

import org.ros.namespace.GraphName;
import org.ros.node.Node;
import org.ros.node.NodeMain;

public class MyNode implements NodeMain {

    @Override
    public GraphName getDefaultNodeName() {
        return new GraphName("my_node");
    }

    @Override
    public void onStart(ConnectedNode node) {
    }

    @Override
    public void onShutdown(Node node) {
    }

    @Override
    public void onShutdownComplete(Node node) {
    }

    @Override
    public void onError(Node node, Throwable throwable) {
    }
}