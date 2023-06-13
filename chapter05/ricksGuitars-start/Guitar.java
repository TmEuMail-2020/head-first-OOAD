import java.util.Objects;

public class Guitar {

  private String serialNumber;
  private double price;
  GuitarSpec spec;

  public Guitar(String serialNumber, double price, GuitarSpec spec) {
    this.serialNumber = serialNumber;
    this.price = price;
    this.spec = spec;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Guitar guitar = (Guitar) o;
    return Double.compare(guitar.price, price) == 0 && Objects.equals(serialNumber, guitar.serialNumber) && Objects.equals(spec, guitar.spec);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serialNumber, price, spec);
  }

  public String getSerialNumber() {
    return serialNumber;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(float newPrice) {
    this.price = newPrice;
  }

  public GuitarSpec getSpec() {
    return spec;
  }
}
