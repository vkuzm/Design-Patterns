package structural.adapter.XMLToJSON;

public class JsonDataImpl implements JsonData {

  private String data;

  public JsonDataImpl(String data) {
    this.data = data;
  }

  @Override
  public String data() {
    return data;
  }
}
