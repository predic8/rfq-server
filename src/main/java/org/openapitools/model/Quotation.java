package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Quotation
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-19T21:16:00.790208+02:00[Europe/Berlin]")
public class Quotation {

  @JsonProperty("id")
  private UUID id;

  @JsonProperty("product")
  private String product;

  @JsonProperty("quantity")
  private Integer quantity;

  @JsonProperty("price")
  private BigDecimal price;

  /**
   * Gets or Sets shipment
   */
  public enum ShipmentEnum {
    FOB("FOB"),
    
    DAT("DAT");

    private String value;

    ShipmentEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ShipmentEnum fromValue(String value) {
      for (ShipmentEnum b : ShipmentEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("shipment")
  private ShipmentEnum shipment;

  @JsonProperty("mode")
  private String mode;

  public Quotation id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @Valid 
  @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public Quotation product(String product) {
    this.product = product;
    return this;
  }

  /**
   * Get product
   * @return product
  */
  @Pattern(regexp = "(\\w+\\W*)*") @Size(max = 20) 
  @Schema(name = "product", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getProduct() {
    return product;
  }

  public void setProduct(String product) {
    this.product = product;
  }

  public Quotation quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * Get quantity
   * minimum: 0
   * maximum: 1000
   * @return quantity
  */
  @Min(0) @Max(1000) 
  @Schema(name = "quantity", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public Quotation price(BigDecimal price) {
    this.price = price;
    return this;
  }

  /**
   * Get price
   * minimum: 0
   * @return price
  */
  @Valid @DecimalMin("0") 
  @Schema(name = "price", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  public Quotation shipment(ShipmentEnum shipment) {
    this.shipment = shipment;
    return this;
  }

  /**
   * Get shipment
   * @return shipment
  */
  
  @Schema(name = "shipment", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public ShipmentEnum getShipment() {
    return shipment;
  }

  public void setShipment(ShipmentEnum shipment) {
    this.shipment = shipment;
  }

  public Quotation mode(String mode) {
    this.mode = mode;
    return this;
  }

  /**
   * Get mode
   * @return mode
  */
  @Pattern(regexp = "[A-Z]{3}") @Size(max = 3) 
  @Schema(name = "mode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getMode() {
    return mode;
  }

  public void setMode(String mode) {
    this.mode = mode;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Quotation quotation = (Quotation) o;
    return Objects.equals(this.id, quotation.id) &&
        Objects.equals(this.product, quotation.product) &&
        Objects.equals(this.quantity, quotation.quantity) &&
        Objects.equals(this.price, quotation.price) &&
        Objects.equals(this.shipment, quotation.shipment) &&
        Objects.equals(this.mode, quotation.mode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, product, quantity, price, shipment, mode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Quotation {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    shipment: ").append(toIndentedString(shipment)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

