package Second_Project;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

public class Demo {

    public static void main(String[] args) throws Exception {
        StringWriter writer = new StringWriter();

        JAXBContext jc = JAXBContext.newInstance(Network.class, NetworkInputs.class);

        File networkXML = new File("/root/Загрузки/Network.xml");
        Unmarshaller unmarshaller = jc.createUnmarshaller();
        Network network = (Network) unmarshaller.unmarshal(networkXML);

        File networkInputsXML = new File("/root/Загрузки/NetworkInputs.xml");
        Unmarshaller unmarshaller2 = jc.createUnmarshaller();
        NodeAdapter nodeAdapter = new NodeAdapter();
        for(Node node : network.getNodes()) {
            nodeAdapter.getNodes().put(node.getId(), node);
        }
        unmarshaller2.setAdapter(nodeAdapter);
        NetworkInputs networkInputs = (NetworkInputs) unmarshaller2.unmarshal(networkInputsXML);

        Marshaller marshaller2 = jc.createMarshaller();
        marshaller2.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller2.marshal(networkInputs, System.out);

//        Node node1 = new Node();
//        node1.setId("ROD");
//        Node node2 = new Node();
//        node2.setId("KFI");
//        Node node3 = new Node();
//        node3.setId("JND");
//
//        List<Node> nodeList = new ArrayList<>();
//        nodeList.add(node1);
//        nodeList.add(node2);
//        nodeList.add(node3);
//
//        Network network = new Network();
//        network.setNodeList(nodeList);
//
//        Flow flow = new Flow();
//        flow.setToNode(node3);
//        Flow flow1 = new Flow();
//        flow1.setToNode(node1);
//        List<Flow> flowList = new ArrayList<>();
//        flowList.add(flow);
//        flowList.add(flow1);
//
//        NetworkInputs networkInputs = new NetworkInputs();
//        networkInputs.setFlowList(flowList);
//
//        JAXBContext context2 = JAXBContext.newInstance(NetworkInputs.class);
//        Marshaller marshaller2 = context2.createMarshaller();
//        marshaller2.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
//        marshaller2.marshal(networkInputs, new File("/root/Загрузки/NetworkInputs.xml"));
////        marshaller2.marshal(networkInputs, writer);
////        System.out.println(writer);
//
//        JAXBContext context = JAXBContext.newInstance(Network.class);
//        Marshaller marshaller = context.createMarshaller();
//        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
//        marshaller.marshal(network, new File("/root/Загрузки/Network.xml"));
//        marshaller.marshal(network, writer);
//        System.out.println(writer);
    }
}