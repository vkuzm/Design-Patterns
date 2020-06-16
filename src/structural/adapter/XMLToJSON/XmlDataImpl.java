package structural.adapter.XMLToJSON;

public class XmlDataImpl implements XmlData {

  private String data;

  public XmlDataImpl(String data) {
    this.data = data;
  }

  @Override
  public String data() {
    return data;
  }
}
