package structural.adapter.XMLToJSON;


public class Main {
    public static void main(String[] args) {

        XmlData xmlData = new XmlDataImpl("<user><name>Nick</name><age>18</age><height>150</height></user>");
        XmlToJsonAdapter xmlToJsonAdapter = new XmlToJsonAdapter(xmlData);

        JsonData jsonData = new JsonDataImpl(xmlToJsonAdapter.convertToJson());
        System.out.println(jsonData.data());
    }
}
