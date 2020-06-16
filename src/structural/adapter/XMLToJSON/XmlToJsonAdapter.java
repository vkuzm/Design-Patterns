package structural.adapter.XMLToJSON;

public class XmlToJsonAdapter {

  private XmlData xmlData;

  public XmlToJsonAdapter(XmlData xmlData) {
    this.xmlData = xmlData;
  }

  public String convertToJson() {
    String result = xmlData.data();

    return result.replace("<user><name>Nick</name><age>18</age><height>150</height></user>",
        "user: { name: Nick, age: 18, height: 150 }");
  }
}
